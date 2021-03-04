package swing_study_layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class JTextFieldAreaEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField TfName;
	private JPasswordField PfPass1;
	private JPasswordField PfPass2;
	private JPanel Ta;
	private JTextArea ta;
	private JLabel lblConfirm;
	private JDateChooser dateChooser;
	private JButton btnAdd;
	private JButton btnCancel;

	public JTextFieldAreaEx() {
		initialize();
	}

	private void initialize() {
		setTitle("텍스트필드관련");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new BorderLayout(10, 0));

		JScrollPane scrollPane = new JScrollPane();
		pCenter.add(scrollPane, BorderLayout.CENTER);

		ta = new JTextArea();
		ta.setLineWrap(true);
		scrollPane.setViewportView(ta);

		JPanel pNorth = new JPanel();
		pNorth.setPreferredSize(new Dimension(400, 200));
		pNorth.setBorder(new EmptyBorder(10, 20, 10, 20));
		contentPane.add(pNorth, BorderLayout.NORTH);
		pNorth.setLayout(new GridLayout(0, 2, 10, 10));

		JLabel lblName = new JLabel("성명");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblName);

		TfName = new JTextField();
		pNorth.add(TfName);
		TfName.setColumns(10);

		JLabel lblPass1 = new JLabel("비밀번호");
		lblPass1.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblPass1);

		PfPass1 = new JPasswordField();
		PfPass1.setEchoChar('$');
		PfPass1.getDocument().addDocumentListener(listener);
		pNorth.add(PfPass1);

		JLabel lblPass2 = new JLabel("비밀번호확인");
		lblPass2.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblPass2);

		PfPass2 = new JPasswordField();
		PfPass2.setEchoChar('$');
		PfPass2.getDocument().addDocumentListener(listener);
		pNorth.add(PfPass2);

		Ta = new JPanel();
		pNorth.add(Ta);

		lblConfirm = new JLabel("\"\"");
		lblConfirm.setFont(new Font("굴림", Font.BOLD, 12));
		lblConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirm.setForeground(Color.RED);
		pNorth.add(lblConfirm);

		JLabel lblBirth = new JLabel("생년월일");
		lblBirth.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblBirth);

		dateChooser = new JDateChooser(new Date());
		dateChooser.setDateFormatString("yyyy. MM. dd");
		pNorth.add(dateChooser);

		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pNorth.add(btnAdd);

		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		pNorth.add(btnCancel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancel) {
			actionPerformedBtnCancel(e);
		}
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}

	}

	protected void actionPerformedBtnAdd(ActionEvent e) {
		if (lblConfirm.getText().equals("일치")) {
			Date d = dateChooser.getDate();
			String msg = String.format("%s - %tF%n", TfName.getText(), d);
			ta.append(msg);
			clearTf();
		} else {
			PfPass2.setText("");
			PfPass1.requestFocus();
			PfPass1.selectAll();
		}

	}

	public void clearTf() {
		TfName.setText("");
		PfPass1.setText("");
		PfPass2.setText("");
		dateChooser.setDate(new Date());
		lblConfirm.setText("");
		TfName.requestFocus();
	}

	protected void actionPerformedBtnCancel(ActionEvent e) {
		clearTf();
	}

	DocumentListener listener = new DocumentListener() {
		
		@Override
		public void removeUpdate(DocumentEvent e) {
			getMessage();
		}
		
		@Override
		public void insertUpdate(DocumentEvent e) {
			getMessage();
		}
		
		@Override
		public void changedUpdate(DocumentEvent e) {
			getMessage();
		}

		private void getMessage() {
			String pw1 =new String (PfPass1.getPassword());
			String pw2 = String.valueOf(PfPass2.getPassword());
			if(pw1.equals(pw2)) {
				lblConfirm.setText("일치");
			}else
				lblConfirm.setText("불일치");
		}
	};
}


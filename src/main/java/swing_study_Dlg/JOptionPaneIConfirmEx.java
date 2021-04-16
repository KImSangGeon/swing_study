package swing_study_Dlg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class JOptionPaneIConfirmEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblRes;

	public JOptionPaneIConfirmEx() {
		initialize();
	}
	private void initialize() {
		setTitle("Confirm");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		lblRes = new JLabel("");
		lblRes.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(lblRes);
		
		btnNewButton = new JButton("ㅇㅇ");
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		/*YES_NO_OPTION, YES_NO_CANCEL_OPTION, OK_CANCEL_OPTION
		 * 
		 */
		
		String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;
		ImageIcon icon = new ImageIcon(imgPath + "Shin.jpg");
		
		int res =
				JOptionPane.showConfirmDialog(
						null,
						"계속 할것입니까?",
						"Confirm",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.WARNING_MESSAGE,
						icon);
		if(res == JOptionPane.YES_OPTION) {
			lblRes.setText("YES");			
		}
		if(res == JOptionPane.NO_OPTION) {
			lblRes.setText("NO");			
		}
		if(res == JOptionPane.CANCEL_OPTION) {
			lblRes.setText("CANCEL");			
		}
		System.out.println(res);
	}
}

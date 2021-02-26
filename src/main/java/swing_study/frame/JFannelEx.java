package swing_study.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study.Pannel.Department;
import swing_study.Pannel.DeptPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFannelEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnSetDept;
	private JButton btnGetDept;
	private DeptPanel Pdept;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */

	public JFannelEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(550, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Pdept = new DeptPanel();
		contentPane.add(Pdept, BorderLayout.CENTER);
		
		JPanel Pbtn = new JPanel();
		contentPane.add(Pbtn, BorderLayout.SOUTH);
		
		btnSetDept = new JButton("부서설정");
		btnSetDept.addActionListener(this);
		Pbtn.add(btnSetDept);
		
		btnGetDept = new JButton("부서가져오기");
		btnGetDept.addActionListener(this);
		Pbtn.add(btnGetDept);
		
		btnClear = new JButton("초기화");
		btnClear.addActionListener(this);
		Pbtn.add(btnClear);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnClear) {
			actionPerformedBtnClear(e);
		}
		if (e.getSource() == btnGetDept) {
			actionPerformedBtnGetDept(e);
		}
		if (e.getSource() == btnSetDept) {
			actionPerformedBtnSetDept(e);
		}
	}
	protected void actionPerformedBtnSetDept(ActionEvent e) {
		Department dept = new Department(1, "기획", 9);
		Pdept.setDepartment(dept);
		
	}
	protected void actionPerformedBtnGetDept(ActionEvent e) {
		Department dept = Pdept.getDepartment();
		JOptionPane.showMessageDialog(null, dept);
	}
	protected void actionPerformedBtnClear(ActionEvent e) {
		Pdept.clearTf();
	}
}

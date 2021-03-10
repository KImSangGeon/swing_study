package swing_study_component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;

import swing_study.Pannel.Department;
import swing_study.Pannel.DeptPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class JListEx3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private DefaultListModel<Department> model;
	private JPanel pBtnS;
	private DeptPanel pLeftCenter;
	private JButton btnAdd;

	public JListEx3() {
		initialize();

		model.addElement(new Department(1, "기획", 8));
		model.addElement(new Department(2, "영업", 18));
		model.addElement(new Department(3, "개발", 28));
	}

	private void initialize() {
		setTitle("JList응용");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 801, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));		
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
	

		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));

		pLeftCenter = new DeptPanel();
		pLeft.add(pLeftCenter, BorderLayout.CENTER);

		JPanel pLeftSouth = new JPanel();
		pLeft.add(pLeftSouth, BorderLayout.SOUTH);

		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pSouth.add(btnAdd);

		JPanel pRight = new JPanel();
		contentPane.add(pRight);
		model = new DefaultListModel<Department>();
		pRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		pCmb_1 = new JPanel();
		pRight.add(pCmb_1);
		
		cmbDept = new JComboBox<Department>();
		pCmb_1.add(cmbDept);

		pBtnS = new JPanel();
		pRight.add(pBtnS);
		pBtnS.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAdd = new JButton("확인");
		pBtnS.add(btnAdd);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdd) {
			if (btnAdd.getText().equals("추가"))
				actionPerformedBtnAdd(e);
			else
				actionPerformedUpdate(e);
		}

	}

	private void actionPerformedUpdate(ActionEvent e) {
		Department updateDept = pLeftCenter.getDepartment();
		int idx = deptList.getSelectedIndex();
		model.set(idx, updateDept);
		pLeftCenter.clearTf();
		if(btnAdd.getText().equals("수정")) {
			btnAdd.setText("추가");
		}
		JOptionPane.showMessageDialog(null, "수정 되었습니다.");
	}

	protected void actionPerformedBtnAdd(ActionEvent e) {
		Department dept = pLeftCenter.getDepartment();
//		JOptionPane.showMessageDialog(null, dept);		
		pLeftCenter.clearTf();
		model.addElement(dept);
		
		JOptionPane.showMessageDialog(null, "추가 되었습니다.");

	}
}

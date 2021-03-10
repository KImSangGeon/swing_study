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
	private JList<Department> deptList;
	private JPanel pBtnS;
	private DeptPanel pLeftCenter;
	private JButton btnAdd;
	private JButton btnConfirm;
	private JButton btnUpdate;
	private JButton btnDelete;

	public JListEx3() {
		initialize();

		model.addElement(new Department(1, "기획", 8));
		model.addElement(new Department(2, "영업", 18));
		model.addElement(new Department(3, "개발", 28));
	}

	private void initialize() {
		setTitle("JList응용");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 896, 543);
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
		pLeftSouth.add(btnAdd);

		JPanel pRight = new JPanel();
		pRight.setBorder(new TitledBorder(null, "부서목록", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		contentPane.add(pRight);
		
		deptList = new JList();
		deptList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		model = new DefaultListModel<Department>();
		pRight.setLayout(new BorderLayout(0, 0));
		deptList.setModel(model);		
		pRight.add(deptList);
		
		pBtnS = new JPanel();
		pRight.add(pBtnS, BorderLayout.SOUTH);
		
		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(this);
		pBtnS.add(btnConfirm);
		
		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(this);
		pBtnS.add(btnUpdate);
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(this);
		pBtnS.add(btnDelete);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnDelete) {
			actionPerformedBtnDelete(e);
		}
		if (e.getSource() == btnUpdate) {
			actionPerformedBtnUpdate(e);
		}
		if (e.getSource() == btnConfirm) {
			actionPerformedBtnConfirm(e);
		}
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
		JOptionPane.showMessageDialog(null, "수정 되었습니다");
	
	}

	protected void actionPerformedBtnAdd(ActionEvent e) {
		Department dept = pLeftCenter.getDepartment();
//		JOptionPane.showMessageDialog(null, dept);		
		pLeftCenter.clearTf();
		model.addElement(dept);
		
		JOptionPane.showMessageDialog(null, "추가 되었습니다.");

	}
	protected void actionPerformedBtnConfirm(ActionEvent e) {
		Department dept = deptList.getSelectedValue();
		String message = String.format("%d %s %d", dept.getDeptNo(), dept.getDeptName(), dept.getFloor());
		JOptionPane.showMessageDialog(null, message);
		
	}
	protected void actionPerformedBtnUpdate(ActionEvent e) {
		Department dept = deptList.getSelectedValue();
		pLeftCenter.setDepartment(dept);
		
		if(btnAdd.getText().equals("추가")) {
			btnAdd.setText("수정");
		}
	}
	protected void actionPerformedBtnDelete(ActionEvent e) {
		Department dept = deptList.getSelectedValue();
		model.removeElement(dept);
		JOptionPane.showMessageDialog(null, "삭제 되었습니다.");
	}
}

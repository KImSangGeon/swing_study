package swing_study_component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study.Pannel.Department;
import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import swing_study.Pannel.DeptPanel;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JComboBoxEx3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private List<Department> deptList;
	private JComboBox<Department> cmbDept;
	private JButton btnOk;
	private DeptPanel pdept;
	private JButton btnAdd;

	public JComboBoxEx3() {
		deptList = new ArrayList<Department>();
		deptList.add(new Department(1, "기획", 8));
		deptList.add(new Department(2, "영업", 18));
		deptList.add(new Department(3, "개발", 28));

		initialize();
		cmbDept.setModel(new DefaultComboBoxModel<Department>(new Vector<>(deptList)));
		cmbDept.setSelectedIndex(-1);

	}

	private void initialize() {
		setTitle("JComboBox 실전예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));

		pdept = new DeptPanel();
		pLeft.add(pdept, BorderLayout.CENTER);

		JPanel pBtn = new JPanel();
		pLeft.add(pBtn, BorderLayout.SOUTH);

		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pBtn.add(btnAdd);

		JPanel pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel = new JPanel();
		pRight.add(panel);

		cmbDept = new JComboBox<>();
		panel.add(cmbDept);

		JPanel panel_1 = new JPanel();
		pRight.add(panel_1);

		btnOk = new JButton("확인");
		panel_1.add(btnOk);
		btnOk.addActionListener(this);
	}



	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}
		if (e.getSource() == btnOk) {
			actionPerformedBtnOk(e);
		}
		
	
	}

	protected void actionPerformedBtnOk(ActionEvent e) {
		Department selDept = (Department) cmbDept.getSelectedItem();
		String message = String.format("%s %s %s%n", selDept.getDeptNo(), selDept.getDeptName(), selDept.getFloor());
		JOptionPane.showMessageDialog(null, message);
	}
	protected void actionPerformedBtnAdd(ActionEvent e) {
		Department addDept = pdept.getDepartment();

		if (deptList.contains(addDept)) {
			JOptionPane.showMessageDialog(null, "중복 아이템");
			return;
		}
		DefaultComboBoxModel<Department> model = (DefaultComboBoxModel<Department>) cmbDept.getModel();
		model.addElement(addDept);

		pdept.clearTf();
		JOptionPane.showMessageDialog(null, "추가 되었습니다.");
	}
}

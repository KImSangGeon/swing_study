package swing_study_component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import swing_study.Pannel.Department;
import swing_study.Pannel.Employee;
import swing_study.Pannel.Title;
import swing_study_component_table.DeptTablePanel;
import swing_study_component_table.EmpTablePanel;
import swing_study_component_table.MyTablePanel;
import swing_study_component_table.Student;
import swing_study_component_table.TitleTablePanel;
import swing_study_component_table.EmpTablePanel2;

@SuppressWarnings("serial")
public class JTableEx extends JFrame {

	private JPanel contentPane;
	private JTable table1;
	private List<Student> stdList = new ArrayList<>();
	private List<Department> deptList = new ArrayList<>();
	private List<Title> titleList = new ArrayList<>();
	private List<Employee> empList = new ArrayList<>();
	private List<Employee> empList2 = new ArrayList<>();
	

	public JTableEx() {
		
		stdList.add(new Student(1, "김인환", 60, 60, 60));
		stdList.add(new Student(2, "이태훈", 70, 71, 70));
		stdList.add(new Student(3, "김상건", 98, 92, 100));
		stdList.add(new Student(4, "전수린", 60, 63, 67));
		
		deptList.add(new Department(1, "개발", 8));
		deptList.add(new Department(2, "인사", 18));
		deptList.add(new Department(3, "총무", 28));
		
		titleList.add(new Title(1, "사장"));
		titleList.add(new Title(2, "부장"));
		titleList.add(new Title(3, "과장"));
		titleList.add(new Title(4, "대리"));
		titleList.add(new Title(5, "사원"));
		
		empList.add(new Employee(1, "김상건", titleList.get(0), null, 4500000,deptList.get(0) ));
		empList.add(new Employee(2, "이성래", titleList.get(1), new Employee(1, "김상건"), 4500000,deptList.get(1) ));
		empList.add(new Employee(3, "이성래", titleList.get(2), new Employee(2, "김상건"), 2500000, deptList.get(2)));
	
		empList2.add(new Employee(1, "김상건", titleList.get(0), null, 6000000, deptList.get(0) ));
		empList2.add(new Employee(2, "김수정", titleList.get(1), new Employee(1, "김상건"), 1000000, deptList.get(1) ));
		
		
		
		initialize();
	}

	private void initialize() {
		setTitle("JTable 예 ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 10));

		JPanel PTable1 = new JPanel();
		PTable1.setBorder(new TitledBorder(null, "기본테이블 생성", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(PTable1);
		PTable1.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane1 = new JScrollPane();
		PTable1.add(scrollPane1, BorderLayout.CENTER);

		table1 = new JTable();
		table1.setModel(getModel());
		scrollPane1.setViewportView(table1);

		JPanel PTable2 = new JPanel();
		contentPane.add(PTable2);
		PTable2.setLayout(new BorderLayout(0, 0));
		
		MyTablePanel pCustomPanel2 = new MyTablePanel();
		pCustomPanel2.setList(stdList);
		pCustomPanel2.setBorder(new TitledBorder(null, "Custom Table", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PTable2.add(pCustomPanel2, BorderLayout.CENTER);

		JPanel PTable3 = new JPanel();
		contentPane.add(PTable3);
		PTable3.setLayout(new BorderLayout(0, 0));
		
		DeptTablePanel pDeptTable3 = new DeptTablePanel();
		// deptList  추가, 셀렉트한 셜과를 던져주기
		pDeptTable3.setList(deptList);
		PTable3.add(pDeptTable3, BorderLayout.CENTER);

		JPanel PTable4 = new JPanel();
		contentPane.add(PTable4);
		PTable4.setLayout(new BorderLayout(0, 0));
		
		TitleTablePanel pTitleTable4 = new TitleTablePanel();
		pTitleTable4.setList(titleList);
		PTable4.add(pTitleTable4, BorderLayout.CENTER);
		
		JPanel pTable5 = new JPanel();
		contentPane.add(pTable5);
		pTable5.setLayout(new BorderLayout(0, 0));
		
		EmpTablePanel pEmpTable = new EmpTablePanel();
		pEmpTable.setList(empList);
		pTable5.add(pEmpTable, BorderLayout.CENTER);
		
		JPanel pTable6 = new JPanel();
		contentPane.add(pTable6);
		pTable6.setLayout(new BorderLayout(0, 0));
		
		EmpTablePanel2 pEmpTable2 = new EmpTablePanel2();
		pEmpTable2.setList(empList2);
		pTable6.add(pEmpTable2, BorderLayout.CENTER);
	}

	public DefaultTableModel getModel() {
		CustomTableModel model = new CustomTableModel(getData(), getColmnNames());
		return model;
	}

	@SuppressWarnings("serial")
	class CustomTableModel extends DefaultTableModel {

		public CustomTableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}

	}

	public Object[][] getData() {
		return new Object[][] { { 1, "박유진", 10, "여자" }, { 2, "이태훈", 11, "남자" }, };
	}

	public String[] getColmnNames() {
		return new String[] { "학생번호", "학생명", "나이", "성별" };
	}

}

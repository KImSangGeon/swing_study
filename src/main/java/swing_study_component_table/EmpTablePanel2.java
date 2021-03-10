package swing_study_component_table;

import javax.swing.SwingConstants;

import swing_study.Pannel.Employee;

@SuppressWarnings("serial")
public class EmpTablePanel2 extends AbstractCustomTablePanel<Employee> {

	@Override
	public String[] getColumnNames() {
		return new String[] {"사번", "사원명","직책", "직속상사", "급여", "부서"};
	}
//	int empNo, String empName, Title title, Employee manager, int salary, Department dept
	@Override
	protected void setAlignAndWidth() {
		//컬럼내용 정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3, 5);
		setTableCellAlign(SwingConstants.RIGHT, 4 );
		
		//컬럼별 너비 조정
		setTableCellWidth(100, 250, 200, 250, 250, 150);
		
	}
	@Override
	protected Object[] toArray(Employee t) {
		return new Object[] {
				t.getEmpNo(),
				t.getEmpName(),
				String.format("%s(%d)", t.getTitle().gettName(), t.getTitle().gettNo()),
				t.getManager()==null?"" :t.getManager().getEmpName(),
				String.format("%,d", t.getSalary()),
				String.format("%s(%d)", t.getDept().getDeptName(),t.getDept().getDeptNo())				
		};
	}

}

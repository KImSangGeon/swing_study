package swing_study_component_table;

import javax.swing.table.DefaultTableModel;

public class Student {
	private int stdNo;
	private String stdName;
	private int kor;
	private int	eng;
	private int math;
	
	public Student() {
		super();
	}

	public Student(int stdNo) {
		this.stdNo = stdNo;
	}

	public Student(int stdNo, String stdName, int kor, int eng, int math) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public double getAvg() {
		return getTotal()/3;
	}

	@Override
	public String toString() {
		return String.format(
				"Student [stdNo=%s, stdName=%s, kor=%s, eng=%s, math=%s, getStdNo()=%s, getStdName()=%s, getKor()=%s, getEng()=%s, getMath()=%s, getTotal()=%s, getAvg()=%s]",
				stdNo, stdName, kor, eng, math, getStdNo(), getStdName(), getKor(), getEng(), getMath(), getTotal(),
				getAvg());
	}

	
		


}

package swing_study.Pannel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import com.toedter.calendar.JDateChooser;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Dimension;

public class EmployeePanel extends JPanel {
	private JPanel pItem;
	private JPanel panel;
	private JLabel lblNo;
	private JTextField tFNo;
	private JLabel lblName;
	private JTextField tFName;
	private JLabel lblTitle;
	private JComboBox cmbTitle;
	private JLabel lblManager;
	private JComboBox cmbManager;
	private JLabel lblSalary;
	private JSpinner spinSalary;
	private JLabel lblDept;
	private JComboBox cmbDept;
	private JLabel lblHireDate;
	private JLabel lblPass1;
	private JPasswordField pfPass1;
	private JLabel lblPass2;
	private JPasswordField pfPass2;
	private JDateChooser dateChooser;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JPanel panel_3;
	private JLabel lblNewLabel_1;
	private JPanel panel_4;
	private JButton btnNewButton;

	
	public EmployeePanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "직원정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setPreferredSize(new Dimension(100, 120));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_1, BorderLayout.CENTER);
		
		panel_4 = new JPanel();
		panel_3.add(panel_4, BorderLayout.SOUTH);
		
		btnNewButton = new JButton("사진추가");
		panel_4.add(btnNewButton);
		
		pItem = new JPanel();
		add(pItem);
		pItem.setLayout(new GridLayout(0, 2, 10, 0));
		
		lblNo = new JLabel("사원번호");
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblNo);
		
		tFNo = new JTextField();
		tFNo.setColumns(10);
		pItem.add(tFNo);
		
		lblName = new JLabel("사원명");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblName);
		
		tFName = new JTextField();
		tFName.setColumns(10);
		pItem.add(tFName);
		
		lblTitle = new JLabel("직책");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblTitle);
		
		cmbTitle = new JComboBox();
		pItem.add(cmbTitle);
		
		lblManager = new JLabel("직속상사");
		lblManager.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblManager);
		
		cmbManager = new JComboBox();
		pItem.add(cmbManager);
		
		lblSalary = new JLabel("급여");
		lblSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblSalary);
		
		spinSalary = new JSpinner();
		pItem.add(spinSalary);
		
		lblDept = new JLabel("부서");
		lblDept.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblDept);
		
		cmbDept = new JComboBox();
		pItem.add(cmbDept);
		
		lblHireDate = new JLabel("입사일");
		lblHireDate.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblHireDate);
		
		dateChooser = new JDateChooser();
		pItem.add(dateChooser);
		
		lblPass1 = new JLabel("비밀번호");
		lblPass1.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblPass1);
		
		pfPass1 = new JPasswordField();
		pfPass1.setColumns(10);
		pItem.add(pfPass1);
		
		lblPass2 = new JLabel("비밀번호확인");
		lblPass2.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblPass2);
		
		pfPass2 = new JPasswordField();
		pfPass2.setColumns(10);
		pItem.add(pfPass2);
		
		panel_1 = new JPanel();
		pItem.add(panel_1);
		
		panel_2 = new JPanel();
		pItem.add(panel_2);
		
		lblNewLabel = new JLabel("New label");
		panel_2.add(lblNewLabel);
	}
	
	public void setTitle(Employee employee) {
		
	}
	public Employee getEmployee() {
		return null;
	}
	public void clearTF() {
		
	}

}

package swing_study_component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.time.DayOfWeek;
import java.awt.event.ItemEvent;

public class JSpinnerEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JSpinner spinner3;

	public JSpinnerEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JSpinner 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pSpinner1 = new JPanel();
		contentPane.add(pSpinner1);
		
		JSpinner Spinner1 = new JSpinner();
		Spinner1.setModel(new SpinnerListModel(new String[] {"소설", "잡지", "전공서적", "취미"}));
		pSpinner1.add(Spinner1);
		
		JPanel pSpinner2 = new JPanel();
		contentPane.add(pSpinner2);
		
		JSpinner Spinner2 = new JSpinner();
		Spinner2.setModel(new SpinnerNumberModel(1500000, 0, 4000000, 10));
		pSpinner2.add(Spinner2);
		
		JPanel pSpinner3 = new JPanel();
		contentPane.add(pSpinner3);
		
		spinner3 = new JSpinner();
		
		Calendar cal = Calendar.getInstance();
		Date value = cal.getTime();
		
		cal.add(Calendar.YEAR, -50);
		Date start = cal.getTime();
		
		cal.add(Calendar.YEAR, 50);
		Date end = cal.getTime();
		
		System.out.println(value + "\n" + start + "\n" + end);
		pSpinner3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JSpinner Spinner3 = new JSpinner();
		
		Spinner3.setModel(new SpinnerDateModel(value, start, end,  Calendar.YEAR));
		Spinner3.setEditor(new JSpinner.DateEditor(Spinner3, "yyyy"));
		pSpinner3.add(Spinner3);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(this);
		comboBox.setMaximumRowCount(3);
		pSpinner3.add(comboBox);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == comboBox) {
			itemStateChangedComboBox(e);
		}
	}
	protected void itemStateChangedComboBox(ItemEvent e) {
		Object unit = comboBox.getSelectedItem();
		if(unit.equals("년")) {
		Calendar cal = Calendar.getInstance();
		Date value = cal.getTime();
		
		cal.add(Calendar.YEAR, -50);
		Date start = cal.getTime();
		
		cal.add(Calendar.YEAR, 100);
		Date end = cal.getTime();
		
		spinner3.setModel(new SpinnerDateModel(value, start, end, Calendar.YEAR));
		spinner3.setEditor(new JSpinner.DateEditor(spinner3, "yyyy-MM-dd"));
		
		}
		if(unit.equals("월")) {
			Calendar cal = Calendar.getInstance();
			Date value = cal.getTime();
			
			cal.add(Calendar.MONTH, 0);
			Date start = cal.getTime();
			
			cal.add(Calendar.MONTH, 11);
			Date end = cal.getTime();
			
		
			spinner3.setModel(new SpinnerDateModel(value, start, end, Calendar.MONTH));
			spinner3.setEditor(new JSpinner.DateEditor(spinner3, "MM"));
		
		}
					
		
		if(unit.equals("일")) {
			Calendar cal = Calendar.getInstance();
			Date value = cal.getTime();
			
			cal.add(Calendar.DAY_OF_MONTH, 1);
			Date start = cal.getTime();
			
			cal.add(Calendar.DAY_OF_MONTH, cal.getMaximum(Calendar.DAY_OF_MONTH));
			Date end = cal.getTime();
		
			
			
			spinner3.setModel(new SpinnerDateModel(value, start, end, Calendar.DAY_OF_MONTH));
			spinner3.setEditor(new JSpinner.DateEditor(spinner3, "dd"));
			}
	
					
	}
}

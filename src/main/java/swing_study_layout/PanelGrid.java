package swing_study_layout;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelGrid extends JPanel {
	private JTextField tFName;
	private JTextField tFNo;
	private JTextField tFClass;
	private JTextField tFSubject;

	/**
	 * Create the panel.
	 */
	public PanelGrid() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblName = new JLabel("이름");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblName);
		
		tFName = new JTextField();
		add(tFName);
		tFName.setColumns(10);
		
		JLabel lblNo = new JLabel("학번");
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNo);
		
		tFNo = new JTextField();
		tFNo.setColumns(10);
		add(tFNo);
		
		JLabel lblClass = new JLabel("학과");
		lblClass.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblClass);
		
		tFClass = new JTextField();
		tFClass.setColumns(10);
		add(tFClass);
		
		JLabel lblSubject = new JLabel("과목");
		lblSubject.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblSubject);
		
		tFSubject = new JTextField();
		tFSubject.setColumns(10);
		add(tFSubject);
	}

}

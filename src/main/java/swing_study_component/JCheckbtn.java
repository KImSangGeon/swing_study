package swing_study_component;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.SwingConstants;

public class JCheckbtn extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox Checkapple;
	private int sum;
	private JLabel lblRes;
	private String resStr = "현재 %d 0입니다.";
	private JCheckBox Checkpear;
	private JCheckBox Checkcherry;


	public JCheckbtn() {
		initialize();
		Checkcherry.setSelected(true);
		
		
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel lblTItle = new JLabel("사과 100원 배 500원 체리2000원");
		panel.add(lblTItle);
		
		JPanel pItem = new JPanel();
		panel.add(pItem);
		
		Checkapple = new JCheckBox("사과");
		Checkapple.addItemListener(this);
		pItem.add(Checkapple);
		
		Checkpear = new JCheckBox("배");
		Checkpear.addItemListener(this);
		pItem.add(Checkpear);
		
		Checkcherry = new JCheckBox("체리");
		Checkcherry.addItemListener(this);
		pItem.add(Checkcherry);
		
		lblRes = new JLabel(resStr);
		lblRes.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblRes);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == Checkcherry) {
			itemStateChangedCherry(e);
		}
		if (e.getSource() == Checkpear) {
			itemStateChangedPear(e);
		}
		if (e.getSource() == Checkapple) {
			itemStateChangedApple(e);
		}
		resStr = String.format("현재 %d 원입니다.", sum);
		lblRes.setText(resStr);
	}
	protected void itemStateChangedApple(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			sum+= 100;
			
		}else {
			sum-= 100;			
		}
		
	}
	protected void itemStateChangedPear(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			sum+= 500;
			
		}else {
			sum-= 500;			
		}
		
	}
	protected void itemStateChangedCherry(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			sum+= 2000;
			
		}else {
			sum-= 2000;			
		}
	}
}

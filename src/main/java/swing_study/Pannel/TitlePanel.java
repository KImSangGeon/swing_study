package swing_study.Pannel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class TitlePanel extends JPanel {
	private JTextField tFNo;
	private JTextField tFName;

	
	public TitlePanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "직책정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblNo = new JLabel("직책번호");
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNo);
		
		tFNo = new JTextField();
		add(tFNo);
		tFNo.setColumns(10);
		
		JLabel lalName = new JLabel("직책이름");
		lalName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lalName);
		
		tFName = new JTextField();
		tFName.setColumns(10);
		add(tFName);
	}
	
	public void setTitle(Title title) {
		tFNo.setText(title.gettNo()+ "");
		tFName.setText(title.gettName());
		
		
	}
	public Title getTitle() {
		int tNo = Integer.parseInt(tFNo.getText().trim());
		String tName = tFName.getText().trim();
		return new Title(tNo,tName);
	}
	public void clearTF() {
		tFNo.setText("");
		tFName.setText("");
		
	}

}

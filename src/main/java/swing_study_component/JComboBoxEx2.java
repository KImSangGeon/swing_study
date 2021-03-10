package swing_study_component;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class JComboBoxEx2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox<String> cmb;
	private JLabel lblImg;
	private String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;
	private Map<String, ImageIcon> map = new HashMap<String, ImageIcon>();
	
	
	private ImageIcon[] icons = { 
			new ImageIcon(imgPath + "apple.jpg"),
			new ImageIcon(imgPath + "pear.jpg"),
			new ImageIcon(imgPath + "cherry.jpg")
			};

	
	
	private String[] fruits = {"apple","pear", "cherry"};

	public JComboBoxEx2() {
		for(int i = 0; i<icons.length; i++) {
			map.put(fruits[i], icons[i]);
		}
		initialize();
		
	}
	private void initialize() {
		setTitle("JComboBox 이벤트예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel pNorth = new JPanel();
		contentPane.add(pNorth, BorderLayout.NORTH);
		
		
		cmb = new JComboBox<>();
		cmb.setModel (new DefaultComboBoxModel<String>(fruits));
		cmb.setSelectedIndex(-1);
		cmb.addActionListener(this);
		pNorth.add(cmb);

		lblImg = new JLabel("");
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblImg, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cmb) {
			actionPerformedCmv(e);
		}
	}

	protected void actionPerformedCmv(ActionEvent e) {
		Object obj = cmb.getSelectedItem();
		lblImg.setIcon(map.get(obj));
		
	}
}

package swing_study_component;

import java.io.File;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JListEx extends JFrame implements ActionListener {

	private JPanel contentPane;

	private String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;// 리눅스랑 경로 구분이;
	private ImageIcon[] icons = {
			new ImageIcon(imgPath + "icon1.jpg"),
			new ImageIcon(imgPath + "icon2.jpg"),
			new ImageIcon(imgPath + "icon3.jpg"),
			new ImageIcon(imgPath + "icon4.jpg")
	};		
	private String[] fruits = new String[] {"apple", "banana", "krwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private JButton pBtn01;
	private JList<String> strList;
	
	public JListEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JList예제1");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 0));
		
		strList = new JList<>();
		strList.setListData(fruits);
		contentPane.add(strList);
		
		JList<ImageIcon> list = new JList();
		list.setListData(icons);
		contentPane.add(list);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		pBtn01 = new JButton("New button");
		pBtn01.addActionListener(this);
		panel.add(pBtn01);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pBtn01) {
			actionPerformedPBtn01(e);
		}
	}
	protected void actionPerformedPBtn01(ActionEvent e) {
		int idx = strList.getSelectedIndex();
		String selStr = strList.getSelectedValue();
		List<String> selectedList = strList.getSelectedValuesList();
		String message =  String.format("index = %d%n selectedValue %s%n selectedLIst %s%n ", idx, selStr, selectedList);
		JOptionPane.showMessageDialog(null, message);
		
	
	}
}

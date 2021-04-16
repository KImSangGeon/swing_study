package swing_study_Menu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JMenuFrameEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuItem mntmRoad;
	private JLabel imgLabel = new JLabel();
	private JMenuItem mntmHide;
	private JMenuItem mntmReshow;
	private JMenuItem mntmExit;
	private String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;

	public JMenuFrameEx() {
		initialize();
	};
	
	
	public void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnScreen = new JMenu("Screen");
		menuBar.add(mnScreen);
		
		mntmRoad = new JMenuItem("Road");
		mntmRoad.addActionListener(this);
		mnScreen.add(mntmRoad);
		
		mntmHide = new JMenuItem("Hide");
		mntmHide.addActionListener(this);
		mnScreen.add(mntmHide);
		
		mntmReshow = new JMenuItem("Reshow");
		mntmReshow.addActionListener(this);
		mnScreen.add(mntmReshow);
		
		JSeparator separator = new JSeparator();
		mnScreen.add(separator);
		
		mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(this);
		mnScreen.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		imgLabel = new JLabel();
		contentPane.add(imgLabel);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmExit) {
			actionPerformedMntmExit(e);
		}
		if (e.getSource() == mntmReshow) {
			actionPerformedMntmReshow(e);
		}
		if (e.getSource() == mntmHide) {
			actionPerformedMntmHide(e);
		}
		if (e.getSource() == mntmRoad) {
			actionPerformedMntmRoad(e);
		}
	}
	protected void actionPerformedMntmRoad(ActionEvent e) {
		if(imgLabel.getIcon() != null) {
			return;
		}
		ImageIcon icon = new ImageIcon(imgPath +"Shin.jpg" );
			imgLabel.setIcon(icon);		
				
	}
	protected void actionPerformedMntmHide(ActionEvent e) {
		imgLabel.setVisible(false);
	}
	protected void actionPerformedMntmReshow(ActionEvent e) {
		imgLabel.setVisible(true);
	}
	protected void actionPerformedMntmExit(ActionEvent e) {
		System.exit(0);
	}
}

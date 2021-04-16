package swing_study_Menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JPopupMenuEx extends JFrame {

	private JPanel contentPane;
	private JLabel imgLabel = new JLabel();
	
	
	public JPopupMenuEx() {
		setTitle("팝업메뉴");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.setComponentPopupMenu(createPopupMenu());
		contentPane.add(imgLabel, BorderLayout.SOUTH);
	}


	private JPopupMenu createPopupMenu() {
		JPopupMenu popupMenu = new JPopupMenu();
			
		
		
		screen = new JMenuItem("Road");
		screen.addActionListener(listener);
		popupMenu.add(screen);
		
		screen = new JMenuItem("Hide");
		screen.addActionListener(listener);
		popupMenu.add(screen);
		
		screen = new JMenuItem("Reshow");
		screen.addActionListener(listener);
		popupMenu.add(screen);
		
		JSeparator separator = new JSeparator();
		popupMenu.add(separator);
		
		screen = new JMenuItem("Exit");
		screen.addActionListener(listener);
		popupMenu.add(screen);
		
		return popupMenu;
	}
	
	ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("Road")) {
				System.out.println("Road");
			
				String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;
				ImageIcon icon = new ImageIcon(imgPath + "Shin.jpg");				
					imgLabel.setIcon(icon);						
					
					JPopupMenuEx.this.invalidate();					
			}else if(e.getActionCommand().equals("Hide")) {
				System.out.println("Hide");
				imgLabel.setVisible(false);
			}else if(e.getActionCommand().equals("Reshow")) {
				System.out.println("Reshow");
				imgLabel.setVisible(true);
			}else if(e.getActionCommand().equals("Exit")){
				System.out.println("Exit");
				System.exit(0);
			}
		}
	};
	private JMenuItem screen;

}

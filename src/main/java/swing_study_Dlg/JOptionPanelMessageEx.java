package swing_study_Dlg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class JOptionPanelMessageEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn;


	public JOptionPanelMessageEx() {
		initialize();
	}
	private void initialize() {
		setTitle("Message");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 370, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblREs = new JLabel("New label");
		contentPane.add(lblREs, BorderLayout.CENTER);
		
		btn = new JButton("클릭");
		btn.addActionListener(this);
		contentPane.add(btn, BorderLayout.EAST);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			actionPerformedBtn(e);
		}
	}
	protected void actionPerformedBtn(ActionEvent e) {
		
		String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;
		ImageIcon icon = new ImageIcon(imgPath + "Shin.jpg");
		
		
		JOptionPane.showMessageDialog(null,
				"조심하세요",
				"Confirm", JOptionPane.PLAIN_MESSAGE, icon);
		
	}
}

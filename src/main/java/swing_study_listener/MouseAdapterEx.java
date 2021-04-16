package swing_study_listener;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MouseAdapterEx extends JFrame {

	private JPanel contentPane;
	private JLabel la;

	
	public MouseAdapterEx() {
		initialize();
	}
	private void initialize() {
		setTitle("마우스어댑터");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		la = new JLabel("하이");
		la.setBounds(116, 64, 57, 15);
		contentPane.add(la);
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
			}
		});
	}

}

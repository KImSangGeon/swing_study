package swing_study_listener;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class MouseListenerEx extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JLabel la;

	public MouseListenerEx() {
		initialize();
	}
	private void initialize() {
		setTitle("마우스 리스너");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.addMouseListener(this);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		la = new JLabel("하이");
		la.setBounds(80, 73, 57, 15);
		contentPane.add(la);
	}
	public void mouseClicked(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == contentPane) {
			mousePressedContentPane(e);
		}
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mousePressedContentPane(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		la.setLocation(x, y);
		
	}
}

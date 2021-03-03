package swing_study_component;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JButtonEx extends JFrame implements ActionListener {
	private String imgpath = System.getProperty("user.dir") + File.separator + "image" + File.separator;//리눅스랑 경로 구분이 다름  

	private JPanel contentPane;
	private JToggleButton tglbtn;

	public JButtonEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JButton && togle butn ex");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BoxLayout(pLeft, BoxLayout.Y_AXIS));
		
		JButton btn01 = new JButton("call~");
		btn01.setIcon(new ImageIcon(imgpath + "normalIcon.gif"));
		btn01.setRolloverIcon(new ImageIcon(imgpath + "rolloverIcon.gif"));
		btn01.setPressedIcon(new ImageIcon(imgpath + "pressedIcon.gif"));
		pLeft.add(btn01);
		
		tglbtn = new JToggleButton("토글버튼");
		tglbtn.addActionListener(this);
		pLeft.add(tglbtn);
		
		JPanel pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pTop = new JPanel();
		pTop.setBorder(new TitledBorder(null, "수평정렬", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		pRight.add(pTop);
		pTop.setLayout(new GridLayout(0, 3, 0, 0));
		
		MyButton btn2 = new MyButton();
		btn2.setText("Left");
		btn2.setHorizontalAlignment(SwingConstants.LEFT);
		pTop.add(btn2);
		
		MyButton btn3 = new MyButton();
		btn3.setText("center");
		pTop.add(btn3);
		
		MyButton btn4 = new MyButton();
		btn4.setHorizontalAlignment(SwingConstants.RIGHT);
		btn4.setText("right");
		pTop.add(btn4);
		
		JPanel pBottom = new JPanel();
		pBottom.setBorder(new TitledBorder(null, "수직정렬", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pRight.add(pBottom);
		pBottom.setLayout(new GridLayout(0, 3, 0, 0));
		
		MyButton btn5 = new MyButton();
		btn5.setVerticalAlignment(SwingConstants.TOP);
		btn5.setText("Top");
		pBottom.add(btn5);
		
		MyButton btn6 = new MyButton();
		btn6.setText("Center");
		pBottom.add(btn6);
		
		MyButton btn7 = new MyButton();
		btn7.setVerticalAlignment(SwingConstants.BOTTOM);
		btn7.setText("Bottom");
		pBottom.add(btn7);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tglbtn) {
			actionPerformedTdlbun(e);
		}
	}
	protected void actionPerformedTdlbun(ActionEvent e) {
		if(tglbtn.isSelected()) {
			tglbtn.setText("눌렀네");
			}else {
				tglbtn.setText("눌러봐");
			
		}
	}
}

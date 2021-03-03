package swing_study_component;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MyButton extends JButton {
	private String imgpath = System.getProperty("user.dir")
							+ File.separator 
							+ "image" 
							+ File.separator;
																						

	public MyButton() {
		setIcon(new ImageIcon(imgpath + "normalIcon.gif"));
		setRolloverIcon(new ImageIcon(imgpath + "rolloverIcon.gif"));
		setPressedIcon(new ImageIcon(imgpath + "pressedIcon.gif"));
	}

}

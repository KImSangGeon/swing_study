package swing_study_layout;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PanelBorder extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelBorder() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel Center = new JLabel("center");
		Center.setFont(new Font("굴림", Font.BOLD, 20));
		Center.setBackground(Color.RED);
		Center.setOpaque(true);
		Center.setHorizontalAlignment(SwingConstants.CENTER);
		add(Center);
		
		JLabel North = new JLabel("North");
		North.setFont(new Font("굴림", Font.BOLD, 20));
		North.setBackground(Color.ORANGE);
		North.setOpaque(true);    //jlabel은 투명 -> 불투명
		North.setHorizontalAlignment(SwingConstants.CENTER);
		add(North, BorderLayout.NORTH);
		
		JLabel East = new JLabel("east");
		East.setFont(new Font("굴림", Font.BOLD, 20));
		East.setBackground(Color.PINK);
		East.setOpaque(true);
		add(East, BorderLayout.EAST);
		
		JLabel South = new JLabel("south");
		South.setFont(new Font("굴림", Font.BOLD, 20));
		South.setBackground(Color.BLUE);
		South.setOpaque(true);
		add(South, BorderLayout.SOUTH);
		
		JLabel West = new JLabel("west");
		West.setFont(new Font("굴림", Font.BOLD, 20));
		West.setOpaque(true);
		West.setBackground(Color.GREEN);
		add(West, BorderLayout.WEST);
	}

}

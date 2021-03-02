package swing_study_layout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class PanelAbsolute extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelAbsolute() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(259, 52, 57, 15);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(30, 183, 116, 21);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(205, 204, 137, 21);
		add(btnNewButton);
	}
}

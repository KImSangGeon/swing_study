package swing_study_component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JComboBoxEx1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox<String> Cmb1;
	private JComboBox<String> Cmb2;
	private JComboBox<String> Cmb3;
	private JTextField tF1;
	private JTextField tF2;
	private JTextField tF3;

	public JComboBoxEx1() {
		initialize();

		addDatacmb1();
		addDatacmb2();
		addDatacmb3();
	}

	private void addDatacmb1() {
		String[] fruits = { "apple", "banana", "kiwi" };
		for (String f : fruits) {
			Cmb1.addItem(f);
		}
	}

	private void addDatacmb2() {
		String[] fruits = { "apple", "banana", "kiwi" };
		DefaultComboBoxModel<String> cbm = (DefaultComboBoxModel<String>) Cmb2.getModel();
		for (String f : fruits) {
			cbm.addElement(f);
		}
	}

	private void addDatacmb3() {
		List<String> fruits = Arrays.asList("apple", "banana", "kiwi");
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(new Vector<>(fruits));
		Cmb3.setModel(model);

	}

	private void initialize() {
		setTitle("JComboBox 기본예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 10));

		JPanel pCmb1 = new JPanel();
		contentPane.add(pCmb1);

		Cmb1 = new JComboBox<>();
		pCmb1.add(Cmb1);

		tF1 = new JTextField();
		tF1.addActionListener(this);
		pCmb1.add(tF1);
		tF1.setColumns(10);

		JPanel pCmb2 = new JPanel();
		contentPane.add(pCmb2);

		Cmb2 = new JComboBox<>();
		pCmb2.add(Cmb2);

		tF2 = new JTextField();
		tF2.addActionListener(this);
		pCmb2.add(tF2);
		tF2.setColumns(10);

		JPanel pCmb3 = new JPanel();
		contentPane.add(pCmb3);

		Cmb3 = new JComboBox<>();
		pCmb3.add(Cmb3);

		tF3 = new JTextField();
		tF3.addActionListener(this);
		pCmb3.add(tF3);
		tF3.setColumns(10);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tF1) {
			actionPerformedTF1(e);
		}
		if (e.getSource() == tF3) {
			actionPerformedTF3(e);
		}
		if (e.getSource() == tF2) {
			actionPerformedTF2(e);
		}
	}

	protected void actionPerformedTF1(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "tF1");
		String item = tF1.getText().trim();
		Cmb1.addItem(item);
		tF1.setText("");

	}

	protected void actionPerformedTF2(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "tF2");
		String item = tF2.getText().trim();
		Cmb2.addItem(item);
		tF2.setText("");
	}

	protected void actionPerformedTF3(ActionEvent e) {
		String item = tF3.getText().trim();
		DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) Cmb3.getModel();
		model.addElement(item);
		tF3.setText("");
	}
}

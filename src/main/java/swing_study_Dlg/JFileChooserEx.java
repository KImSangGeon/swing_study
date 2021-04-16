package swing_study_Dlg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFileChooserEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblImg;
	private JButton btnOpen;
	private JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));
	
	
	
	public JFileChooserEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JFileChooser");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblImg = new JLabel("");
		contentPane.add(lblImg, BorderLayout.CENTER);
		
		btnOpen = new JButton("불러오기");
		btnOpen.addActionListener(this);
		contentPane.add(btnOpen, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOpen) {
			if(e.getActionCommand().equals("불러오기"))
			actionPerformedBtnOpen(e);			
		}else {
			actionPerformedBtnSave(e);
		}
	}
	
	private void actionPerformedBtnSave(ActionEvent e) {
		//download 폴더에 저장도되록 만약 download폴더가 존재하지 않으면 생성후 저장되도록 하세요.
		
	
	}
	protected void actionPerformedBtnOpen(ActionEvent e) {
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"JPG & PNG & GIF imges",
				"jpg", "png", "gif");
		
		chooser.setFileFilter(filter);
		int res = chooser.showOpenDialog(null);
		if(res != JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null,
					"파일을 선택하지 않았음",
					"경고",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		String chooserFilePath = chooser.getSelectedFile().getPath();
		lblImg.setIcon(new ImageIcon(chooserFilePath));
		
		if(btnOpen.getText().equals("불러오기")) {
			btnOpen.setText("저장하기");
		}
		
		
	}
}

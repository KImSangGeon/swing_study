package swing_study;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study.Pannel.Department;
import swing_study.frame.ContentPaneEx;
import swing_study.frame.JFannelEx;
import swing_study_component.FrameComponentEx;
import swing_study_component.Fruit;
import swing_study_component.JButtonEx;
import swing_study_component.JCheckBoxCustomEx;
import swing_study_component.JCheckbtn;
import swing_study_component.JComboBoxEx1;
import swing_study_component.JComboBoxEx2;
import swing_study_component.JComboBoxEx3;
import swing_study_component.JListEx;
import swing_study_component.JListEx2;
import swing_study_component.JListEx3;
import swing_study_component.JRableEx1;
import swing_study_component.JSliderEx;
import swing_study_component.JSpinnerEx;
import swing_study_component.JTabbedPaneEx;
import swing_study_component.JTableEx;
import swing_study_component.Jradiobtn;
import swing_study_component.jLabelEx;
import swing_study_layout.FrameLayout;
import swing_study_layout.JTextFieldAreaEx;
import swing_study_layout.LayoutGuBun;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import java.awt.Color;

public class SwingMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn01;
	private JButton btn02;
	private JPanel pLayout;
	private JButton btnFlowLayout;
	private JButton btnBorderLayout;
	private JButton btnGridLayout;
	private JButton btnAbsoluteLayout;
	private JButton btn03;
	private JPanel pComponent1;
	private JButton btn001;
	private JButton btn002;
	private JPanel panel;
	private JButton btn06;
	private JButton btn07;
	private JPanel text;
	private JButton btn08;
	private JPanel pList;
	private JButton btn09;
	private JButton btn10;
	private JButton btn11;
	private JPanel pComboBox;
	private JButton btn14;
	private JButton btn12;
	private JButton btn13;
	private JPanel pSliderSpinner;
	private JPanel pSlider;
	private JPanel pSpiner;
	private JButton btn15;
	private JButton btn16;
	private JPanel panel_1;
	private JButton btn17;
	private JButton btn003;
	private JButton btn18;

	/**
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain frame = new SwingMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SwingMain() {
		initialize();
	}
	private void initialize() {
		setTitle("스윙스터디");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 729, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 5, 10, 10));
		
		btn01 = new JButton("JFrame 예");
		btn01.addActionListener(this);
		contentPane.add(btn01);
		
		btn02 = new JButton("JFannel 예");
		btn02.addActionListener(this);
		contentPane.add(btn02);
		
		pLayout = new JPanel();
		pLayout.setBorder(new TitledBorder(null, "레이아웃", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLayout);
		pLayout.setLayout(new GridLayout(0, 1, 0, 10));
		
		btnFlowLayout = new JButton("플로우레이아웃");
		btnFlowLayout.addActionListener(this);
//		btnFlowLayout.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
////				FrameLayout flow = new FrameLayout(LayoutGuBun.FLOW);
//				FrameLayout frame = new FrameLayout(LayoutGuBun.FLOW);
//				setVisible(true);
//
//			}
//		});
		pLayout.add(btnFlowLayout);
		
		btnBorderLayout = new JButton("보더레이아웃");
		btnBorderLayout.addActionListener(this);
		pLayout.add(btnBorderLayout);
		
		btnGridLayout = new JButton("그리드레이아웃");
		btnGridLayout.addActionListener(this);
		pLayout.add(btnGridLayout);
		
		btnAbsoluteLayout = new JButton("절대레이아웃");
		btnAbsoluteLayout.addActionListener(this);
		pLayout.add(btnAbsoluteLayout);
		
		btn03 = new JButton("JCoponent)공통속성)");
		btn03.addActionListener(this);
		contentPane.add(btn03);
		
		pComponent1 = new JPanel();
		pComponent1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Jlabel & JBorder & JToggle", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pComponent1);
		pComponent1.setLayout(new GridLayout(0, 1, 0, 10));
		
		btn001 = new JButton("JLabel");
		btn001.addActionListener(this);
		pComponent1.add(btn001);
		
		btn002 = new JButton("JBorder&&JToggle");
		btn002.addActionListener(this);
		
		btn003 = new JButton("LableSize");
		btn003.addActionListener(this);
		pComponent1.add(btn003);
		pComponent1.add(btn002);
		
		panel = new JPanel();
		
		
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn06 = new JButton("JCheckbtn");
		btn06.addActionListener(this);
		panel.add(btn06);
		
		btn07 = new JButton("Jradiobtn");
		btn07.addActionListener(this);
		panel.add(btn07);
		
		text = new JPanel();
		text.setBorder(new TitledBorder(null, "텍스트필드", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(text);
		
		btn08 = new JButton("Textfield 관련예제");
		btn08.addActionListener(this);
		text.add(btn08);
		
		pList = new JPanel();
		pList.setBorder(new TitledBorder(null, "JList", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pList);
		pList.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn09 = new JButton("JList 예1");
		btn09.addActionListener(this);
		pList.add(btn09);
		
		btn10 = new JButton("JList 예2");
		btn10.addActionListener(this);
		pList.add(btn10);
		
		btn11 = new JButton("JList 예3");
		btn11.addActionListener(this);
		pList.add(btn11);
		
		pComboBox = new JPanel();
		pComboBox.setBorder(new TitledBorder(null, "ComboBox", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pComboBox);
		pComboBox.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn12 = new JButton("JComboBox 예1");
		btn12.addActionListener(this);
		pComboBox.add(btn12);
		
		btn13 = new JButton("JComboBox  예2");
		btn13.addActionListener(this);
		pComboBox.add(btn13);
		
		btn14 = new JButton("JComboBox 예3");
		btn14.addActionListener(this);
		pComboBox.add(btn14);
		
		pSliderSpinner = new JPanel();
		contentPane.add(pSliderSpinner);
		pSliderSpinner.setLayout(new GridLayout(0, 1, 0, 0));
		
		pSlider = new JPanel();
		pSlider.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JSlider", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pSliderSpinner.add(pSlider);
		pSlider.setLayout(new BorderLayout(0, 0));
		
		btn15 = new JButton("JSlider");
		btn15.addActionListener(this);
		pSlider.add(btn15, BorderLayout.CENTER);
		
		pSpiner = new JPanel();
		pSpiner.setBorder(new TitledBorder(null, "Spinner", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pSliderSpinner.add(pSpiner);
		pSpiner.setLayout(new BorderLayout(0, 0));
		
		btn16 = new JButton("JSpinner");
		btn16.addActionListener(this);
		pSpiner.add(btn16, BorderLayout.CENTER);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JTabbedPane & JTable", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel_1);
		
		btn17 = new JButton("JTabbed");
		btn17.addActionListener(this);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		panel_1.add(btn17);
		
		btn18 = new JButton("JTable");
		btn18.addActionListener(this);
		panel_1.add(btn18);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn18) {
			actionPerformedBtn18(e);
		}
		if (e.getSource() == btn003) {
			actionPerformedBtn003(e);
		}
		if (e.getSource() == btn17) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btn16) {
			actionPerformedBtn16(e);
		}
		if (e.getSource() == btn15) {
			actionPerformedBtn15(e);
		}
		if (e.getSource() == btn14) {
			actionPerformedBtn14(e);
		}
		if (e.getSource() == btn13) {
			actionPerformedBtn13(e);
		}
		if (e.getSource() == btn12) {
			actionPerformedBtn12(e);
		}
		if (e.getSource() == btn11) {
			actionPerformedBtn11(e);
		}
		if (e.getSource() == btn10) {
			actionPerformedBtn10(e);
		}
		if (e.getSource() == btn09) {
			actionPerformedBtn09(e);
		}
		if (e.getSource() == btn08) {
			actionPerformedBtn08(e);
		}
		if (e.getSource() == btn07) {
			actionPerformedBtn07(e);
		}
		if (e.getSource() == btn06) {
			actionPerformedBtn06(e);
		}
		if (e.getSource() == btn002) {
			actionPerformedBtn002(e);
		}
		if (e.getSource() == btn001) {
			actionPerformedBtn001(e);
		}
		if (e.getSource() == btn03) {
			actionPerformedBtn03(e);
		}
		if (e.getSource() == btnAbsoluteLayout) {
			actionPerformedBtnAbsoluteLayout(e);
		}
		if (e.getSource() == btnGridLayout) {
			actionPerformedBtnGridLayout(e);
		}
		if (e.getSource() == btnBorderLayout) {
			actiLonPerformedBtnBorderLayout(e);
		}
		if (e.getSource() == btnFlowLayout) {
			actionPerformedBtnFlowLayout(e);
		}
		if (e.getSource() == btn02) {
			actionPerformedBtn02(e);
		}
		if (e.getSource() == btn01) {
			actionPerformedBtn01(e);
		}
	}
	protected void actionPerformedBtn01(ActionEvent e) {
		ContentPaneEx frame = new ContentPaneEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn02(ActionEvent e) {
		JFannelEx frame = new JFannelEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtnFlowLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.FLOW);
		frame.setVisible(true);
	}
	protected void actiLonPerformedBtnBorderLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.BORDER);
		frame.setVisible(true);
	}
	protected void actionPerformedBtnGridLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.GRID);
		frame.setVisible(true);
	}
	protected void actionPerformedBtnAbsoluteLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.ABSOLUTE);
		frame.setVisible(true);
	}
	protected void actionPerformedBtn03(ActionEvent e) {
		FrameComponentEx frame = new FrameComponentEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn001(ActionEvent e) {
		jLabelEx frame = new jLabelEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn002(ActionEvent e) {
		JButtonEx frame = new JButtonEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn06(ActionEvent e) {
		JCheckbtn frame = new JCheckbtn();
		frame.setVisible(true);
		
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("사과", 100));
		list.add(new Fruit("배", 500));
		list.add(new Fruit("바나나", 1000));
		list.add(new Fruit("체리", 2000));
		
		JCheckBoxCustomEx frame1 = new JCheckBoxCustomEx(list);
		
		frame1.setVisible(true);
		
	}
	protected void actionPerformedBtn07(ActionEvent e) {
		Jradiobtn frame = new Jradiobtn();
		frame.setVisible(true);
		
	
	}
	protected void actionPerformedBtn08(ActionEvent e) {
		JTextFieldAreaEx frame = new JTextFieldAreaEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn09(ActionEvent e) {
		JListEx frame = new JListEx();
		frame.setVisible(true);		
	}
	protected void actionPerformedBtn10(ActionEvent e) {
		JListEx2 frame = new JListEx2();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn11(ActionEvent e) {
		JListEx3 frame = new JListEx3();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn12(ActionEvent e) {
		JComboBoxEx1 frame = new JComboBoxEx1();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn13(ActionEvent e) {
		JComboBoxEx2 frame = new JComboBoxEx2();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn14(ActionEvent e) {
		JComboBoxEx3 frame = new JComboBoxEx3();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn15(ActionEvent e) {
		JSliderEx frame = new JSliderEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn16(ActionEvent e) {
		JSpinnerEx frame = new JSpinnerEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		JTabbedPaneEx frame = new JTabbedPaneEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn003(ActionEvent e) {
		JRableEx1 frame = new JRableEx1();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn18(ActionEvent e) {
		JTableEx frame = new JTableEx();
		frame.setVisible(true);
	}
}





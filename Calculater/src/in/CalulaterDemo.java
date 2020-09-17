package in;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalulaterDemo {

	private JFrame frame;
	private JTextField valueButtom;
	private JTextField valueTop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalulaterDemo window = new CalulaterDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalulaterDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 242, 273);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+7);
			}
		});
		btnNewButton.setBounds(6, 102, 67, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+4);
			}
		});
		btnNewButton_1.setBounds(6, 129, 67, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("1");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+1);
			}
		});
		btnNewButton_1_1.setBounds(6, 157, 67, 29);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("8");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+8);
			}
		});
		btnNewButton_1_2.setBounds(69, 102, 67, 29);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+5);
			}
		});
		btnNewButton_1_3.setBounds(69, 129, 67, 29);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("2");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+2);
			}
		});
		btnNewButton_1_4.setBounds(69, 157, 67, 29);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("9");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+9);
			}
		});
		btnNewButton_1_5.setBounds(129, 102, 67, 29);
		frame.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("6");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+6);
			}
		});
		btnNewButton_1_6.setBounds(129, 129, 67, 29);
		frame.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("3");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+3);
			}
		});
		btnNewButton_1_7.setBounds(129, 157, 67, 29);
		frame.getContentPane().add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("0");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+0);
			}
		});
		btnNewButton_1_8.setBounds(6, 186, 67, 29);
		frame.getContentPane().add(btnNewButton_1_8);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("-");
		rdbtnNewRadioButton.setBounds(190, 103, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("+");
		rdbtnNewRadioButton_1.setBounds(190, 130, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("/");
		rdbtnNewRadioButton_2.setBounds(190, 158, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("*");
		rdbtnNewRadioButton_3.setBounds(190, 187, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton_1_7_1 = new JButton(".");
		btnNewButton_1_7_1.setBounds(69, 186, 67, 29);
		frame.getContentPane().add(btnNewButton_1_7_1);
		
		valueButtom = new JTextField();
		valueButtom.setBounds(6, 61, 226, 29);
		frame.getContentPane().add(valueButtom);
		valueButtom.setColumns(10);
		
		valueTop = new JTextField();
		valueTop.setBounds(6, 31, 226, 29);
		frame.getContentPane().add(valueTop);
		valueTop.setColumns(10);
		
		JButton btnNewButton_1_7_1_1 = new JButton("С");
		btnNewButton_1_7_1_1.setBounds(129, 186, 67, 29);
		frame.getContentPane().add(btnNewButton_1_7_1_1);
	}
}

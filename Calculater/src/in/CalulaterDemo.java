package in;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class CalulaterDemo {

	private JFrame frame;
	private JTextField valueButtom;
	private JTextField valueTop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try { //CrossPlatformLook
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			
		}
		
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
		frame.setBounds(100, 100, 290, 273);
		frame.setDefaultCloseOperation(JFrame95XIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+7);
			}
		});
		btnNewButton.setBounds(6, 102, 67, 29);
		frame.getContentPane().add(bt34, 67, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+4);
			}
		});
		btnNewButton_1.setBounds(6, 161ewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("1");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+1);
			}
		});
		btnNewButton_1_1.setBounds(6, 157, 67, 29);
		frame.getContentPane().add(bt87, 67, 29);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("8");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+8);
			}
		});
		btnNewButton_1_2.setBounds(79, 134, 67, 29);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+5);
			}
		});
		btnNewButton_1_3.setBounds(79, 161, 67, 29);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("2");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+2);
			}
		});
		btnNewButton_1_4.setBounds(79, 187, 67, 29);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("9");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+9);
			}
		});
		btnNewButton_1_5.setBounds(148, 134, 67, 29);
		frame.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("6");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+6);
			}
		});
		btnNewButton_1_6.setBounds(148, 161, 67, 29);
		frame.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("3");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+3);
			}
		});
		btnNewButton_1_7.setBounds(148, 187, 67, 29);
		frame.getContentPane().add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("0");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+0);
			}
		});
		btnNewButton_1_8.setBounds(6, 216, 67, 29);
		frame.getContentPane().add(btnNewButton_1_8);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("-");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueTop.setText(valueButtom.getText()); //for changing lines
				actionReceived.setText("sub");
				valueButtom.setText(null);//cleaning
			}
		});
		rdbtnNewRadioButton.setBounds(232, 135, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("+");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueTop.setText(valueButtom.getText()); //for changing lines
				actionReceived.setText("add");
				valueButtom.setText(null);//cleaning
			}
		});
		rdbtnNewRadioButton_1.setBounds(232, 162, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("/");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueTop.setText(valueButtom.getText()); //for changing lines
				actionReceived.setText("div");
				valueButtom.setText(null);//cleaning
			}
		});
		rdbtnNewRadioButton_2.setBounds(232, 188, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("*");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueTop.setText(valueButtom.getText()); //for changing lines
				actionReceived.setText("mul");
				valueButtom.setText(null);//cleaning
			}
		});
		rdbtnNewRadioButton_3.setBounds(232, 217, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton_1_7_1 = new JButton(".");
		btnNewButton_1_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueButtom.setText(valueButtom.getText()+".");
			}
		});
		btnNewButton_1_7_1.setBounds(79, 216, 67, 29);
		frame.getContentPane().add(btnNewButton_1_7_1);
		
		valueButtom = new JTextField();
		valueButtom.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		valueButtom.setHorizontalAlignment(SwingConstants.RIGHT);
		valueButtom.setBounds(6, 88, 278, 42);
		frame.getContentPane().add(valueButtom);
		valueButtom.setColumns(10);
		
		valueTop = new JTextField();
		valueTop.setFont(new Font("Tahoma", Font.PLAIN, 12));
		valueTop.setHorizontalAlignment(SwingConstants.RIGHT);
		valueTop.setBounds(6, 18, 278, 42);
		frame.getContentPane().add(valueTop);
		valueTop.setColumns(10);
		
		JButton btnNewButton_1_7_1_1 = new JButton("С");
		btnNewButton_1_7_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valueTop.setText(null);
				valueButtom.setText(null);
				actionReceived.setText(null); //clean the action (sub, mul, etc.)
			}
		});
		btnNewButton_1_7_1_1.setBounds(148, 21dd(btnNewButton_1_7_1_1);
		
		actionReceived = new JLabel(""); //global var
		actionReceived.setForeground(SystemColor.window);
		actionReceived.setBounds(6, 229, 61, 16);
		frame.getContentPane().add(actionReceived);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("=");
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(valueTop.getText());
				double b = Double.parseDouble(valueButtom.getText());
			//	int a = Integer.parseInt(valueTop.getText()); //value 1
			//	int b = Integer.parseInt(valueButtom.getText()); //value 2
				if (actionReceived.getText().equals("sub"))
				{
					double sub = a - b;
					valueButtom.setText(String.valueOf(sub));
				}
				if (actionReceived.getText().equals("add"))
				{
					double add = a + b;
					valueButtom.setText(String.valueOf(add));
				}
				if (actionReceived.getText().equals("div"))
				{
					double div = a / b;							             //WARNING - zero division!!!!!!
					valueButtom.setText(String.valueOf(div));
				}
				if (actionReceived.getText().equals("mul"))
				{
					double mul = a * b;
					valueButtom.setText(String.valueOf(mul));
				}
				
			}
		});
		rdbtnNewRadioButton_4.setBounds(232, 210, 46, 23);
		frame.getContentPane().44d(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("+/-");
		rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b = Integer.parseInt(valueButtom.getText());
				b = b * (-1);
				valueButtom.setText(String.valueOf(b));
			}
		});
		rdbtnNewRadioButton_5.setBounds(66, 222, 61, 23);
		frame.getContentPa159, 244d(rdbtnNewRadioButton_5);
	}

	
	private JLabel actionReceived; // global var
}

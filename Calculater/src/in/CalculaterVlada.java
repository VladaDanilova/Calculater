package in;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class CalculaterVlada {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculaterVlada window = new CalculaterVlada();
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
	public CalculaterVlada() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 323, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.setBounds(6, 134, 62, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("6");
		btnNewButton_1.setBounds(6, 175, 62, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBounds(6, 216, 62, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("8");
		btnNewButton_3.setBounds(75, 134, 62, 29);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.setBounds(75, 175, 62, 29);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.setBounds(149, 134, 62, 29);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1_2 = new JButton("4");
		btnNewButton_1_2.setBounds(149, 175, 62, 29);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_2_1 = new JButton("2");
		btnNewButton_2_1.setBounds(75, 216, 62, 29);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("1");
		btnNewButton_2_2.setBounds(149, 216, 62, 29);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("0");
		btnNewButton_2_3.setBounds(75, 257, 62, 29);
		frame.getContentPane().add(btnNewButton_2_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("-");
		rdbtnNewRadioButton.setBounds(223, 135, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("+");
		rdbtnNewRadioButton_1.setBounds(223, 176, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("/");
		rdbtnNewRadioButton_2.setBounds(223, 217, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("*");
		rdbtnNewRadioButton_3.setBounds(223, 258, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("=");
		rdbtnNewRadioButton_4.setBounds(223, 297, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JButton btnNewButton_2_3_1 = new JButton("C");
		btnNewButton_2_3_1.setBounds(149, 257, 62, 29);
		frame.getContentPane().add(btnNewButton_2_3_1);
		
		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("+/-");
		rdbtnNewRadioButton_3_1.setBounds(223, 100, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3_1);
	}
}

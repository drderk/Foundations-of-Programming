import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class SimpleCalculator {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
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
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(31, 11, 121, 20);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(250, 11, 137, 20);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans  = num1 + num2;
					
					textField.setText(Integer.toString(ans));
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number.");
				}
			}
		});
		btnNewButton.setBounds(10, 96, 166, 68);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans  = num1 - num2;
					
					textField.setText(Integer.toString(ans));
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number.");
				}
			}
		});
		btnNewButton_1.setBounds(250, 96, 153, 68);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(140, 204, 153, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAnswer.setBounds(69, 206, 61, 14);
		frame.getContentPane().add(lblAnswer);
	}

}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimpleCalculator {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textField;
	private JTextField textFieldNum3;
	private JTextField textFieldNum4;
	private JTextField textFieldNum5;

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
		textFieldNum1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textFieldNum1.setText("");
			}
		});
		textFieldNum1.setText("Enter base");
		textFieldNum1.setBounds(31, 11, 121, 20);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNum2.setText("");
			}
		});
		textFieldNum2.setText("Enter height");
		textFieldNum2.setBounds(31, 64, 121, 20);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("Area");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double base,height,ans;
				
				try {
					base = Double.parseDouble(textFieldNum1.getText());
					height = Double.parseDouble(textFieldNum2.getText());
					ans  = (base * height) / 2.0;
					
					textField.setText(Double.toString(ans));
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number.");
				}
			}
		});
		btnNewButton.setBounds(10, 125, 166, 68);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Perimeter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double num1,num2,num3, ans;
				
				try {
					num1 = Double.parseDouble(textFieldNum3.getText());
					num2 = Double.parseDouble(textFieldNum4.getText());
					num3 = Double.parseDouble(textFieldNum5.getText());
					ans  = num1 + num2 + num3;
					
					textField.setText(Double.toString(ans));
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number.");
				}
			}
		});
		btnNewButton_1.setBounds(250, 125, 153, 68);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(140, 204, 153, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAnswer.setBounds(69, 206, 61, 14);
		frame.getContentPane().add(lblAnswer);
		
		textFieldNum3 = new JTextField();
		textFieldNum3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNum3.setText("");
			}
		});
		textFieldNum3.setText("Enter length of side a");
		textFieldNum3.setBounds(250, 11, 129, 20);
		frame.getContentPane().add(textFieldNum3);
		textFieldNum3.setColumns(10);
		
		textFieldNum4 = new JTextField();
		textFieldNum4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNum4.setText("");
			}
		});
		textFieldNum4.setText("Enter length of side b");
		textFieldNum4.setColumns(10);
		textFieldNum4.setBounds(250, 42, 129, 20);
		frame.getContentPane().add(textFieldNum4);
		
		textFieldNum5 = new JTextField();
		textFieldNum5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNum5.setText("");
			}
		});
		textFieldNum5.setText("Enter length of side c");
		textFieldNum5.setColumns(10);
		textFieldNum5.setBounds(250, 75, 129, 20);
		frame.getContentPane().add(textFieldNum5);
	}
}

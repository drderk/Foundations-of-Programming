import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.text.MaskFormatter;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PhoneDialer extends JFrame {

	private JPanel contentPane;
	String number = "";
	String[] numArray = new String[10];
	String statement = "Enter the number to dial";
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDash, btn0, back, Dial;
	JPanel Numbers, Statement;
	JFormattedTextField formattedTextField;
	
	boolean resetText = true;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhoneDialer frame = new PhoneDialer();
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
	public PhoneDialer() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Dialer");
	
		Numbers = new JPanel();
		Numbers.setBounds(0, 61, 182, 122);
		contentPane.add(Numbers);
		GridBagLayout gbl_Numbers = new GridBagLayout();
		gbl_Numbers.columnWidths = new int[] {30, 0, 0, 0, 4};
		gbl_Numbers.rowHeights = new int[] {0, 0, 0, 0, 3};
		gbl_Numbers.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Numbers.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Numbers.setLayout(gbl_Numbers);
		
		Statement = new JPanel();
		Statement.setBounds(0, 11, 194, 51);
		contentPane.add(Statement);
		Statement.setLayout(new BoxLayout(Statement, BoxLayout.Y_AXIS));
		
		JLabel Screen = new JLabel("\"Enter a number to dial:\"");
		Screen.setHorizontalAlignment(SwingConstants.RIGHT);
		Screen.setText("            Enter the number to dial");
		Statement.add(Screen);
		
		formattedTextField = new JFormattedTextField();
		formattedTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				resetTextBox();
			}
		});
		formattedTextField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				number = formattedTextField.getText();
			}
		});
		formattedTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dial.doClick();
			}
		});
		formattedTextField.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextField.setText("(###)-###-###");
		Statement.add(formattedTextField);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				number += "1";
				statement = number;
				resetTextBox();
				formattedTextField.setText(statement);

			}
		});
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 1;
		gbc_btn1.gridy = 0;
		Numbers.add(btn1, gbc_btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			number += "2";
			statement = number;
			resetTextBox();
			formattedTextField.setText(statement);

			}
		});
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 2;
		gbc_btn2.gridy = 0;
		Numbers.add(btn2, gbc_btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number += "3";
				statement = number;
				resetTextBox();
				formattedTextField.setText(statement);

			}
		});
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.insets = new Insets(0, 0, 5, 0);
		gbc_btn3.gridx = 3;
		gbc_btn3.gridy = 0;
		Numbers.add(btn3, gbc_btn3);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number += "4";
				statement = number;
				resetTextBox();

				formattedTextField.setText(statement);

			}
		});
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4.gridx = 1;
		gbc_btn4.gridy = 1;
		Numbers.add(btn4, gbc_btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number += "5";
				statement = number;
				resetTextBox();

				formattedTextField.setText(statement);

			}
		});
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.insets = new Insets(0, 0, 5, 5);
		gbc_btn5.gridx = 2;
		gbc_btn5.gridy = 1;
		Numbers.add(btn5, gbc_btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number += "6";
				statement = number;
				resetTextBox();

				formattedTextField.setText(statement);

			}
		});
		GridBagConstraints gbc_btn6 = new GridBagConstraints();
		gbc_btn6.insets = new Insets(0, 0, 5, 0);
		gbc_btn6.gridx = 3;
		gbc_btn6.gridy = 1;
		Numbers.add(btn6, gbc_btn6);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number += "7";
				statement = number;
				resetTextBox();

				formattedTextField.setText(statement);

			}
		});
		GridBagConstraints gbc_btn7 = new GridBagConstraints();
		gbc_btn7.insets = new Insets(0, 0, 5, 5);
		gbc_btn7.gridx = 1;
		gbc_btn7.gridy = 2;
		Numbers.add(btn7, gbc_btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number += "8";
				statement = number;
				resetTextBox();

				formattedTextField.setText(statement);
			}
		});
		GridBagConstraints gbc_btn8 = new GridBagConstraints();
		gbc_btn8.insets = new Insets(0, 0, 5, 5);
		gbc_btn8.gridx = 2;
		gbc_btn8.gridy = 2;
		Numbers.add(btn8, gbc_btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number += "9";
				statement = number;
				resetTextBox();

				formattedTextField.setText(statement);
			}
		});
		GridBagConstraints gbc_btn9 = new GridBagConstraints();
		gbc_btn9.insets = new Insets(0, 0, 5, 0);
		gbc_btn9.gridx = 3;
		gbc_btn9.gridy = 2;
		Numbers.add(btn9, gbc_btn9);
		
		btnDash = new JButton("-");
		btnDash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number += "-";
				statement = number;
				resetTextBox();

				formattedTextField.setText(statement);
			}
		});
		GridBagConstraints gbc_btnDash = new GridBagConstraints();
		gbc_btnDash.insets = new Insets(0, 0, 0, 5);
		gbc_btnDash.gridx = 1;
		gbc_btnDash.gridy = 3;
		Numbers.add(btnDash, gbc_btnDash);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number += "0";
				statement = number;
				resetTextBox();

				formattedTextField.setText(statement);
			}
		});
		GridBagConstraints gbc_btn0 = new GridBagConstraints();
		gbc_btn0.insets = new Insets(0, 0, 0, 5);
		gbc_btn0.gridx = 2;
		gbc_btn0.gridy = 3;
		Numbers.add(btn0, gbc_btn0);
		
		back = new JButton("");
		back.setIcon(new ImageIcon(PhoneDialer.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = number.length();
					if (number.length() != 0) {
						number = number.substring(0, number.length() - 1);
					}
					statement = number;
					resetTextBox();

					formattedTextField.setText(statement);
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.gridx = 3;
		gbc_button.gridy = 3;
		Numbers.add(back, gbc_button);
		
		Dial = new JButton("Dial Number");
		Dial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				take out -
//				number = formattedTextField.getText();
				numArray = number.split("-");
				number = "";
				boolean flag = true;
				int i = 0;
				while(flag) {
					try {
						number += numArray[i];
						i++;
						
					} catch (Exception io) {
						i = 0;
						flag = false;
					}
				}
				
				if (!(number.length() == 7) && !(number.length() == 10)) {
					statement = "Please enter a valid number";
					Screen.setText(statement);
					number = "";
					formattedTextField.setText("");
					return;
				}
				
				char[] numbers = number.toCharArray();
				String number0 = Character.toString(numbers[0]);
				String number1 = Character.toString(numbers[1]);
				String number2 = Character.toString(numbers[2]);
				String number3 = Character.toString(numbers[3]);
				String number4 = Character.toString(numbers[4]);
				String number5 = Character.toString(numbers[5]);
				String number6 = Character.toString(numbers[6]);
				
				if (number.length() == 10) {
					String number7 = Character.toString(numbers[7]);
					String number8 = Character.toString(numbers[8]);
					String number9 = Character.toString(numbers[9]);
					number = String.format("(%s%s%s)-%s%s%s-%s%s%s%s", number0, number1, number2, number3, number4,number5,number6,number7,number8,number9);
				}
				
				if (number.length() == 7) {
					number = String.format("%s%s%s-%s%s%s%s", number0, number1, number2, number3, number4,number5,number6);
				}
				
				JOptionPane.showMessageDialog(null, " Dialing "+ number);
				number = "";
				statement = "Enter the number to dial";
				Screen.setText(statement);
			}
		});
		Dial.setBounds(34, 182, 114, 23);
		contentPane.add(Dial);
		
	}
	public void resetTextBox() {
		if(resetText) {
			formattedTextField.setText("");
			resetText = false;
			}
	}
}

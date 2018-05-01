import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

public class PizzaPlace implements ActionListener{

	private JFrame frame;
	int x = 100;
	int y = 100;
	JTextField textField = new JTextField();
	
	ButtonGroup radioGroup = new ButtonGroup();
	JRadioButton small = new JRadioButton();
	JRadioButton medium = new JRadioButton();
	JRadioButton large = new JRadioButton();
	
	String[] crustTypes = {"Thin", "Thick", "Deep Dish"};
	JComboBox<String> crusts = new JComboBox<String>(crustTypes);
	
	String[] list = {"Pepperoni", "Sausage", "Green Peppers", "Onions", "Tomatoes", "Anchovies", "Bacon", "Chicken", "Beef", "Olives", "Mushrooms" };
	JList<String> toppingList = new JList<String>(list);
	
	JCheckBox breadSticks = new JCheckBox();
	JCheckBox salad = new JCheckBox();
	JCheckBox soda  = new JCheckBox();
	
	JTextArea area = new JTextArea(null, 5, 20);
	
	JButton placeOrder = new JButton("Place Order");
	JButton resetValues = new JButton("Reset Values");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaPlace window = new PizzaPlace();
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
	public PizzaPlace() {
		initialize();
	}
	public PizzaPlace(int x, int y) {
		this.x = x;
		this.y = y;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Pizza Place");
		frame.setBounds(x, y, 136, 114);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel main = (JPanel)frame.getContentPane();
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		main.setBorder(new EmptyBorder(10,10,10,10));
		
		JPanel name = new JPanel();
		
		JLabel customer = new JLabel();
		customer.setText("Customer Name:");
		name.add(customer);
		textField.setColumns(20);		
		name.add(textField);		
		main.add(name);
		
		JPanel radioButtons = new JPanel();
		JLabel pizzaSize = new JLabel();
		pizzaSize.setText("Pizza Size:");
		small.setText("Small");
		medium.setText("Medium");
		large.setText("Large");

		radioGroup = new ButtonGroup();
		radioGroup.add(small);
		radioGroup.add(medium);
		radioGroup.add(large);
		radioButtons.add(pizzaSize);
		radioButtons.add(small);
		radioButtons.add(medium);
		radioButtons.add(large);
		main.add(radioButtons);
		
		JPanel comboBox = new JPanel();
		JLabel crust = new JLabel();
		crust.setText("Crust Type:");
		comboBox.add(crust);
		comboBox.add(crusts);
    	main.add(comboBox);
		
    	JPanel toppings = new JPanel();
    	JLabel statement = new JLabel();
    	statement.setText("Toppings:");
    	toppings.add(statement);
    	toppingList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    	JScrollPane scroller = new JScrollPane(toppingList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    	toppings.add(scroller);
    	main.add(toppings);
    	
    	JPanel extras = new JPanel();
    	breadSticks.setText("BreadSticks");
    	salad.setText("Salad");
    	soda.setText("Soda");
    	
    	extras.add(breadSticks);
    	extras.add(salad);
    	extras.add(soda);
    	main.add(extras);
    	
    	JPanel comments = new JPanel();
    	JLabel orderComments = new JLabel("Order Comments:");
    	JScrollPane commentScroller = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		comments.add(orderComments);
		comments.add(commentScroller);
		main.add(comments);
		
		JPanel order = new JPanel();
		order.add(placeOrder);
		order.add(resetValues);
		main.add(order);
		
		placeOrder.addActionListener(this);
		resetValues.addActionListener(this);
    	frame.pack();
		frame.setVisible(true);
	}

	/*
	 * 	JTextField textField = new JTextField();
	
	JRadioButton small = new JRadioButton();
	JRadioButton medium = new JRadioButton();
	JRadioButton large = new JRadioButton();
	
	String[] crustTypes = {"Thin", "Thick", "Deep Dish"};
	JComboBox<String> crusts = new JComboBox<String>(crustTypes);
	
	String[] list = {"Pepperoni", "Sausage", "Green Peppers", "Onions", "Tomatoes", "Anchovies", "Bacon", "Chicken", "Beef", "Olives", "Mushrooms" };
	JList<String> toppingList = new JList<String>(list);
	
	JCheckBox breadSticks = new JCheckBox();
	JCheckBox salad = new JCheckBox();
	JCheckBox soda  = new JCheckBox();
	
	JTextArea area = new JTextArea(null, 5, 20);
	
	JButton placeOrder = new JButton("Place Order");
	JButton resetValues = new JButton("Reset Values");(non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object currentButton = arg0.getSource();
		
		String name = textField.getText();
		String size = "";
		String crust = (String) crusts.getSelectedItem();
		String topping = (String)toppingList.getSelectedValue();
		if (topping == null) {
			topping = "No toppings";
		}
		String extras = "";
		String comments = area.getText();
		
		if (small.isSelected()) {
			size = "Small";
		}
		if (medium.isSelected()) {
			size = "Medium";
		}
		if (large.isSelected()) {
			size = "Large";
		}
		
		if(breadSticks.isSelected()) {
			extras += " Bread Sticks,";
		}
		if(salad.isSelected()) {
			extras += " Salad,";
		}
		if(soda.isSelected()) {
			extras += " Soda,";
		}
		
		String order = String.format("Name: %s\n Size: %s\n Crust: %s\n Toppings: %s\n Extras: %s\n Comments: %s", name, size, crust, topping, extras, comments);
		if (arg0.getSource() == placeOrder) {
			JOptionPane.showConfirmDialog(null, order);
		}
		else if (arg0.getSource() == resetValues) {
			if (JOptionPane.showConfirmDialog(null, "Are you sure?") == JOptionPane.YES_OPTION) {
				frame.setVisible(false);
				PizzaPlace pizza = new PizzaPlace(frame.getX(),frame.getY());
			}
		}
		}
}

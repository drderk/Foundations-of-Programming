import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
//Add a new class also called BaseballStats.
public class BaseballStats implements ActionListener{
	Color color = new Color(255);
	Color purple = new Color(150,0,255);
	Color blue   = new Color(25,0,255);
	Color white  = new Color(255,255,255);
	static int x = 200;
	static int y = 200;
	JTextField name = new JTextField(20);
	static MyBackgroudMethod thread = new MyBackgroudMethod();
	JSpinner   hits1 = new JSpinner(new SpinnerNumberModel(5,0,5,1));
	JSpinner   hits2 = new JSpinner(new SpinnerNumberModel(3,0,5,1));
	JSpinner   hits3 = new JSpinner(new SpinnerNumberModel(3,0,5,1));
	JSpinner   hits4 = new JSpinner(new SpinnerNumberModel(2,0,5,1));
	JSpinner   hits5 = new JSpinner(new SpinnerNumberModel(5,0,5,1));
	
	JTextArea  playerInput = new JTextArea(5, 20);
	JButton	   addPlayer = new JButton("Add Player");
	JButton    resetValues = new JButton("Reset Value");
	JButton    showStats = new JButton("Show Stats");
	ArrayList<Player> playerList = new ArrayList<Player>();
	int i = 0;
	static int numOfPanes = 0;
//	In your main() method, just create a new instance of the BaseballStats class.
	public static void main(String[] args) {
		thread.start();
		BaseballStats stats = new BaseballStats();
	}
//	In your BaseballStats constructor, write code to create the GUI shown above.    We are leaving all the details up to you!
	public BaseballStats() {
		JFrame frame = new JFrame();
		frame.setTitle("Baseball Stats");
		frame.setBounds(x, y, 200, 500);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		JPanel main = new JPanel();
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		
		JPanel names = new JPanel();
		names.setBackground(white);
		names.setLayout(new FlowLayout());
		JLabel nameLbl = new JLabel("Player Name:");
		names.add(nameLbl);
		names.add(name);
		
		JPanel game1 = new JPanel();
		game1.setBackground(color.red);
		game1.setLayout(new FlowLayout());
		JLabel hit1Lbl = new JLabel("Game 1 Hits:");
		game1.add(hit1Lbl);
		hits1.setEnabled(true);
		game1.add(hits1);
		
		JPanel game2 = new JPanel();
		game2.setBackground(color.orange);
		game2.setLayout(new FlowLayout());
		JLabel hit2Lbl = new JLabel("Game 2 Hits:");
		game2.add(hit2Lbl);
		hits2.setEnabled(true);
		game2.add(hits2);

		JPanel game3 = new JPanel();
		game3.setBackground(color.yellow);
		game3.setLayout(new FlowLayout());
		JLabel hit3Lbl = new JLabel("Game 3 Hits:");
		game3.add(hit3Lbl);
		hits3.setEnabled(true);
		game3.add(hits3);
		
		JPanel game4 = new JPanel();
		game4.setBackground(color.green);
		game4.setLayout(new FlowLayout());
		JLabel hit4Lbl = new JLabel("Game 4 Hits:");
		game4.add(hit4Lbl);
		hits4.setEnabled(true);
		game4.add(hits4);
		
		JPanel game5 = new JPanel();
		game5.setBackground(blue);
		game5.setLayout(new FlowLayout());
		JLabel hit5Lbl = new JLabel("Game 5 Hits:");
		game5.add(hit5Lbl);
		hits5.setEnabled(true);
		game5.add(hits5);
		
		JPanel players = new JPanel();
		players.setBackground(purple);
		players.setLayout(new FlowLayout());
		JLabel playerLbl = new JLabel("Current Players: ");
		players.add(playerLbl);
		playerInput.setLineWrap(true);
		playerInput.setEditable(false);
		JScrollPane scroll = new JScrollPane(playerInput, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		players.add(scroll, BorderLayout.CENTER);
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new FlowLayout());
		buttons.add(addPlayer);
		buttons.add(resetValues);
		buttons.add(showStats);
		addPlayer.addActionListener(this);
		resetValues.addActionListener(this);
		showStats.addActionListener(this);
		buttons.setBackground(Color.BLACK);
		addPlayer.setBackground(Color.PINK);
		resetValues.setBackground(Color.PINK);
		showStats.setBackground(Color.PINK);
		
		main.add(names);
		main.add(game1);
		main.add(game2);
		main.add(game3);
		main.add(game4);
		main.add(game5);
		main.add(players);
		main.add(buttons);

		frame.add(main);
		frame.setVisible(true);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == addPlayer) {
			addingPlayer();
		} else if (arg0.getSource() == resetValues) {
			resettingValues();
		} else if (arg0.getSource() == showStats) {
			showingStats();
		}
		
	}
	public void addingPlayer() {
//		Allow only letters to be entered into the player's name text box
		if(!(name.getText().matches("[a-zA-Z]+"))) { //Validates that only a number is entered.
			JOptionPane.showConfirmDialog(null, "I'm sorry. The name you have entered is invalid. Please try again.");
		} else {
//			Initialize the integer array in the Player object to 5 elements
			Integer[] hits = {(Integer) hits1.getValue(), (Integer) hits2.getValue(), (Integer) hits3.getValue(), (Integer) hits4.getValue(), (Integer) hits5.getValue()};
//			Create and initialize a new Player object with the data read from GUI. 
//			Read the player name from the text control and store it in the Player
//			Add your newly initialized Player object to the ArrayList tracking all of your Players.
			playerList.add(new Player(name.getText(), hits));
//			Get the 5 integer values from the spinner controls and store them in the 5-element array.
				String previous = playerInput.getText();
				playerInput.setText("");
//				Update the bottom "Current Players" text area to display a list of all the player names in the ArrayList.  You can add a "\n" escape character in between each name to force a newline.
				String peopleFormat = String.format("%s\n", playerList.get(i).name);
				playerInput.setText(previous + peopleFormat);
				i++;
		}
//		Clear all of the data from the input fields so you are ready to accept new player information.
		name.setText("");
//		When the user enters an invalid name show message accordingly and have the cursor go back into the players name text box. Also have the cursor go back into the players name text box after the user clicks on "Add Player" button.
		name.requestFocus();
		name.setCaretPosition(0);
	}
	public void resettingValues() {
//		Clear the input fields on the screen, including the list of current players
//		Clear the ArrayList of players so the user can start over with their list.
		playerList.clear();
		playerInput.setText("");
		i = 0;
		name.setText("");
		hits1.setValue(5);
		hits2.setValue(3);
		hits3.setValue(3);
		hits4.setValue(2);
		hits5.setValue(5);
	}
	public void showingStats() {
//		Initialize a String to an empty string ("") to hold the message you will eventually display.
		String message = "";
//		Sort the baseball players collection when the Show Stats button is clicked. (i.e. Show the stats of the baseball players in ABC order by name.)
		Collections.sort(playerList);
//		Iterate through all the Player objects in your ArrayList
//		For each Player:
//			Iterate over all the elements in the player's hits array, summing the total number of hits
//			Calculate a single, overall batting average for all 5 games.  The number of at-bats will always be the same - 5 games and 5 at-bats per game!  Example:
		for (Iterator<Player> myIterator=playerList.iterator(); myIterator.hasNext();){
			Player player = myIterator.next();
			double hitTotal = player.hits[0] + player.hits[1] + player.hits[2] + player.hits[3] + player.hits[4];
			double average = (hitTotal / 25.0);
//			Append the player's name and formatted batting average to an output message string
//			Make sure you use the DecimalFormat to put the average in the correct format.
			message += String.format("%s : %.3f%n", player.name, average);
		}
//		Once all Players have been processed, output the message with all stats to the screen using a JOptionPane.showMessageBox().
		JOptionPane.showMessageDialog(playerInput, message);

}
	 public static class MyBackgroudMethod extends Thread {

	        @Override
	        public void run() {
	                BaseballStats stats = new BaseballStats();
	            }
	        }

	    }

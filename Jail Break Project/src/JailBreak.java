////////////////////////////////////////////////////////////////
// Copyright 2012, CompuScholar, Inc.
//
// This source code is for use by the students and teachers who 
// have purchased the corresponding TeenCoder or KidCoder product.
// It may not be transmitted to other parties for any reason
// without the written consent of CompuScholar, Inc.
// This source is provided as-is for educational purposes only.
// CompuScholar, Inc. makes no warranty and assumes
// no liability regarding the functionality of this program.
//
////////////////////////////////////////////////////////////////

// This class is provided partially complete as part of the activity starter.
// STUDENT SHOULD COMPLETE THE CODE AREAS MARKED BELOW!

/** TeenCoder: Java Programming
 * Chapter 16 - Jail Break Project
 * This class contains the main game logic for the 
 * Jail Break game.
 * @author CompuScholar, Inc.
 * @version 1.0
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

// The JailBreak class implements ActionListener to receive button click events
public class JailBreak implements ActionListener
{
	// Declare class member variables to keep track of the UI controls on the JFrame
	private JFrame myFrame = null;
	private JPanel mainPanel = null;
	private JLabel playerTurnLabel = null;
	private JButton resetButton = null;
	
	// This member will contain the main game board object
	private GameBoard gameBoard = null;

	// This member will track which square (if any) is currently selected
	private GameSquare selectedSquare = null;
	
	// This flag will be set to true when the game is over, or should be false otherwise
	private boolean gameOver = false;

	// AbstractGamePiece.PLAYER_OUTLAWS or AbstractGamePiece.PLAYER_POSSE
	private int currentPlayerTurn;	
	
	// This member will hold a reference to the kingpin so we can check it later
	private AbstractGamePiece kingpinPiece = null;

	// This method is provided as part of the activity starter.  No student modification is needed.
	// The main method just creates a new JailBreak object to run the game
	public static void main(String[] args)
	{
		new JailBreak();
	}
	
	// This method is provided as part of the activity starter.  No student modification is needed.
	// The JailBreak constructor will build all of the GUI elements, initialize the game board,
	// and reset the game to its initial state
	public JailBreak()
	{
		// Create new JFrame and set the title. 
		myFrame = new JFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setTitle("Jail Break!");
		myFrame.setResizable(false);	// don't let the user resize or board
		
		// The main panel will contain a vertical box layout 
		mainPanel = (JPanel)myFrame.getContentPane();
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));

		// The top panel just contains the player turn label
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		playerTurnLabel = new JLabel();
		topPanel.add(playerTurnLabel);
		mainPanel.add(topPanel);

		// The middle panel contains the game board.  The GameBoard constructor
		// will build out all of the panel details, including all of the squares!
		JPanel boardPanel = new JPanel();
		gameBoard = new GameBoard(boardPanel,this);
		mainPanel.add(boardPanel);
		
		// The bottom panel will contain the reset button.
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout());
		resetButton = new JButton("Reset");
		resetButton.addActionListener(this);
		bottomPanel.add(resetButton);
		mainPanel.add(bottomPanel);

		// reset the game to it's initial state
		reset();
		
		// we're ready, so pack and show the screen!
		myFrame.pack();
		myFrame.setVisible(true);
	}

	// This method is defined but not implemented as part of the activity starter.
	// This method is called when the game is first created, and any
	// time you want to restart a new game.
	// STUDENT SHOULD COMPLETE THIS ENTIRE METHOD!
	private void reset()
	{
//		Set the JailBreak class member variable gameOver to false to show that the game is not over.
		gameOver = false;
//		Call the reset() method on the GameBoard object stored in the gameBoard member variable.  This will clear the game board of all pieces from any previous game.
		gameBoard.reset();
//		Create a new Kingpin() object and store it in the kingpinPiece member variable.
		kingpinPiece = new Kingpin();
//		Call the gameBoard.setPiece() method to locate the Kingpin object on the game board.  The setPiece() method takes these parameters:
		gameBoard.setPiece(4,4,kingpinPiece);
//		Create 8 new Henchman pieces and store them on the game board in their starting positions.  Here is one example that will place a new Henchman at column 4, row 3:
		gameBoard.setPiece(4,3,new Henchman());
		gameBoard.setPiece(4,2,new Henchman());
		gameBoard.setPiece(4,5,new Henchman());
		gameBoard.setPiece(4,6,new Henchman());
		gameBoard.setPiece(3,4,new Henchman());
		gameBoard.setPiece(2,4,new Henchman());
		gameBoard.setPiece(5,4,new Henchman());
		gameBoard.setPiece(6,4,new Henchman());
//		Create 16 new Deputy pieces and store them on the game board in their starting positions (one in each Camp square). 
		gameBoard.setPiece(0,3,new Deputy());
		gameBoard.setPiece(0,4,new Deputy());
		gameBoard.setPiece(0,5,new Deputy());
		gameBoard.setPiece(1,4,new Deputy());
		
		gameBoard.setPiece(3,0,new Deputy());
		gameBoard.setPiece(4,0,new Deputy());
		gameBoard.setPiece(5,0,new Deputy());
		gameBoard.setPiece(4,1,new Deputy());
		
		gameBoard.setPiece(3,8,new Deputy());
		gameBoard.setPiece(4,8,new Deputy());
		gameBoard.setPiece(5,8,new Deputy());
		gameBoard.setPiece(4,7,new Deputy());
		
		gameBoard.setPiece(8,3,new Deputy());
		gameBoard.setPiece(8,4,new Deputy());
		gameBoard.setPiece(8,5,new Deputy());
		gameBoard.setPiece(7,4,new Deputy());
//		Set the currentPlayerTurn member variable equal to AbstractGamePiece.PLAYER_OUTLAWS to ensure that team goes first.
		currentPlayerTurn = AbstractGamePiece.PLAYER_OUTLAWS;
//		Call the setPlayerTurnLabel() method to set the player turn label according to the current player.
		setPlayerTurnLabel();
	}
	
	// This method is provided as part of the activity starter.  No student modification is needed.
	// switch the current player's turn
	private void changePlayerTurn()
	{
		if (currentPlayerTurn == AbstractGamePiece.PLAYER_OUTLAWS)
			currentPlayerTurn = AbstractGamePiece.PLAYER_POSSE;
		else
			currentPlayerTurn = AbstractGamePiece.PLAYER_OUTLAWS;
	}

	
	// This method is provided as part of the activity starter.  No student modification is needed.
	// change the playerTurnLabel to reflect the current player's turn
	private void setPlayerTurnLabel()
	{
		if (currentPlayerTurn == AbstractGamePiece.PLAYER_OUTLAWS)
			playerTurnLabel.setText("Player Turn: Outlaws!");
		else
			playerTurnLabel.setText("Player Turn: Posse!");
	}
	
	// This method is provided as part of the activity starter.  No student modification is needed.
	// Implement the ActionListener interface.  Button clicks from the game board
	// buttons will be received by this method.
	public void actionPerformed(ActionEvent source)
	{
		// if the reset button was clicked
		if (source.getSource() == resetButton)
		{
			reset();	// reset the game
		}
		else if (!gameOver)	// else if the game is not over
		{
			// figure out which square, if any, on the game board was clicked
			GameSquare clickedSquare = gameBoard.getClickedSquare(source.getSource());
			if (clickedSquare != null)
			{
				// pass the clicked square to the main game logic function
				handleClickedSquare(clickedSquare);
				
				// update the current player's turn in case it was changed by the game logic
				setPlayerTurnLabel();
			}
				
		}
	}
	
	// This method is defined but not implemented as part of the activity starter.
	// If this method is called, the clickedSqure parameter will not be null!
	// STUDENT SHOULD COMPLETE THIS ENTIRE METHOD!
	private void handleClickedSquare(GameSquare clickedSquare)
	{
//		For the first case, you can simply check to see if selectedSquare is equal to null.
		if (selectedSquare == null)      // no currently selected square
		{
		    // handle the first case
//			If there is a game piece on the clicked square (clickedSquare.getPiece()!= null)
			if (clickedSquare.getPiece() != null) {
//				Make sure the game piece belongs to the current player.  You can get the owning player by calling the 
//				getPlayerType() method on the AbstractGamePiece returned by getPiece().
//				You can then compare that to the currentPlayerTurn JailBreak class member.
				if (clickedSquare.getPiece().getPlayerType() == currentPlayerTurn) {
//					If the piece on the clicked square belongs to the current player
//					Set the selected square equal to the clicked square
//					Call the select() method on the selected square to show the yellow border
					selectedSquare = clickedSquare;
					selectedSquare.select();
				}

			}
		}

//		For the second case you can see if the selectedSquare is equal to the clickedSquare. 
		else if (selectedSquare == clickedSquare) 
		{
		    // handle the second case
//			Call the deselect() method on the selectedSquare to remove the yellow border
			selectedSquare.deselect();
//			Set the selectedSquare variable to null to indicate no square is now selected.
			selectedSquare = null;
		}
		else  // trying to move selected piece to new location
		{
//			Get the selected game piece from the selectedSquare by calling getPiece() on that object.  Store that piece in a local variable.
			AbstractGamePiece movingPiece = selectedSquare.getPiece();
			
//			Get the list of GameSquare objects by calling gameBoard.buildPath(), passing in the selectedSquare and clickedSquare as the starting at target squares.  Store that list also in a local variable.
//			Now call the canMoveToLocation() method on the selected game piece, passing in the list of GameSquare objects as the path.  Save the boolean result that tells us if the move is valid.
			boolean canMove = movingPiece.canMoveToLocation(gameBoard.buildPath(selectedSquare, clickedSquare));
			
//			If the move is valid, move the selected game piece from the selected square to the clicked square:
			if (canMove) {
				
//				Call clickedSquare.setPiece() to put the selected piece in the clicked square
		    	clickedSquare.setPiece(movingPiece);
		    	
//				Call clearSquare() on the selectedSquare to remove the piece from that square
		    	selectedSquare.clearSquare();
		    	
//				Call deselect() on the selectedSquare to remove the yellow border
		    	selectedSquare.deselect();
		    	
//				Set selectedSquare = null to show that no square is currently selected
		    	selectedSquare = null;
		    	/*
		    	 * Find your loop that iterates over the captured pieces returned from findCapturedOpponents().
					Declare a boolean variable kingpinCaptured before this loop and initialize it to false.
					Within your iteration loop, compare each captured piece to the kingpinPiece member variable that keeps track of the Kingpin.
					If the captured piece equals the kingpinPiece, then set kingpinCaptured to true.
					After the iteration loop, if kingpinCaptured is equal to true:
					Set the gameOver member variable = true
					Display a message using JOptionPane.showMessageDialog() that declares the game over because the Kingpin has been captured!
		    	 */
		    	List<AbstractGamePiece> capturedOpponents = findCapturedOpponents(movingPiece.getCol(), movingPiece.getRow());
	    		boolean kingpinCaptured = false;
		    	for (int i = 0; i < capturedOpponents.size(); i++) {
		    		gameBoard.removePiece(capturedOpponents.get(i));
		    		if (capturedOpponents.get(i) == kingpinPiece) {
		    			kingpinCaptured = true;
		    		}
		    		if(capturedOpponents.get(i).getPlayerType() == 0) {
		    			JOptionPane.showMessageDialog(myFrame, "Outlaw captured");
		    		} else if (capturedOpponents.get(i).getPlayerType() == 1) {
		    			JOptionPane.showMessageDialog(myFrame, "Deputy Captured");
		    		}
		    	}
		    	if (kingpinCaptured) {
		    		gameOver = true;
		    		JOptionPane.showMessageDialog(myFrame, "GAME OVER: THE KINGPIN HAS BEEN CAPTURED");
		    		/*Add an else-if() step after checking to see if kingpinCaptured is true .  The logical expression for this else-if statement will be the boolean result of calling hasEscaped() on the currently selected game piece.  If hasEscaped() returns true, then:
		    			Set the gameOver member variable = true
		    			Display a message using JOptionPane.showMessageDialog() that declares the game over because the Kingpin has escaped!
		    			Finally, add an else statement if the Kingpin has not been captured or escaped.  Move your call to changePlayerTurn() within the else statement.  We only want to change to the next player turn if the game is not over.
		    		*/
		    	} else if (kingpinPiece.hasEscaped()){
		    		gameOver = true;
		    		JOptionPane.showMessageDialog(myFrame, "GAME OVER: THE KINGPIN HAS ESCAPED");
		    	} else {
//					Finally, call the JailBreak's changePlayerTurn() method to switch the player's turn now that a valid move has been made.
			    	changePlayerTurn();
		    	}

		    }
		}
	}
	
	// This method is provided as part of the activity starter.  No student modification is needed.
	// This method will return a list of captured opponents if a piece has moved to the indicated column and row.
	private List<AbstractGamePiece> findCapturedOpponents(int col, int row)
	{
		// initialize an ArrayList that will hold any captured opponents
		ArrayList<AbstractGamePiece> capturedOpponents = new ArrayList<AbstractGamePiece>();
		
		// we are going to check each square up/down/left/right to see if there is a piece present.
		// If so, let the piece itself determine if it has been captured or not!
		AbstractGamePiece nearbyPiece = null;

		// get above piece
		nearbyPiece = gameBoard.getPiece(col, row - 1);	
		// if this piece exists and has been captured 
		if ((nearbyPiece != null) && (nearbyPiece.isCaptured(gameBoard)))
		{
			capturedOpponents.add(nearbyPiece);	// add captured piece to the list
		}
		
		// get below piece
		nearbyPiece = gameBoard.getPiece(col, row + 1);	
		// if this piece exists and has been captured 
		if ((nearbyPiece != null) && (nearbyPiece.isCaptured(gameBoard)))
		{
			capturedOpponents.add(nearbyPiece);	// add captured piece to the list
		}
		
		// get left piece
		nearbyPiece = gameBoard.getPiece(col - 1, row);	
		// if this piece exists and has been captured 
		if ((nearbyPiece != null) && (nearbyPiece.isCaptured(gameBoard)))
		{
			capturedOpponents.add(nearbyPiece);	// add captured piece to the list
		}
		
		// get right piece
		nearbyPiece = gameBoard.getPiece(col + 1, row);	
		// if this piece exists and has been captured 
		if ((nearbyPiece != null) && (nearbyPiece.isCaptured(gameBoard)))
		{
			capturedOpponents.add(nearbyPiece);	// add captured piece to the list
		}

		// return the list of captured opponents (may be empty!)
		return capturedOpponents;
	}
}

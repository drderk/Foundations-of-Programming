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

// This class is provided as part of the activity starter.
// STUDENT SHOULD COMPLETE THE CODE AREAS MARKED BELOW!

/** TeenCoder: Java Programming
 * Chapter 15 - Game Pieces Project
 * This abstract class represents one of the game pieces in the 
 * Jail Break game.
 * @author CompuScholar, Inc.
 * @version 1.0
*/

import java.util.*;

abstract public class AbstractGamePiece
{
	// All class members are provided as part of the activity starter!
	
	// These two constants define the Outlaws and Posse teams
	static public final int PLAYER_OUTLAWS = 0;
	static public final int PLAYER_POSSE = 1;

	// These variables hold the piece's column and row index
	protected int myCol;
	protected int myRow;
	
	// This variable indicates which team the piece belongs to
	protected int myPlayerType;
	
	// These two strings contain the piece's full name and first letter abbreviation
	private String myAbbreviation;
	private String myName;

	// All derived classes will need to implement this method
	abstract public boolean hasEscaped();
	
	// The student should complete this constructor by initializing the member
	// variables with the provided data.
	public AbstractGamePiece(String name, String abbreviation, int playerType)
	{
		myName = name;
		myAbbreviation = abbreviation;
		myPlayerType = playerType;
	}

	public int getPlayerType() {
		return myPlayerType;
	}
	public void setPosition(int col, int row) {
		myCol = col;
		myRow = row;
	}
	public int getCol() {
		return myCol;
	}
	public int getRow() {
		return myRow;
	}
	public String getAbbreviation() {
		return myAbbreviation;
	}
	public String toString() {
		return "name: " + myName +", Player Type: " + myPlayerType + ", Row: " + myRow + ", Column: "+ myCol;
	}
	/*
	 * First, check the input path to see if it is empty.  If so then the move between selected square and clicked square is not on a direct horizontal or vertical line, so you can return false immediately.
Next, examine each GameSquare object in the path from beginning to end.  For each square:
Call the isSquareRestricted() method, passing in the square.  If the result is true, then return false because the path is blocked by a restricted square.
Call getPiece() on the square to see if any AbstractGamePiece is present.  
If there is a piece present (a non-null value returned) then the path is blocked, so return false.
If you finish iterating over all steps in the path and do not find any blocked or restricted squares, then the move is valid so return true.
	 */
	public boolean canMoveToLocation(List<GameSquare> path) {
		boolean returnVal = true;
		if (path.size() != 1) {
			returnVal = false;
		}
		for (int i = 0; i <path.size(); i++) {
			if (isSquareRestricted(path.get(i))) {
				returnVal = false;
			}
			if (path.get(i).getPiece() != null) {
				returnVal = false;
			}
		}
		return returnVal;
	}
	abstract protected boolean isSquareRestricted(GameSquare step);
	
	public boolean isCaptured(GameBoard gameBoard) {
		AbstractGamePiece nearbyPiece1 = gameBoard.getPiece(myCol, myRow - 1); 
		AbstractGamePiece nearbyPiece2 = gameBoard.getPiece(myCol, myRow + 1);
		AbstractGamePiece nearbyPiece3 = gameBoard.getPiece(myCol - 1, myRow); 
		AbstractGamePiece nearbyPiece4 = gameBoard.getPiece(myCol + 1, myRow); 
		boolean returnVal = false;
		if (nearbyPiece1 != null && nearbyPiece2 != null && nearbyPiece1.getPlayerType() != myPlayerType && nearbyPiece2.getPlayerType() != myPlayerType) {
			returnVal = true;
		}
		else if (nearbyPiece3 != null && nearbyPiece4 != null && nearbyPiece3.getPlayerType() != myPlayerType && nearbyPiece4.getPlayerType() != myPlayerType) {
			returnVal = true;
		}
		return returnVal;
	}
	
}

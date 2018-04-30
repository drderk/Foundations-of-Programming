import java.util.List;

public class Kingpin extends AbstractGamePiece    
{
    public Kingpin() {
		super("Kingpin","K", AbstractGamePiece.PLAYER_OUTLAWS);
		// TODO Auto-generated constructor stub
	}
	public boolean canMoveToLocation(int targetCol, int targetRow)
    {
    	//implementation details go here
		return false;
    }
 // this special method is available only to Kingpins
    public boolean hasEscaped()
    {
    	
        // implementation details go here based on 
    	/*If the Kingpin is on the top row then myRow will equal 0, so you can return true in that case.
    			If the Kingpin is on the left column then myCol will equal 0, so you can return true in that case.
    			If the Kingpin is on the bottom row then myRow will equal 8, so you can return true in that case.
    			If the Kingpin is on the right column then myCol will equal 8, so you can return true in that case.
    			Otherwise, the Kingpin has not escaped so you can return false!*/
    	if (this.myRow == 0 || this.myRow == 8) {
    		return true;
    	}
    	else if( this.myCol == 0 || this.myCol == 8){
    		return true;
    	} 
    	else {
            // myCol and myRow     
    		return false;   	
    	}  
    }
    @Override
    /*
     * Add the isSquareRestricted() method to each concrete class.
Within each method, get the input GameSquare type by calling step.getType().
If the type equals one of the restricted squares for that piece (GameSquare.TYPE_JAIL and possibly GameSquare.TYPE_CAMP), return true.
If the type is not one of the restricted squares for that piece, return false.(non-Javadoc)
     * @see AbstractGamePiece#isCaptured(GameBoard)
     */
    public boolean isCaptured(GameBoard gameBoard) {
		AbstractGamePiece nearbyPiece1 = gameBoard.getPiece(myCol, myRow - 1); 
		AbstractGamePiece nearbyPiece2 = gameBoard.getPiece(myCol, myRow + 1);
		AbstractGamePiece nearbyPiece3 = gameBoard.getPiece(myCol - 1, myRow); 
		AbstractGamePiece nearbyPiece4 = gameBoard.getPiece(myCol + 1, myRow);
		boolean returnVal = false;
		if (nearbyPiece1 != null && nearbyPiece1.getPlayerType() != myPlayerType) {
			if (nearbyPiece2 != null && nearbyPiece2.getPlayerType() != myPlayerType) {
				if (nearbyPiece3 != null && nearbyPiece3.getPlayerType() != myPlayerType) {
					if (nearbyPiece4 != null && nearbyPiece4.getPlayerType() != myPlayerType) {
						returnVal = true;
					}
				}
			}
		}
		return returnVal;
		
	}
	@Override
	protected boolean isSquareRestricted(GameSquare step) {
		if (step.getType() == GameSquare.TYPE_CAMP) {
			return true;
			}
			else {
				return false;
			}
	}
}
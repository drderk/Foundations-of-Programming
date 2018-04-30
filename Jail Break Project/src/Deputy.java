import java.util.List;

public class Deputy extends AbstractGamePiece 
{
	
    public Deputy() {
    	 super("Deputy", "D", AbstractGamePiece.PLAYER_POSSE);
		// TODO Auto-generated constructor stub
	}
	// Implement the abstract method defined in the base class.
    public boolean canMoveToLocation(int targetCol, int targetRow)
    {
		return false;
        // implementation details go here
    }
    @Override
    public String toString()
    {
      // use the base class version of toString() and add extra text
      return super.toString() + " - Law man is coming!";
    }
	@Override
	public boolean hasEscaped() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	/*
	 * Add the isSquareRestricted() method to each concrete class.
Within each method, get the input GameSquare type by calling step.getType().
If the type equals one of the restricted squares for that piece (GameSquare.TYPE_JAIL and possibly GameSquare.TYPE_CAMP), return true.
If the type is not one of the restricted squares for that piece, return false.(non-Javadoc)
	 * @see AbstractGamePiece#isSquareRestricted(GameSquare)
	 */
	protected boolean isSquareRestricted(GameSquare step) {
		if (step.getType() == GameSquare.TYPE_JAIL) {
		return true;
		}
		else {
			return false;
		}
	}
    
}
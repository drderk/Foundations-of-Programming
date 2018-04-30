import java.util.List;

public class Henchman extends AbstractGamePiece    
{
    public Henchman() {
		super("Henchman", "H", AbstractGamePiece.PLAYER_OUTLAWS);
		// TODO Auto-generated constructor stub
	}

	// Implement the abstract method defined in the base class.
    public boolean canMoveToLocation(int targetCol, int targetRow)
    {
		return false;
        // implementation details go here
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
		if (step.getType() == GameSquare.TYPE_CAMP || step.getType() == GameSquare.TYPE_JAIL) {
			return true;
			}
			else {
				return false;
			}
	}

}
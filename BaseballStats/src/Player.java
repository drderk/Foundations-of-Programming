
public class Player implements Comparable<Player>{
//	A String value for the player's name
	String name = "";
//	An integer array of 5 elements that will hold the number of this player's hits for each game
	Integer[] hits = new Integer[5];
	public Player(String name , Integer[] hits) {
		this.name = name;
		this.hits = hits;
	}
	@Override
	public int compareTo(Player arg0) {
		int result = name.compareTo(arg0.name);
		return result;
	}
}

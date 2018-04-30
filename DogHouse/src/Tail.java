
public class Tail {
	private String size =  "I have a long tail";
	private Boolean wagging = true;
	private Boolean betweenLegs = false;
	
	//gets size of tail
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	//returns whether tail is wagging or not
	public Boolean isTailWagging() {
		return wagging;
	}
	
	public void setWagging(Boolean wag) {
		wagging = wag;
	}
	
	//returns whether the tail is between the legs or not
	public Boolean isTailBetweenLegs() {
		return betweenLegs;
	}
	
	public void setTailPos(Boolean pos) {
		betweenLegs = pos;
	}
	
}

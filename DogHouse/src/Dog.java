
public class Dog {

	private int numTimesFed = 0;
	private boolean sleeping = false;
	private String name = "Max";
	Tail myTail = new Tail();
	DoggyHouse myDogHouse = new DoggyHouse();
	
	//returns the name of the dog
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	//wakes up the dog
	public void wakeUp() {
		System.out.println("WAKING UP");
		sleeping = false;
		numTimesFed = 0;
	}
	//dog goes to sleep
	public void sleep() {
		sleeping = true;
		System.out.println("SLEEPING");
	}
	//dog hears a sound
	public void hear(String sound) {
		
		if (sleeping ) {
			return;
		} 
		else {
			if (sound.equalsIgnoreCase(name)) {
			 System.out.println("WAG TAIL");
			 return;
			}
			else if (sound.equalsIgnoreCase("ding-dong")) {
				System.out.println("BARK");
				return;
			}
			else {
				return;
			}
		 
		}
	}
	
	//feeds dog
	public void feed() {
		if (sleeping) {
			return;
		}
		else {
			numTimesFed += 1;
		}
		if (numTimesFed > 2) {
			System.out.println("YAWN");
		}
		else {
			System.out.println("YUMMY");
		}
		
	}
	
	//puts the dog in the dog house
	public void goToDogHouse()
	{
	   	this.myDogHouse.goingIntoDogHouse(this);
	}
	//dog leaves the dog house
	public void leaveDogHouse()
	{
	   	this.myDogHouse.leavingDogHouse(this);
	}

}

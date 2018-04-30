
public class DoggyHouse {

	//when the dog is going into the dog house
	public void goingIntoDogHouse (Dog currentDog) {
		String name = currentDog.getName();
		System.out.println(name + " Says Good night, I’m going into my dog house to sleep");
	}
	
	//when the dog is leaving the dog house
	public void leavingDogHouse (Dog currentDog) {
		String name = currentDog.getName();
		System.out.println(name + " Says Good Morning, I’m coming out of my dog house");
	}
	
}

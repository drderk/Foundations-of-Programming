/**
 * This was made by Derek Perdomo
 */
public class RaceCar implements IRacer{
	String myName         = "Racer 13";
	double myMaxSpeed     = 100;
	double myAcceleration = 50;
	double myCurrentSpeed = 0;
	
	public RaceCar(String name, double maxSpeed, double acceleration) {
		this.myName = name;
		this.myMaxSpeed = maxSpeed;
		this.myAcceleration = acceleration;
		myCurrentSpeed = 0;
	}
	public String getName() {
		return myName;
	}
	public double getCurrentSpeed() {
		return myCurrentSpeed;
	}

	public void resetCurrentSpeed() {
		myCurrentSpeed = 0.0;
	}
	
	public void accelerate() {
		myCurrentSpeed = myCurrentSpeed + myAcceleration;
		if (myCurrentSpeed > myMaxSpeed) {
			myCurrentSpeed = myMaxSpeed;
		}
	}
	
}

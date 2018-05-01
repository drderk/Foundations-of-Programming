/*At its closest point to Earth, Mars is approximately 34 million miles away. 
 * Assuming there is someone on Mars that you want to talk with, what is the delay between 
 * the time a radio signal leaves Earth and the time it arrives on Mars?  
 * This project creates a program that answers this question.  
 * Light travels approximately 186,000 miles per second.  
 * Thus, to compute the delay you will need to divide the distance by the speed of light.  
 * Display the delay in terms of seconds and minutes.  For example,
Time delay when talking to mars is _______ seconds. 
This is about _______ minutes. */

public class CalculateDelayTime {

	public static void main(String[] args) {
		final double DISTANCE_FROM_MARS = 34000000; 		//distance from mars in miles
		final double SPEED_OF_LIGHT = 186000; 				//speed of light in miles per second	
		double delayTime = 0.0; 							//delay time in seconds
		delayTime = (DISTANCE_FROM_MARS / SPEED_OF_LIGHT);  //calculating delay time
		
		System.out.printf("%s%.2f%s\n%s%.2f%s","Time Delay when talking to mars is ", delayTime,"seconds", "This is about ", (delayTime/60)," minutes");
		System.exit(0);
	}

}

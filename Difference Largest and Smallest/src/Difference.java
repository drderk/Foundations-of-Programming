
public class Difference {

	public static void main(String[] args) {
		//initializes variables
		Integer[] array = new Integer[50];
		Integer   max 	= 0;
		Integer   min   = 100;
		Integer   difference   = 0;
		
		//adds a random value to each array index
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
			System.out.println("Array Values: " + array[i]);
			
			//creates max and min values
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		//prints out max and min values
		System.out.println();
		System.out.println("Max value: " + max);
		System.out.println("Min value: " + min);
		
		//calculates difference
		difference = max - min;
		System.out.println("Difference: " + difference);
		
	}

}

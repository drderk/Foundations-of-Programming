import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		//initializes variables
		Scanner input = new Scanner(System.in);
		long number = 0;
		long factorial = 1;
		boolean inRange = true;
		
		//checks if the number is within range and is an integer.
		while (inRange) {
		System.out.println("Enter a number");
		while(!input.hasNextInt()) {
			System.out.println("That is not an integer, please try again:");
			input.nextLine();
		}
		number = input.nextInt();
		
		//for() loop factorial
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		
		//checks if the number is too large
		if (factorial <= 0) {
			System.out.println("Im sorry, that number is too large. Please try again.");
			inRange = true;
		}else {
			inRange = false;
		}
		}
		System.out.println("for() loop result: " + factorial);
		
		//do-while loop factorial
		factorial = 1;
		int counter = 1;
		do {
			factorial *= counter;
			counter++;
		} while (counter <= number);
		System.out.println("do-while() loop result: " + factorial);
		
		//while loop factorial
		factorial = 1;
		int counter2 = 1;
		while (counter2 <= number) {
			factorial *= counter2; 
			counter2++;
		}
		System.out.println("while() loop result: " + factorial);
	}

}

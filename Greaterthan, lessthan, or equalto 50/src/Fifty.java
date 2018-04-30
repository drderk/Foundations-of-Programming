import java.util.Scanner;

public class Fifty {

	public static void main(String[] args) {
		//variables
		int num = 0;
		String garbage = "";
		Scanner input = new Scanner(System.in);
		String compare = "";
		
		//input
		System.out.println("Enter an integer between 1 and 100 (noninclusive)");
		//checks if input is valid
		if (input.hasNextInt()) {
			num = input.nextInt();
			//checks if the number is between 1 and 100
		if (num > 1 && num < 100) {
			//checks if number is >,<, or = 50.
			if (num > 50) {
				compare = "greater than ";
			} else if (num == 50) {
				compare = "equal to ";
			} else if (num < 50 ) {
				compare = "less than ";
			}
			System.out.println(num + " is " + compare + "50.");
		}
		else {
			System.out.print(num + " is not a valid input");
		}
		}
		else {
			//displays garbage value if the input is not valid.
			garbage = input.next();
			System.out.print(garbage + " is not a valid input");
		}

	}

}
	

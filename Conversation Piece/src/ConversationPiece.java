import java.util.Scanner;

/*To complete this assignment, you will 
 * ask the user to input a variety of 
 * data such as a name, noun, verb, 
 * integer, and double (real or decimal 
 * number).  You will use the Scanner 
 * object to receive the data, validating 
 * it where necessary.  Then build a new 
 * string that combines the input data 
 * into a short story and print the 
 * results to the screen.*/
public class ConversationPiece 
{

	public static void main(String[] args) 
	{
		//Create a new Scanner variable to accept input from System.in
		Scanner input = new Scanner(System.in);
	
		/*Create five variables to hold your user’s input data, and initialize them to some default value.
		Three Strings called name, noun, and verb
		An int called int1 with a default value of 1
		A double called double1 */
		String name = "";
		String noun = "";
		String verb = "";
		String story = "";
		int int1 = 1;
		double double1 = 0;
		
		//booleans for verifications
		boolean answer1 = true;
		boolean answer2 = true;
		boolean answer3 = true;
		boolean answer4 = true;
		boolean answer5 = true;
	
		//Ask the user for their name
		while(answer1) {
		System.out.print("Enter your name:");
		if (input.hasNextDouble()) {
			String garbage = input.next();
			System.out.println(garbage + " is not a name");
			input.nextLine();
		}
		else {
		name = input.nextLine();
		answer1 = false;
		}
		}
	
		//Ask the user for a noun
		while (answer2) {
		System.out.println("\nEnter a noun:");
		if(input.hasNextDouble()) {
			String garbage = input.next();
			System.out.println(garbage + " is not a noun");
			input.nextLine();
		}
		else {
			noun = input.next();
			input.nextLine();
			answer2 = false;
		}
		}
	
		//Ask the user for a verb
		while (answer3) {
		System.out.print("\nEnter a verb:");
		if (input.hasNextDouble()) {
			String garbage = input.next();
			System.out.println(garbage + " is not a verb");
			input.nextLine();
		} else {
		verb = input.next();
		input.nextLine();
		answer3 = false;
		}
		}
		
		//Ask the user for an integer.
		while (answer4) {
		System.out.print("\nEnter an integer:");
		//Verify the integer is present with hasNextInt() and then store the result in your int1 variable.
		if (input.hasNextInt()) 
		{
			int1 = input.nextInt();
			System.out.print("this is what you entered: " + int1);
			answer4 = false;
		} 
		else 
		{
			String garbage = input.next();
			System.out.print("\n" + garbage + " is not a valid integer");
			input.nextLine();
		}
		input.nextLine();
		}
		//Ask the user for a real or decimal number
		while (answer5) {
		System.out.print("\nEnter a double:");
		//Verify the integer is present with hasNextDouble() and then store the result in your double1 variable.
		if (input.hasNextDouble()) 
		{
			double1 = input.nextDouble();
			System.out.println("this is the variable you entered:" + double1);
			answer5 = false;
		} 
		else 
		{	
			String garbage = input.next();
			System.out.print("\n" + garbage +" is not a valid double");
			input.nextLine();
		}
		}
		input.nextLine();
		input.close();
		
		//Writes a story
		story = "One day, " + name + " picked up a "+ noun;
		story += " and decided to " + verb + " it. \n";
		story += "After getting arrested, spending " + int1;
		story += " days in jail, and paying a $" + double1 + " fine,\n";
		story += name + " decided that was a bad idea!";
		System.out.println(story);
		System.exit(0);
	}
}

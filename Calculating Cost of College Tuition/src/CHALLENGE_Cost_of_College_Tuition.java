/*Cost of College Tuition:  Create a program that will calculate the estimated cost of the 4 year public/private college based on the mathematical model that takes into account the increase trend of tuition from year to year.
Formula to use for a private 4 year college:  T = 26x2 + 819x + 15,527.  This models the average cost of tuition and fees, 'T', at private U.S. colleges for the school year ending 'x' years after 2000.
Formula to use for a public 4 year college:  T = 4x2 + 341x + 3194.  This models the average cost of tuition and fees, 'T', at public U.S. colleges for the school year ending 'x' years after 2000.   This program makes use of the Pow() method

Variables that will be needed and initialized accordingly;
yearEntered = 2017; 
yearsAfter2000 = yearEntered - 2000;
costPublicTuition  //receives the result of 4x2 + 341x + 3194
costPrivateTuition  //recieves the result of 26x2 + 819x + 15,527
*/

import java.util.Scanner;
public class CHALLENGE_Cost_of_College_Tuition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double yearEntered = 2017;
		double value1 = 0;
		String school = "";
		//while statement parameters
				boolean answer1 = true;
				boolean answer2 = true;
		
				while (answer1) {
					//Asks what year college you are entering college?
					System.out.println("What year are you entering college? (After 2000)");
					//checks if the value is a double
					if (input.hasNextDouble()) {
						value1 = input.nextDouble();
						//checks if the year entered is greater than 2000
						if (value1 > 2000) {
							yearEntered = value1;
							answer1 = false;
						} else {
							//if its not greater than 2000, then it asks the question again.
							System.out.println("That is not a valid input");
							answer1 = true;
						}

					} else {
						//if its not a number, then it asks the question again.
						System.out.println("That is not a valid input");
						answer1 = true;
						input.nextLine();
					}
				}
				double yearsAfter2000 = (yearEntered - 2000);
				double x = yearsAfter2000; //Years after 2000

				while (answer2) {
					//Asks if this is a public or private school
					System.out.println("Are you going to a public or private school?");
					school = input.next();
					//if its a public school, then it runs the public calculation and displays the public tuition sentence.
					if (school.equalsIgnoreCase("public")) {
						double costPublicTuition = (4 * (Math.pow(x, 2)) + 341*(x) + 3194);
						System.out.printf("%s%.2f\n","The cost of public tuition " + yearsAfter2000 + " years after 2000 is $", costPublicTuition);
						answer2 = false;
						//if its a public school, then it runs the private calculation and displays the private tuition sentence.
					} else if (school.equalsIgnoreCase("private")){
						double costPrivateTuition = (26 * (Math.pow(x, 2)) + 819*(x) + 15527);
						System.out.printf("%s%.2f","The cost of private tuition " + yearsAfter2000 + " years after 2000 is $" , costPrivateTuition);
						answer2 = false;
						// All the rest of the answers are invalid, so it returns the question.
					} else {
						System.out.println("That is not a valid input");
						answer2 = true;
						input.nextLine();
					}
				}
				//closes the input and system
				input.close();
				System.exit(0);
	}

}

/*Create a program that calculates the percentage of jobs in the U.S. labor force, 'P' held by women and/or men 't' years after 1972:
·         P = 2.2 sqrt(t) + 36.2  (Women)
·         P = -2.2 sqrt(t) + 63.8 (Men)
(This exercise introduces the sqrt() method; Math.sqrt( ) )       

Variables you will need to declare and initialize:
percentageJobsMen  //will receive the result of  -2.2 sqrt(t) + 63.8 (Men)
percentageJobsWomen  //will receive the result of 2.2 sqrt(t) + 36.2  (Women)
year = 2000  //year will change to fit your fancy, any year after 1972 will be fine
yearsAfter1972 = year - 1972

After applying the formula display the percentage calculated.  If you initialize year to be 2000 then your output should be as follows:  
Percentages of jobs in the U.S. labor force held by women 28 years after 1972 is 48%.
Percentages of jobs in the U.S. labor force held by men 28 years after 1972 is 52%.
NOTE:  NO LITERALS SHOULD BE USED IN YOUR OUTPUT, OTHER THAN THE STRING LITERALS.  THE VALUE 28 COMES FROM THE VARIABLE yearsAfter1972, the 48 COMES FROM THE VARIABLE percentageJobsWomen AND THE 52 CAME FROM THE VARIABLE percentageJobsMen.

Challenge:  Create a program that prompts the user for the year. One way to do this is shown to you in Ch 6 Lsn 2; another way is using the Scanner utility. Take a look at the code in the document: “How to get user input using a console app in Java”  

You will need to verify the user entered a valid year after 1972 and not some garbage value or nothing at all.
*/
import java.util.Scanner;

public class CalcPercentOfJobs {

	public static void main(String[] args) {
		Scanner year = new Scanner(System.in);
		double PMen = 0;
		double PWomen = 0;
		double t = 0;
		boolean answer = true;
		
		while(answer) { //This repeats the question if the year is before 1972
			System.out.println("What is the year?"); //Displays the question to the console
			if (year.hasNextDouble()) { //Checks to make sure the answer is a number
				t = year.nextDouble(); //asks user input
				if (t >= 1972) { // returns false if the year is after 1972
					answer = false;
			} else {
				System.out.println("That is not a year after 1972");
			}
			} else { //tells the user that the year is invalid
			System.out.println("That is not a valid number");
			year.nextLine();
			answer = true;
			}
		}
		year.close(); //closes user input on console
		double yearsAfter1972 = (t - 1972);
		PMen = (-2.2 * Math.sqrt((yearsAfter1972)) + 63.8); //Calculate percentage of males with jobs
		PWomen = (2.2 * Math.sqrt((yearsAfter1972)) + 36.2);//Calculates percentage of females with jobs
		if (PMen < 0) { //restricts minimum value
			PMen = 0;
		}
		if (PWomen > 100) { //restricts maximum value
			PWomen = 100;
		}
		System.out.println("Percentages of jobs in the U.S. labor force held by men " + yearsAfter1972 +" years after 1972 is " + PMen + "%."); //Displays percentage for men
		System.out.println("Percentages of jobs in the U.S. labor force held by women " + yearsAfter1972 +" years after 1972 is " + PWomen + "%."); //Displays percentage for women.

	}

}

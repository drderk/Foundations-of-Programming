//p*(r*(1+r)^n) / ((1+r)^n - 1)
/*
Create a program that computes the regular payments on a loan, such as a car loan.  Given the principal, the length of time, number of payments per year, and the interest rate, the program will compute the payment.  Since this is a financial calculation, it makes sense to use the float (decimal) data type to represent the data.  This project also demonstrates type casting and the "pow()" method.   To compute the payments, you will use the following formula:
Monthly Payment (M) = p*(r*(1+r)^n) / ((1+r)^n - 1)  ‘^’ means raised to the n power
Where
P=Amount borrowed, r = interest rate/12, n=number of months of the loan
Notice that in the denominator there is a base and an exponent.  You calculate that using the math method Pow(). 
Here's how you'll call it:  result = Math.Pow(base, exp);  'base' is of type double and 'exp' is of type integer.  The method Pow()  returns a value of type double.  Therefore, the variable that gets the result of Pow() needs to be of type double or if it is not type double explicitly cast the result to the type the receiving variable is. (See Ch 4 Lsn 2)
Run 3 test with an interest rate of 7%, duration of loan is 48 months and loan amount (p) of
·         10,000 Monthly payments should calculate to 239/month
·          20,000 Monthly payments should calculate to 479/month
·          30,000 Monthly payments should calculate to 718/month
*/
import java.util.Scanner;
public class CarLoanPayments {

	public static void main(String[] args) {
		//starting variables
		Scanner input = new Scanner(System.in);
		double principal = 10000;
		double months = 48; // time in months
		double interestRate = .07;
		
		//while statement parameters
		boolean answer1 = true;
		boolean answer2 = true;
		boolean answer3 = true;
		
		//asks for loan amount and checks to make sure the input is valid
		System.out.println("What is the loan amount?");
		while (answer1) {
			double value1 = 0;
			if (input.hasNextDouble()) {
				value1 = input.nextDouble();
				principal = value1;
				answer1 = false;
			} else {
				System.out.println("That is not a valid input");
				answer1 = true;
				input.nextLine();
			}
		}
		input.nextLine();
		
		//asks for interest rate and checks to make sure the input is valid
		System.out.println("What is interest rate in %?");
		while (answer2) {
			if (input.hasNextDouble()) {
				double value2 = input.nextDouble();
				interestRate = (value2 / 100);
				answer2 = false;
			} else {
				System.out.println("That is not a valid input");
				answer2 = true;
				input.nextLine();
			}
		}
		input.nextLine();
		
		//asks for months and checks to make sure the input is valid
		System.out.println("What is the number of months?");
		while (answer3) {
			if (input.hasNextDouble()) {
				double value3 = input.nextDouble();
				months = value3;
				answer3 = false;
			} else {
				System.out.println("That is not a valid input");
				answer3 = true;
				input.nextLine();
			}
		}
		//sets all the input values for the formula
		double p = principal;
		double n = months;
		double r = (interestRate / 12);
		
		//calculates the formula
		float monthlyPayments = (float)(p*(r*Math.pow((1+r),n)) / (Math.pow((1+r),n) - 1));
		
		//prints results
		System.out.print(monthlyPayments);
	}

}

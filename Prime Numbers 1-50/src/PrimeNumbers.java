//Extra Credit Directions to Show Primes 1 to 50
//Write a program that outputs the prime numbers from between 1 and 50. NOTE: Requires modulus
//operator and a nested for loop but easy exercise for the students.
//Complete this assignment in two ways. Copy and paste your code to both ways when submitting your
//code.
//One way to test for prime numbers is to try to divide the number being tested by all numbers stating at
//2 up to the number being tested. If you get a remainder of zero the number being tested is not prime
//A more efficient method: Another way to test for primes is to try to divide by integers up to the square
//root of the number being tested. Modify your code to test for a prime number using this method.
public class PrimeNumbers {

	public static void main(String[] args) {
		//initialize variable
		boolean prime = false;
		boolean skip  = false;
		int 	num	  = 50;
		int		i	  = 1;
		//tests for runs a counter to a given number
		for (i = 1; i <= num; i++) {
			skip = false;
			//increments divisible numbers
			for (int j = 2; j < i; j++) {
			//skips the rest of the test if it finds a divisible number
			if (!skip) {
			//tests for remainder
			if (i%j == 0) {
				prime = false;
				skip = true;
			} else {
				prime = true;
			}
			}
			}
			//prints prime numbers
			if (prime) {
				System.out.println(i + " is a prime number.");
			}
		}
		//tests for runs a counter to a given number
		
		for (i = 1; i <= 50; i++) {
			skip = false;
			int j = 2;
			//increments divisible numbers
			for (j = 2; j<= Math.sqrt(i) ; j++) {
			//skips the rest of the test if it finds a divisible number
			if (!skip) {
			//tests for remainder
			if (i%j == 0) {
				prime = false;
				skip = true;
			} else {
				prime = true;
			}
			}
			}
			//prints out prime numbers.
			if (prime) {
				System.out.println(i + " is a prime number.");
			}
		}
	}

}

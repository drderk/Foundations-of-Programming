import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		//Variables
		int number = 0; 
	    int answer = 0;
	    Scanner input = new Scanner(System.in);
	    
	    //Ask user for a number
	    System.out.print("Enter a multiplication number: "); 
	    number = input.nextInt();
	    
	    //Multiply the number by all the times table values
	    for (int i = 0; i <= 10; i++)
	    {
	         answer = number * i;
	         System.out.println(i + " x " + number + " = " + answer);
	    }
	    //close input
	     input.close();
	     System.exit(0);
	}
}

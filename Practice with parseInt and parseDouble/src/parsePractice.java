import java.util.Scanner;

public class parsePractice {

	public static void main(String[] args) {
//		initialize variables
		Integer sumI   = 0;
		Integer[] integer = new Integer[4];
		Double[]  doub   = new Double[4];
		Double  sumD   = 0.0;
		
//		asks the user for 4 integers and doubles.	
			integer = askInt();
			doub = askDouble();
		
//		sums the values
		sumI = (int) Sum(integer[0], integer[1],integer[2],integer[3]);
		sumD = Sum(doub[0], doub[1], doub[2], doub[3]);
		
//		outputs the sums
		System.out.println("The sum of the integers is : " + sumI);
		System.out.printf("The sum of the doubles is :  %.2f", sumD);
		
	}
	
	public static Integer[] askInt() {
		Scanner input  = new Scanner(System.in);
		String[] str = new String[4];		
//		Stores the integers as 4 strings
		Integer[] integer   = new Integer[4];
		boolean loop = true;
		
		//asks for values
		while (loop) {
			try {
			System.out.println("Please enter 4 integers");	
			str[0] = input.next();
			str[1] = input.next();
			str[2] = input.next();
			str[3] = input.next();
			
//			converts the strings to integers
			integer[0] = Integer.parseInt(str[0]);
			integer[1] = Integer.parseInt(str[1]);
			integer[2] = Integer.parseInt(str[2]);
			integer[3] = Integer.parseInt(str[3]);
			
			loop = false;
			} catch (NumberFormatException io) {
				System.out.println("Whoops, you entered garbage values. Your values were: " + str[0] + ", " + str[1] + ", " + str[2] + ", " + str[3] + ".");
				input.nextLine();
				loop = true;
			}
		}
		
//		tells the user what they wrote
		System.out.println("str0 value: " + str[0]);
		System.out.println("str1 value: " + str[1]);
		System.out.println("str2 value: " + str[2]);
		System.out.println("str3 value: " + str[3]);
		input.nextLine();
		return integer;
		}
	
	public static Double[] askDouble() {
		Scanner input  = new Scanner(System.in);
		String[] str = new String[4];		
//		Stores the doubles as 4 strings
		Double[] doub   = new Double[4];
		boolean loop = true;
		
		//asks for values
		while (loop) {
			try {
			System.out.println("Please enter 4 doubles");	
			str[0] = input.next();
			str[1] = input.next();
			str[2] = input.next();
			str[3] = input.next();
			
//			converts the strings to integers
			doub[0] = Double.parseDouble(str[0]);
			doub[1] = Double.parseDouble(str[1]);
			doub[2] = Double.parseDouble(str[2]);
			doub[3] = Double.parseDouble(str[3]);
			
			loop = false;
			} catch (NumberFormatException io) {
				System.out.println("Whoops, you entered garbage values. Your values were: " + str[0] + ", " + str[1] + ", " + str[2] + ", " + str[3] + ".");
				input.nextLine();
				loop = true;
			}
		}
		
//		tells the user what they wrote
		System.out.println("str0 value: " + str[0]);
		System.out.println("str1 value: " + str[1]);
		System.out.println("str2 value: " + str[2]);
		System.out.println("str3 value: " + str[3]);
		input.nextLine();
		return doub;
		}
	
	// sums values
	public static double Sum(double num1, double num2, double num3, double num4) {
	double sum = num1 + num2 + num3+ num4;
	return sum;
	}

}

import java.util.Scanner;

public class StringEC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double  money = 0.0;
		String  print = "";
		
		while (!input.hasNextDouble()) {
			String garbage = input.nextLine();
			System.out.println("oops, u entered an invalid input. Your input was \"" + garbage +"\". Please try again.");
		}
		
		money = input.nextDouble();
		print = String.format("%.2f", money);
		
		for (int i = 0; print.length() < 9; i++) {
			print = "*" + print;
		}
		
		System.out.println(print);
		System.out.println("---------");
		System.out.println("123456789");
	}

}

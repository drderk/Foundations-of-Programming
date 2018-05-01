import java.util.Scanner;

public class StringEC2 {

	public static void main(String[] args) {
		Scanner   input = new Scanner(System.in);
		Double    money = 0.0;
		String    print = "";
		char[]    words = null;
		
		while (!input.hasNextDouble()) {
			String garbage = input.nextLine();
			System.out.println("oops, u entered an invalid input. Your input was \"" + garbage +"\". Please try again.");
		}
		
		money = input.nextDouble();
		print = String.format("%.2f", money);
		
		for (int i = 0; print.length() < 9; i++) {
			print = "*" + print;
		}
		words = print.toCharArray();
		
		for (int i = 0 ; i < print.length(); i++) {
			if (words[i] == '1') {
				if (words[0] == '1' || words[3] == '1') {
					if (words[0] == '1') {
						System.out.print("one hundred thousand");
					} else {
						System.out.print("one hundred ");
					}
				} else {
				System.out.print("one ");
				}
			}
			if (words[i] == '2') {
				System.out.print("two ");
			}
			if (words[i] == '3') {
				System.out.print("three ");
			}
			if (words[i] == '4') {
				System.out.print("four ");
			}
			if (words[i] == '5') {
				System.out.print("five ");
			}
			if (words[i] == '6') {
				System.out.print("six ");
			}
			if (words[i] == '7') {
				System.out.print("seven ");
			}
			if (words[i] == '8') {
				System.out.print("eight ");
			}
			if (words[i] == '9') {
				System.out.print("nine ");
			}
			
		}
		System.out.println();
		System.out.println(words);
		System.out.println("---------");
		System.out.println("123456789");
	}

	}


import java.util.Scanner;

public class Polynomial {
	//main method
	public static void main(String[] args) {
		//initializes variables
		String poly = callPoly();
		String polarity = polarity(poly);
		String behavior = behavior(poly);
		String sign     = "Positive";
		String ending   = " ";
		//interprets polarity
		if (polarity == "-") {
			sign = "Negative";
		}
		
		//interprets polaritu and sign
		if (sign.equalsIgnoreCase("positive") && behavior.equalsIgnoreCase("odd")) {
			ending = "falls left and rises right";
		}
		else if (sign.equalsIgnoreCase("positive") && behavior.equalsIgnoreCase("even")) {
			ending = "rises left and rises right";
		} 
		else if (sign.equalsIgnoreCase("negative") && behavior.equalsIgnoreCase("odd")) {
			ending = "falls right and rises left";
		}
		else if (sign.equalsIgnoreCase("negative") && behavior.equalsIgnoreCase("even")) {
			ending = "falls left and falls right";
		}
			
		//prints polynomial, polarity, and its end behavior
		System.out.printf("%s %s", poly, ending);

	}
	//asks the user for a polynomial
	public static String callPoly() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a polynomial. Order the binomial from greatest degree to smallest. Make sure to use '^' before your exponents.");
		String poly   = input.nextLine();
		String polyNoSpace = poly.replaceAll("\\s","");
		return polyNoSpace;
	}
	//determines the polarity
	public static String polarity(String poly) {
		String sign = "+";
		
		if (poly.indexOf('-') == 0) {
			sign = "-";
		}
		return sign;
	}
	//determines behavior
	public static String behavior(String poly) {
		String   behavior = "even";
		String[] polySplit = {""};
		String[] polySplitB = {""};
		Character polySplitPow = ' ';
		
		if (poly.contains("+")) {
			polySplitB = poly.split("\\+");
			if (poly.indexOf("+") == 0) {
				polySplit = polySplitB[1].split("-");
				polySplitPow = polySplit[0].charAt(polySplit[0].length() - 1);
			}
			else {
				polySplit = polySplitB[0].split("-");
				polySplitPow = polySplit[1].charAt(polySplit[1].length() - 1);
			}
		} else if (poly.contains("-")) {
			polySplitB = poly.split("-");
			if (poly.indexOf("-") == 0) {
				polySplit = polySplitB[1].split("//+");
				polySplitPow = polySplit[0].charAt(polySplit[0].length() - 1);
			}
			else {
				polySplit = polySplitB[0].split("//+");
				polySplitPow = polySplit[0].charAt(polySplit[0].length() - 1);
			}
		} else {
			polySplitPow = poly.charAt(poly.length() - 1);
		}
		
		String num = polySplitPow.toString();
		Double power = Double.parseDouble(num);
		
		if (power % 2 != 0) {
			behavior = "odd";
		}
		return behavior;
	}

}

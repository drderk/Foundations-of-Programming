import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double money = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		double remainder = 0;
		
		System.out.println("Enter a dollar amount between $0 and $10");
		money = input.nextDouble();
		//quarter calculation
		quarter = (int)(money / 0.25);
		remainder = (money - (quarter * 0.25)); 
		
		//dimes calculation
		dime = (int) (remainder / 0.1);
		remainder = (remainder - (dime * 0.1));
		
		//nickel calculation
		nickel = (int)(remainder / 0.05 );
		remainder = (remainder- (nickel * 0.05));
		
		//penny calculation
		penny = (int)((remainder / 0.01) + 0.5);
		
		System.out.println("If you have $" + money + " then you will receive " + quarter + (quarter == 1? " quarter, " : " quarters, ") + dime + (dime ==1? " dime, " : " dimes, ") + nickel + (nickel == 1? " nickel, and " : " nickels, and ") + penny + (penny == 1? " penny. " : " pennies. "));
		System.exit(0);
	}

}

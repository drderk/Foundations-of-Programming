
public class three_or_five {

	public static void main(String[] args) {
		//initialize variable
		int number = 30;
		
		//outputs if the number is divisible by 3 or 5.
		for (int i = 0; i <= number; i++) {
			if (!(i%5 == 0 && i%3 ==0)|| i == 0 ){
				System.out.println(i + " is not divisible by 3 or 5");
			} else {
				
			}
		}
		System.exit(0);

	}

}

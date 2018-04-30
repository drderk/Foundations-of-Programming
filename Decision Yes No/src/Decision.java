
public class Decision {

	public static void main(String[] args) {
		double num = Math.random();
		if (num > .5) {
			System.out.println("Yes");
			System.out.println(num);
		}
		else {
			System.out.println("No");
			System.out.println(num);
		}
	}

}

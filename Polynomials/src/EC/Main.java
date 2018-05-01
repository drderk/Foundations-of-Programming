package EC;

public class Main {

	public static void main(String[] args) {
		Term term = new Term();
		String behavior = term.oddOrEven();
		String polarity = term.polarity();
		
		System.out.println("The function entered is " + behavior + " and " + polarity);
	}

}

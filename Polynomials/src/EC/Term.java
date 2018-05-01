package EC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Term {
	List<Integer> degree = new ArrayList<Integer>();
	String[] Terms;
	String[] Terms2;
	Polynomial Poly;
	String[] degreeString;
	/* Constructor */
	public Term() {
		Poly = new Polynomial();
		Terms = Poly.returnTerms();
	}
	
	public void getDegree() {
		int i = 0;
		boolean flag = true;
		while (flag) {
			try {
				if (!Terms[i].contains("^") && Terms[i].contains("x")) {
					Terms[i] = Terms[i] + "^1";
				}
				degreeString = Terms[i].split("\\^");
				try {
				degree.add(Integer.parseInt(degreeString[1]));
				}
				catch (Exception io) {
					degree.add(1);
				}
				i++;
				}
			catch (Exception io) {
				flag = false;
			}
		}
	}
	
	public String oddOrEven() {
		getDegree();
		if (Collections.max(degree) % 2 == 0) {
			return "Even";
		} 
		else {
		return "Odd";
		}
	}
	
	public String polarity() {
		Integer state = degree.indexOf(Collections.max(degree));
		String  maxExpression = Terms[state];
		char  sign = maxExpression.charAt(0);
		String  polarity;
		if (sign == '-') {
			polarity = "Negative";
		}
		else {
			polarity = "Positive";
		}
		return polarity;
	}
}

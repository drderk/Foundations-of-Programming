package EC;
import java.util.*;
public class Polynomial {
	String      Poly = ""; 
	String[]    Terms = new String[100];
	
	public void getInput() {
		Scanner in = new Scanner(System.in);
		Poly = in.nextLine();
		in.close();
	}
	
	public Polynomial() {
		getInput();
		Poly = Poly.replaceAll(" ", "");
	}
	public void Extract() {
		final String WITH_DELIMITER = "((?=%1$s))";
		Terms = Poly.split(String.format(WITH_DELIMITER, "[+|-]"));
		}
	
	public String[] returnTerms() {
		Extract();
		return Terms;
	}
	
}

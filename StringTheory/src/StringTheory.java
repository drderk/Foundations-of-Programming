import java.util.Calendar;

public class StringTheory {

	public static void main(String[] args) {
//		Create 4 String variables with the names str1, str2, str3, and str4. 
//		Initialize them with the values "Bibbety", "Bobbety", "Boo", and "BIBBETY".
		String str1 = "Bibbety";
		String str2 = "Bobbety";
		String str3 = "Boo";
		String str4 = "BIBBETY";
		
//		Now use the String methods from this chapter as shown below.  In each case, print out the results to the console using System.out.println().
//		Use the equals() method to determine if str1 is equal to str4.  Remember the equals() method will return a true or false value, and you can append that value to a string.  Then pass the entire result into the System.out.println() function like this:
		System.out.println("Does str1, \""+str1+"\", equal str4, \""+str4+"\"?: " + str1.equals(str4));
		
//		Use the equalsIgnoreCase() method to determine if str1 is equal to str4.
		System.out.println("Does str1, \""+str1+"\", equal str4, \"" + str4+"\", if the case is ignored?: " + str1.equalsIgnoreCase(str4));

//		Use the replace() method to replace all the ‘b’ characters with ‘p’ characters in str1.
		System.out.println("str1, \"" + str1 + "\" replacing \'b\' with \'p\' results in " + str1.replace("b", "p"));
		
//		Use the substring() method to pull out the first 3 characters in str2.
		System.out.println("First three characters in str2,\"" + str2 + "\" are " + str2.substring(0, 3));
		
//		Use the toUpperCase() method to get an uppercase version of str3
		System.out.println("uppercase str3, \"" + str3 + "\", is " + str3.toUpperCase());

//		Use the format() method to show the current time in AM/PM format
//		Don’t forget to use Calendar.getInstance() to get your input data!
		System.out.format("The current time is %1$tr\n", Calendar.getInstance());

//		Combine the values of str1and str2 into a single string
		System.out.println("str1, \"" +str1+"\", + str2, \"" +str2+"\", = " + (str1 + str2));
		
//		Use the Integer.parseInt() method to parse the string value "5" into an integer value.
		System.out.println("String \"5\" is now Integer " + Integer.parseInt("5"));
		
//		Use the indexOf() method to show the location of the first ‘e’ in str1.
		System.out.println("Location of \'e\' in str1,\"" + str1 + "\", is " + str1.indexOf("e"));
	}

}

import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		ask the user for 2 strings
		System.out.println("Please enter 2 strings that you believe are anagrams:");
		String str1   = input.next();
		String str2   = input.next();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
//		instantiate arrays
		char[]   strArray1 = new char[str1.length()];
		char[]   strArray2 = new char[str2.length()];
		
//		initiates variables
		int     count = 0;
		boolean anagram = false;
		
//		determines if those strings are anagrams
		if (!(str1.length() == str2.length())) {
			anagram = false;	
		} else {
//			splits the strings into character arrays
			str1.getChars(0, str1.length(), strArray1, 0);
			str2.getChars(0, str2.length(), strArray2, 0);
			anagram = false;
			
//			parses the arrays to see if they contain the same characters.
			for (int i = 0; i < str1.length(); i++) {
				for (int j = 0; j < str2.length(); j++) {
					boolean check = strArray1[i] == strArray2[j];
					if (check) {
						j = str2.length();
						count++;
					}
				}
			}
//			sets the anagram as true if both strings have the same characters
			if (count == str1.length()) {
				anagram = true;
			}
		}		
//		prints out if the two strings are anagrams
		System.out.println("Is this an anagram: " + anagram);
		
//		closes the inputs
		input.close();
		System.exit(0);
	}
}
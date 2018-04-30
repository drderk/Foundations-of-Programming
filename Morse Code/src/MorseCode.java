import java.util.Scanner;

public class MorseCode {

	public static void main(String[] args) {
		Scanner input   = new Scanner(System.in);
		String  choice  = "";
		
		System.out.println("Would you like to translate from english to morse or vice versa?");
		System.out.println("Type 'e' for english to morse or 'm' for morse to english: ");
		
		choice = input.nextLine();
		while (!(choice.equalsIgnoreCase("m") || choice.equalsIgnoreCase("e"))) {
			System.out.println(choice + " is not a valid input, please try again");
			choice = input.nextLine();
		}
		
		if (choice.equalsIgnoreCase("m")) {
			MorseToEng(input);
		}
		else if (choice.equalsIgnoreCase("e")) {
			EngToMorse(input);
		}
		input.close();
		System.exit(0);
	}
	
//	English to Morse code translator
	public static void MorseToEng(Scanner input) {
//		Variables
		String  	morse     = "";
		String[][] 	letter   = new String[100][100];
		String[]  	word    = new String[100];
		boolean     isValidLetter = false;
		String[] morseDoc = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " " };
		
//		Entering Morse code
		System.out.println("Enter Morse Code: ");
		morse = input.nextLine();
		
//		Splits input into words
		word = morse.split("   ");
		
//		Splits words into letters
		for (int i = 0; i < word.length; i++) {
			letter[i] = word[i].split(" ");
		}
		
//		Checks for valid letter and which letter
		for (int i = 0; i < word.length; i++) {
			for(int j = 0; j < letter[i].length; j++) {
				isValidLetter = false;
				for (int x = 0; x < morseDoc.length; x++) {
					if (letter[i][j].equals(morseDoc[x]) ) {
						System.out.print(alphabet[x]);
						isValidLetter = true;
						}
					}
				if (!isValidLetter) {
					System.out.println("");
					System.out.println(letter[i][j] + " is not a valid letter");
					}
				}
			System.out.print(" ");
			}
		}
	
//   Morse to English translation	
	public static void EngToMorse(Scanner input) {
//		Variables
		String  english = "";
		char[]	chars;
		
//		Entering in an english sentence
		System.out.println("Enter an english sentence:");
		english = input.nextLine();	
		english = english.toLowerCase();
		chars = english.toCharArray();
		String  word    = "";

		//Comparing the input to every letter of the alphabet and creating a morse sentence in it.
		for (int letters = 0; letters < english.length(); letters++) {
			if (chars[letters] == 'a') {
				word += ".- ";
			}
			if (chars[letters] == 'b') {
				word += "-... ";
			}
			if (chars[letters] == 'c') {
				word += "-.-. ";
			}
			if (chars[letters] == 'd') {
				word += "-.. ";
			}
			if (chars[letters] == 'e') {
				word += ". ";
			}
			if (chars[letters] == 'f') {
				word += "..-. ";
			}
			if (chars[letters] == 'g') {
				word += "--. ";
			}
			if (chars[letters] == 'h') {
				word += ".... ";
			}
			if (chars[letters] == 'i') {
				word += ".. ";
			}
			if (chars[letters] == 'j') {
				word += ".--- ";
			}
			if (chars[letters] == 'k') {
				word += "-.- ";
			}
			if (chars[letters] == 'l') {
				word += ".-.. ";
			}
			if (chars[letters] == 'm') {
				word += "-- ";
			}
			if (chars[letters] == 'n') {
				word += "-. ";
			}
			if (chars[letters] == 'o') {
				word += "--- ";
			}
			if (chars[letters] == 'p') {
				word += ".--. ";
			}
			if (chars[letters] == 'q') {
				word += "--.-";
			}
			if (chars[letters] == 'r') {
				word += ".-. ";
			}
			if (chars[letters] == 's') {
				word += "... ";
			}
			if (chars[letters] == 't') {
				word += "- ";
			}
			if (chars[letters] == 'u') {
				word += "..- ";
			}
			if (chars[letters] == 'v') {
				word += "...- ";
			}
			if (chars[letters] == 'w') {
				word += ".-- ";
			}
			if (chars[letters] == 'x') {
				word += "-..- ";
			}
			if (chars[letters] == 'y') {
				word += "-.-- ";
			}
			if (chars[letters] == 'z') {
				word += "--.. ";
			}
			if (chars[letters] == ' ') {
				word += "  ";
			}
		}
//		Prints out the word
		System.out.println(word);
	}

}

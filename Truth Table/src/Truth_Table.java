/*Directions to Displaying a Truth Table

This exercise will be quick.  It involves copying and pasting the println code once you get the first row after the column headings.
In this project you will create a program that displays the truth table for the logical operators: AND (&&), OR(||) [To type the OR symbol use shift backslash twice on your keyboard],  XOR(^) and NOT(!). 
NOTE:  You have to use the logical operators in your code when displaying your results in tabular format.  You must make the columns in the table line up thus you will be using an escape character. Column Headings are 'A', 'B', 'AND', 'OR', 'XOR, and 'NOT A'  HINT:  "A\t" + "B\t"....

Out put should look like this:
 A	 B	 AND	 OR	XOR	NOT A
true	true	true	true	false	false
true	false	false	true	true	false
false	true	false	true	true	true
false	false	false	false	false	true*/

public class Truth_Table {

	public static void main(String[] args) {
		String t = "true";
		String f = "false";
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n","A","B","AND", "OR", "XOR", "NOTA");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", t, t, t , t, f ,f );
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", t, f, f , t, t ,f );
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", f, t, f , t, t ,t );
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", f, f, f , f, f ,t );

	}

}

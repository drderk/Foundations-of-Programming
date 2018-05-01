/*Part A: 
First use a one dimensional array of 10 elements.  Use a for loop to initialize 
each element with ‘-‘ character in each element. 
Second use a for loop to print the array 10 times to match the output above
 
Part B:
Use a two dimensional array of 10 by 10 elements initialized with the ‘#‘ character in each element.
(Use a nested for loop to initialization)  Then use a nested for loop to print the array to match 
the output above but with the ‘#’ character.*/

public class PrintArray {

	public static void main(String[] args) {
//		Part A
		System.out.println("Part A");
//		sets '-' to all the indexes of dash[]
		char[] dash = new char[10];
		for (int i = 0; i < dash.length; i++) {
			dash[i] = '-';
		}
//		prints all values in dash[]
		for (int time = 0; time < dash.length; time++) {
		for (int i = 0; i < dash.length; i++) {
			System.out.print(dash[i] + " ");
		}
		System.out.println();
		}
		System.out.println();
		
//		Part B
		System.out.println("Part B");
//		sets the values of all indexes in dash2D[] to '#'
		char[][] dash2D = new char[10][10];
		for (int i = 0; i < dash2D.length; i++) {
			for (int j = 0; j < dash2D.length; j++) {
				dash2D[i][j] = '#';
			}
		}
//		prints out all values of dash2D[]
		for (int i = 0; i < dash2D.length; i++) {
			for (int j = 0; j < dash2D.length; j++) {
				System.out.print(dash2D[i][j] + " ");
			}
			System.out.println();
		}

	}

}

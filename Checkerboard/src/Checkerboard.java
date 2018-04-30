
public class Checkerboard {

	public static void main(String[] args) {
		// print board with 3 columns and 5 rows
	    printCheckerboard(3,5);

	    // print board with 4 columns and 3 rows
	    printCheckerboard(4,3);

	    // print board with 8 columns and 8 rows
	    printCheckerboard(8,8);
	}
	
//	printing checkerboard method
	public static void printCheckerboard(int width, int height) {
//		checks the amount of columns
		for(int i = 0; i < width ; i++) {
//			checks the amount of rows
			for (int j = 0; j < height; j++) {
//				if the parameters are met, print either a # or " " 
				if ((i % 2 == 0) && (j % 2 == 0)) {
					System.out.print("#");
				}
				else if ((i% 2 == 0) && !(j % 2 == 0)) {
					System.out.print(" ");
				}
				else if (!(i % 2 == 0) && (j % 2 == 0)) {
					System.out.print(" ");
				}
				else if (!((i % 2 == 0) && (j % 2 == 0))) {
					System.out.print("#");
				}
			}
//			move to next line
			System.out.println();
		}
	}

}

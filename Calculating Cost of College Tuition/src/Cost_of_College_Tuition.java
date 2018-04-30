/*Cost of College Tuition:  Create a program that will calculate the estimated cost of the 4 year public/private college based on the mathematical model that takes into account the increase trend of tuition from year to year.
Formula to use for a private 4 year college:  T = 26x2 + 819x + 15,527.  This models the average cost of tuition and fees, 'T', at private U.S. colleges for the school year ending 'x' years after 2000.
Formula to use for a public 4 year college:  T = 4x2 + 341x + 3194.  This models the average cost of tuition and fees, 'T', at public U.S. colleges for the school year ending 'x' years after 2000.   This program makes use of the Pow() method

Variables that will be needed and initialized accordingly;
yearEntered = 2017; 
yearsAfter2000 = yearEntered - 2000;
costPublicTuition  //receives the result of 4x2 + 341x + 3194
costPrivateTuition  //recieves the result of 26x2 + 819x + 15,527
*/
public class Cost_of_College_Tuition {

	public static void main(String[] args) {
		
		double yearEntered = 2017;
		double yearsAfter2000 = (yearEntered - 2000);
		
		//Formula inputs
		double x = yearsAfter2000; //Years after 2000
		
		//Formulas
		double costPublicTuition = (4 * (Math.pow(x, 2)) + 341*(x) + 3194);
		double costPrivateTuition = (26 * (Math.pow(x, 2)) + 819*(x) + 15527);
		
		//Displays
		System.out.printf("%s%.2f\n","The cost of public tuition " + yearsAfter2000 + " years after 2000 is $", costPublicTuition);
		System.out.printf("%s%.2f","The cost of private tuition " + yearsAfter2000 + " years after 2000 is $" , costPrivateTuition);
	}

}

/*Write a program that fills an array with 20 random integers 1 to 100. 
The program should display the contents of the entire array. The program should 
also display amount of even and odd integers in the array. In addition, the 
program should display the even numbers in a list of their own and the odd 
integers in a list of their own. The modulus operator (%) might help determine 
which numbers are even and which ones are not.*/
public class EvenOdd {

	public static void main(String[] args) {
		//initialize arrays
		Integer[] array = new Integer[20];
		Integer[] even = new Integer[20];
		Integer[] odd = new Integer[20];
		
		//even and odd counters
		int j = 0;
		int k = 0;
		
		//assigns random values to the array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random() * 20) + 1);
			System.out.println("Array[" + i +"] Value: " + array[i]);
			
			//checks if the array is even or odd
			if (array[i] % 2 == 0) {
				even[j] = array[i]; 
				j++;
			} else {
				odd[k] = array[i];
				k++;
			}
		}
		//displays even and odd numbers
		System.out.println("Even numbers: ");
		for (int i = 0; i < j; i++) {
			System.out.print(even[i] + ",");
		}
		System.out.println();
		System.out.println("Odd numbers: ");
		for (int i = 0; i < k; i++) {
			System.out.print(odd[i] + ",");
		}
		//displays the amount of even/odd numbers
		System.out.println();
		System.out.println("Amount of evens: " + j);
		System.out.println("Amount of odds: " + k);

	}

}

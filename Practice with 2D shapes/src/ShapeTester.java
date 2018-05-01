
public class ShapeTester {

	public static void main(String[] args) {
		//initialize objects
		Square myFirstSquare = new Square();
		Square mySecondSquare = new Square(5.5,8.5);
		Triangle myFirstTriangle = new Triangle();
		Triangle mySecondTriangle = new Triangle(5.5,8.5,3,4,5);
		Circle	 myFirstCircle    = new Circle();
		Circle   mySecondCircle   = new Circle(5.5);
		
		//print square perimeter and area
		System.out.printf ("\n The area of myFirstSquare is: %.2f square units",myFirstSquare.area());
		System.out.printf("\n The area of mySecondSquare is: %.2f square units",mySecondSquare.area());
		System.out.printf ("\n The perimeter of myFirstSquare is: %.2f units",myFirstSquare.perimeter());
		System.out.printf ("\n The perimeter of mySecondSquare is: %.2f units",mySecondSquare.perimeter());
		
		//print triangle perimeter and area
		System.out.printf ("\n The area of myFirstTriangle is: %.2f square units",myFirstTriangle.area());
		System.out.printf ("\n The area of mySecondTriangle is:  %.2f square units",mySecondTriangle.area());
		System.out.printf ("\n The perimeter of myFirstTriangle is: %.2f units",myFirstTriangle.perimeter());
		System.out.printf ("\n The perimeter of mySecondTriangle is: %.2f units",mySecondTriangle.perimeter());
		
		//print circle perimeter and area
		System.out.printf ("\n The area of myFirstCircle is: %.2f square units",myFirstCircle.area());
		System.out.printf ("\n The area of mySecondCircle is: %.2f square units",mySecondCircle.area());
		System.out.printf ("\n The perimeter of myFirstCircle is: %.2f units",myFirstCircle.perimeter());
		System.out.printf ("\n The perimeter of mySecondCircle is: %.2f units",mySecondCircle.perimeter());
		
	}

}

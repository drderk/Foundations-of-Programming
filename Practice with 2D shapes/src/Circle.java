
public class Circle {
	
//	variables 
	private double radius;
	
//	contructor
	public Circle() {
		this.radius = 1;
	}
	
//	constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
//	return area
	public double area() {
		return (Math.PI * Math.pow(radius, 2));
	}
	
//	return perimeter
	public double perimeter() {
		return (2 * Math.PI * radius);
	}
}

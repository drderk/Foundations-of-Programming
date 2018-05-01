
public class Triangle {
	//variables
	private double base,height,side1,side2,side3;
	
//	constructor
	public Triangle() {
		this.base = 1;
		this.height = 1;
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}
	
//	constructor 
	public Triangle(double base, double height, double side1, double side2, double side3) {
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
//	return area
	public double area() {
		return (0.5 * this.base * this.height);
	}
	
//	return perimeter
	public double perimeter() {
		return this.side1 + this.side2 + this.side3;
	}
}

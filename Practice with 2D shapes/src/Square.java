
public class Square {
private double length;
private double width;

//Constructor
public Square() {
	this.length = 1;
	this.width = 1;
}

//Constructor
public Square(double length, double width) {
	this.length = length;
	this.width  = width;
}

//Return area
public double area() {
	return (this.length * this.width);
}

//Return perimeter
public double perimeter() {
	return (2*this.length) + (2*this.width);
}
}

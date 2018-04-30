//Create a program that will calculate area and volume of several 2D and 3D figures.  Your variables will have to be able to accept decimal numbers (floating point) and initialized accordingly.. 
/*
· Area of a Circle = PIr²
· Circumference of a Circle = 2PIr
· Area of a Trapezoid = (1/2)h(base1 + base2) where 'h' is height, base1 is the length of one parallel side and base2 is the length of the other parallel side.
· Volume of a circular cylinder = PIr²h
· Volume of a Sphere = 4/3PI r3
· Volume of a Cone = 1/3PIr²h
*/

public class AreaVolumeCalc {

	public static void main(String[] args) {
		//inputs
		double base1 = 0.0;
		double base2 = 0.0;
		double height = 0.0;
		double radius = 0.0;
		
		//formulas
		double cirArea = (Math.PI * (Math.pow(radius, 2)));
		double cirCircumference = (2.0 * Math.PI * radius);
		double trapArea = (((base1 + base2) / 2.0) * height);
		double cylVolume = (cirArea * height);
		double sphVolume = ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
		double coneVolume = (cylVolume / 3.0);
		
		//display outputs to console
		System.out.println("Area of the circle = " + cirArea);
		System.out.println("Circfumerence of the circle = " + cirCircumference);
		System.out.println("Area of a trapezoid = " + trapArea);
		System.out.println("Volume of a cylindar = " + cylVolume);
		System.out.println("Volume of a sphere = " + sphVolume);
		System.out.println("Volume of a cone = " + coneVolume);
		}

}
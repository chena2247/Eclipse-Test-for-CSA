//� A+ Computer Science  -  www.apluscompsci.com
//Name - Anne Chen
//Date - 2/7/18
//Class - APCSA
//Lab  - Lab02e

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea( )
	{
		area = 3.14159 * radius * radius;
	}

	public void print( )
	{
		System.out.println("The area is :: " + String.format("%.4f",area));
	}
}
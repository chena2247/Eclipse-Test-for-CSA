//� A+ Computer Science  -  www.apluscompsci.com
//Name - Anne Chen
//Date - 2/7/18
//Class - APCSA
//Lab  - Lab02f

public class Lab02f
{
	public static void main( String[] args ){
		Line first = new Line(1, 9, 14, 2);
		first.setCoordinates(1, 9, 14, 2);
		first.calculateSlope();
		first.print();
		
		Line second = new Line(23, 6, 34, 1);
		second.setCoordinates(12, 43, 2, 3);
		second.calculateSlope();
		second.print();
	}
}
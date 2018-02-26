//� A+ Computer Science  -  www.apluscompsci.com
//Name - Anne Chen
//Date - 2/25/18
//Class - APCSA
//Lab  - 14d

public class Lab14d
{
	public static void main( String args[] )
	{
		//add test cases
		double[] numbersOne = {100, 90, 85, 72.5, 95.6};
		Grades test = new Grades(5, numbersOne);
		System.out.println(test);
		
		double [] numbersTwo= {50.0, 100.0, 80.0};
		test.setGrades(3, numbersTwo);
		System.out.println(test);
		
		double [] numbersThree= {93.4, -90.0, 90.0};
		test.setGrades(3, numbersThree);
		System.out.println(test);
		
		double [] numbersFour= {1, 2, 3, 4, 5, 6, 7, 8, 9};
		test.setGrades(3, numbersFour);
		System.out.println(test);
		
	}
}
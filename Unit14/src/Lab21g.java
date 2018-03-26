//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		AtCounter test = new AtCounter();
		test.makeCopy();
		test.countAts(0, 0);
		System.out.println(test);
		
		test.makeCopy();
		test.countAts(2, 5);
		System.out.println(test);
		
		test.makeCopy();
		test.countAts(5, 0);
		System.out.println(test);
		
		AtCounter testTwo = new AtCounter();
		testTwo.countAts(0, 0);
		System.out.println(testTwo);
	}
}
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		LoopStats test = new LoopStats(1, 5);
		test.getEvenCount();
		test.getOddCount();
		out.println(test);
		
		test.setNums(2, 8);
		test.getEvenCount();
		test.getOddCount();
		out.println(test);
		
		test.setNums(5, 15);
		test.getEvenCount();
		test.getOddCount();
		out.println(test);
		
	}
}
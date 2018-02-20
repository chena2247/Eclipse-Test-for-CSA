//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Lab08i
{
	public static void main ( String[] args )
	{
		Prime test = new Prime(91);
		test.isPrime();
		out.println(test);
		
		test.setPrime(7);
		out.println(test);
		
		test.setPrime(100);
		out.println(test);

		test.setPrime(113);
		out.println(test);
		
		test.setPrime(65535);
		out.println(test);
		
		test.setPrime(2);
		out.println(test);
		
		test.setPrime(7334);
		out.println(test);
					
		test.setPrime(7919);
		out.println(test);
		
		test.setPrime(1115125003);
		out.println(test);
		
	}	
}
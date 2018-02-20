//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover("I am Sam I am", 'a');
		test.removeLetters();
		System.out.println(test);
		
		test.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(test);
		
		test.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(test);
		
		test.setRemover("abababababa", 'b');
		System.out.println(test);
		
		test.setRemover("abababababa", 'x');
		System.out.println(test);
	}
}
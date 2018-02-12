//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;
	private int test;

	public StringChecker()
	{


	}

	public StringChecker(String s)
	{
		word = s;
	}

   public void setString(String s)
   {
	   word = s;
   }

	public boolean findLetter(char c)
	{
		test = word.indexOf(c);
		if (test == -1) {
			return false;
		}
		else {
			return true;
		}
	}

	public boolean findSubString(String s)
	{
		test = word.indexOf(s);
		if (test == -1) {
			return false;
		}
		else {
			return true;
		}

	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}
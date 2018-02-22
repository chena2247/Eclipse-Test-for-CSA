//� A+ Computer Science  -  www.apluscompsci.com
//Name - Anne Chen
//Date - 2/21/2018
//Class - APCSA
//Lab  - Triangle

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle(int count, String let)
	{
		size = count;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		for (int i=size; i>0; i--) {
			for (int a = i-1; a > 0; a--) {
				output = output + " ";
			}
			for (int b = i; b <= size; b++) {
				output = output + letter;
			}
		output = output + "\n";
		}
		return output+"\n";
	}
}
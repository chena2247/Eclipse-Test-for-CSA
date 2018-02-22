//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				if (b % i == 0) {
					if (b % i == 0) {
						return i;
					}
				}
			}
		}

		return 1;
	}

	public String toString()
	{
		String output="";
		for (int a=1; a <= number; a = a+2) {
			for (int b=2; b <= number ; b = b+2) {
				for (int c=1; c <= number ; c++) {
					if ((a*a + b*b) == c*c && greatestCommonFactor(a,b,c) == 1) {
						output = output + a + " " + b + " " + c + "\n";
					}
				}
			}
		}
		return output+"\n";
	}
}
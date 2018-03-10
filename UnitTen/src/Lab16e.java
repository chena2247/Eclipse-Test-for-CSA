//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Lab16e
{
	public static void main( String args[] ) throws IOException
	{
		Histogram first = new Histogram(new char[]{'a','b','c'},"/Users/annechen/Desktop/Eclipse-Test-for-CSA/UnitTen/src/lab16e1.dat");
		first.loadAndAnalyzeFile();
		out.println("Letter occurring most : " + first.mostFrequent());
		out.println("Letter occurring least : " + first.leastFrequent());
		out.println("\n");
		out.println(first);

		Histogram second = new Histogram(new char[]{'d','e','a'},"/Users/annechen/Desktop/Eclipse-Test-for-CSA/UnitTen/src/lab16e2.dat");
		second.loadAndAnalyzeFile();
		out.println("Letter occurring most : " + second.mostFrequent());
		out.println("Letter occurring least : " + second.leastFrequent());
		out.println("\n");
		out.println(second);
		
		Histogram third = new Histogram(new char[]{'x','a','r', 'g'},"/Users/annechen/Desktop/Eclipse-Test-for-CSA/UnitTen/src/lab16e3.dat");
		third.loadAndAnalyzeFile();
		out.println("Letter occurring most : " + third.mostFrequent());
		out.println("Letter occurring least : " + third.leastFrequent());
		out.println("\n");
		out.println(third);
		//more test cases
	}
}
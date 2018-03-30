//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner myScanner = new Scanner(new File("/Users/annechen/Desktop/Eclipse-Test-for-CSA/Unit13/src/lab15d.dat"));
		
		int timesToLoop = myScanner.nextInt();
		
		myScanner.nextLine();
		
		for(int i = 0; i < timesToLoop; i++){
		String input = myScanner.nextLine();
		FancyWords myFancyWords = new FancyWords(input);
		System.out.println(myFancyWords);
		}

	}
}
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("/Users/annechen/Desktop/Eclipse-Test-for-CSA/Unit14/src/Lab24d.dat"));
		int num = file.nextInt();
		file.nextLine();
		for (int i=0; i<num; i++) {
			TicTacToe test = new TicTacToe(file.nextLine());
			System.out.println(test);
			System.out.println(test.getWinner());

		}

	}
}




//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{		
		Scanner file = new Scanner(new File("/Users/annechen/Desktop/Eclipse-Test-for-CSA/Unit14/src/lab21i.dat"));
		
		while (file.hasNextLine()) {
			int size = file.nextInt();
			String line = file.nextLine();
			Maze test = new Maze(size, file.nextLine());
			//System.out.println(test);
			if (test.hasExitPath(0, 0) == true) 
				System.out.println("exit found");
			else 
				System.out.println("exit not found");
			System.out.println(test.hasExitPath(0, 0));
			System.out.println(test);

		}

	}
}
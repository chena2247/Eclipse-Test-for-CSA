//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("/Users/annechen/Desktop/Eclipse-Test-for-CSA/Unit12/src/lab18d.dat"));

		int size = file.nextInt();
		Word[] sorting = new Word[size];
		
		for (int i=0; i<size; i++) {
			sorting[i] = new Word(file.nextLine());
		}

		for (int x=0; x<sorting.length; x++) {
			for (int y=0;y<sorting.length-1;y++) {
				if (sorting[y].compareTo(sorting[y+1]) > 0) {
					Word temp = sorting[y];
					sorting[y] = sorting[y+1];
					sorting[y+1] = temp;
				}
			}
		}
		
		for (int c=0; c<size; c++) {
			System.out.println(sorting[c]);
		}

	}
}
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("/Users/annechen/Desktop/Eclipse-Test-for-CSA/Unit12/src/lab18e.dat"));

		int size = file.nextInt();
		Word_Lab18e[] sorting = new Word_Lab18e[size];
		
		for (int i=0; i<size; i++) {
			sorting[i] = new Word_Lab18e(file.nextLine());
		}

		for (int x=0; x<sorting.length; x++) {
			for (int y=0;y<sorting.length-1;y++) {
				if (sorting[y].compareTo(sorting[y+1]) > 0) {
					Word_Lab18e temp = sorting[y];
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
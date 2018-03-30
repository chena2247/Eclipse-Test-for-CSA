//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		
		for(int i = 0; i >=0; i++){
			
			if(number == 0)
				break;
			
			number /= 10;
			count++;
		}

		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int numberClone = number;
		int[] sorted = new int[getNumDigits(number)];
		for(int i = 0; i < sorted.length; i++){
			sorted[i] = numberClone %10;
			number /= 10;
			numberClone = number;
		}
			
		for(int j = 0; j < sorted.length; j++){
			for(int k = j+1; k < sorted.length; k++){
				
				if(sorted[k] < sorted[j]){
					int swapOne = sorted[j];
					sorted[j] = sorted[k];
					sorted[k] = swapOne;
					
				}
				
			}
		}
		
		

		return sorted;
	}
}
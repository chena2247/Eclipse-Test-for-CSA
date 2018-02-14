//� A+ Computer Science  -  www.apluscompsci.com
//Name - Anne Chen
//Date - 2/1/18
//Class - Per 1 APCSA
//Lab  - Lab0c

import static java.lang.System.*;
import java.util.Scanner;

public class AnneChen_Lab0c
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo, intTotal;
		double doubleOne, doubleTwo, doubleTotal;
		float floatOne, floatTwo, floatTotal;
		short shortOne, shortTwo, shortTotal;
		byte byteOne, byteTwo, byteTotal;
		long longOne, longTwo, longTotal;


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();
		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();
		intTotal = intOne + intTwo;

		System.out.println();
		System.out.print("Enter a double :: ");
		doubleOne = keyboard.nextDouble();
		System.out.print("Enter a double :: ");
		doubleTwo = keyboard.nextDouble();
		doubleTotal = doubleOne + doubleTwo;
		
		System.out.println();
		System.out.print("Enter a float :: ");
		floatOne = keyboard.nextFloat();
		System.out.print("Enter a float :: ");
		floatTwo = keyboard.nextFloat();
		floatTotal = floatOne + floatTwo;
		
		System.out.println();
		System.out.print("Enter a short :: ");
		shortOne = keyboard.nextShort();
		System.out.print("Enter a short :: ");
		shortTwo = keyboard.nextShort();
		shortTotal = (short) (shortOne + shortTwo);
		
		//Bonus
		System.out.println();
		System.out.print("Enter a long :: ");
		longOne = keyboard.nextLong();
		System.out.print("Enter a long :: ");
		longTwo = keyboard.nextLong();
		longTotal = longOne + longTwo;
		
		System.out.println();
		System.out.print("Enter a byte :: ");
		byteOne = keyboard.nextByte();
		System.out.print("Enter a long :: ");
		byteTwo = keyboard.nextByte();
		byteTotal = (byte) (byteOne + byteTwo);

		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println("intOne + intTwo = " + intTotal);

		System.out.println();
		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
		System.out.println("doubleOne + doubleTwo = " + doubleTotal);

		System.out.println();
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
		System.out.println("floatOne + floatTwo = " + floatTotal);

		System.out.println();
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );
		System.out.println("shortOne + shortTwo = " + shortTotal);

		//Bonus
		System.out.println();
		System.out.println("long one = " + longOne );
		System.out.println("long two = " + longTwo );
		System.out.println("longOne + longTwo = " + longTotal);

		System.out.println();
		System.out.println("byte one = " + byteOne );
		System.out.println("byte two = " + byteTwo );
		System.out.println("byteOne + byteTwo = " + byteTotal);





	}
}
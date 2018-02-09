//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		int oneX, twoX, oneY, twoY;
		
	   	Scanner keyboard = new Scanner(System.in);
	   	System.out.print("Enter X1 :: ");
	    oneX = keyboard.nextInt();
	   	System.out.print("Enter X2 :: ");
	   	twoX = keyboard.nextInt();
	   	System.out.print("Enter Y1 :: ");
	   	oneY = keyboard.nextInt();
	   	System.out.print("Enter Y2 :: ");
	   	twoY = keyboard.nextInt();
	   	
	   	Distance first = new Distance ();
	   	first.setCoordinates(oneX, oneY, twoX, twoY);
	   	first.calcDistance();
	   	first.print();
	   	
	   	System.out.print("Enter X1 :: ");
	    oneX = keyboard.nextInt();
	   	System.out.print("Enter X2 :: ");
	   	twoX = keyboard.nextInt();
	   	System.out.print("Enter Y1 :: ");
	   	oneY = keyboard.nextInt();
	   	System.out.print("Enter Y2 :: ");
	   	twoY = keyboard.nextInt();
	   	
	   	Distance second = new Distance ();
	   	second.setCoordinates(oneX, oneY, twoX, twoY);
	   	second.calcDistance();
	   	second.print();
	   	
	   	System.out.print("Enter X1 :: ");
	   	oneX = keyboard.nextInt();
	   	System.out.print("Enter X2 :: ");
	   	twoX = keyboard.nextInt();
	   	System.out.print("Enter Y1 :: ");
	   	oneY = keyboard.nextInt();
	   	System.out.print("Enter Y2 :: ");
	   	twoY = keyboard.nextInt();
	   	
	   	Distance third = new Distance ();
	   	third.setCoordinates(oneX, oneY, twoX, twoY);
	   	third.calcDistance();
	   	third.print();
			
	}
}
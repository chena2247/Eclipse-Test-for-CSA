//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	Scanner keyboard = new Scanner(System.in);
   	int a1, b1, c1;

   	System.out.print("Enter a :: ");
   	 a1 = keyboard.nextInt();
   	System.out.print("Enter b :: ");
   	 b1 = keyboard.nextInt();
   	System.out.print("Enter c :: ");
   	 c1 = keyboard.nextInt();
   	
   	Quadratic first = new Quadratic();
   	first.setEquation(a1, b1, c1);
   	first.calcRoots();
   	first.print();
   	
   	System.out.print("Enter a :: ");
  	 a1 = keyboard.nextInt();
  	System.out.print("Enter b :: ");
  	 b1 = keyboard.nextInt();
  	System.out.print("Enter c :: ");
  	 c1 = keyboard.nextInt();
  	
  	Quadratic second = new Quadratic();
  	second.setEquation(a1, b1, c1);
  	second.calcRoots();
  	second.print();

   	System.out.print("Enter a :: ");
  	 a1 = keyboard.nextInt();
  	System.out.print("Enter b :: ");
  	 b1 = keyboard.nextInt();
  	System.out.print("Enter c :: ");
  	 c1 = keyboard.nextInt();
  	
  	Quadratic third = new Quadratic();
  	third.setEquation(a1, b1, c1);
  	third.calcRoots();
  	third.print();
  	
	}
}
//� A+ Computer Science  -  www.apluscompsci.com
//Name - Anne Chen
//Date - 2/7/18
//Class - APCSA
//Lab  - Lab3c

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne, rootTwo;
//	private double rootTwo;

	public Quadratic()
	{
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void calcRoots( )
	{
		rootOne = (-((double)b) + sqrt((((double)b*b))-(4.0*(double)a*c)))/(2.0*a);
		rootTwo = (-((double)b) - sqrt((((double)b*b))-(4.0*(double)a*c)))/(2.0*a);
	}

	public void print( )
	{
		out.println("Root one :: " + String.format("%.2f", rootOne));
		out.println("Root two :: " + String.format("%.2f\n", rootTwo));

	}
}
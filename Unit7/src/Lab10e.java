//� A+ Computer Science  -  www.apluscompsci.com
//Name - Anne Chen
//Date - 2/21/2018
//Class - APCSA
//Lab  - GuessingGame

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
	/*	System.out.print("Guessing Game - how many numbers? ");
		int response = keyboard.nextInt();
		String answer = "";
		*/			
		String answer = "";

		do {
			System.out.print("Guessing Game - how many numbers? ");
			int response = keyboard.nextInt();
			GuessingGame test = new GuessingGame(response);
			test.playGame();
			System.out.print(test);
			answer = keyboard.next();
		} while (answer != "n");

	}
}
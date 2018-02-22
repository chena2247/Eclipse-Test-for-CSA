//� A+ Computer Science  -  www.apluscompsci.com
//Name - Anne Chen
//Date - 2/21/2018
//Class - APCSA
//Lab  - GuessingGame

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		int num, guess = 0;
		Scanner keyboard = new Scanner(System.in);
		num = (int) Math.ceil(Math.random()*upperBound);
		
		int i = 0;
		do { 
			System.out.print("Enter a number between 1 and " + upperBound + ": ");
			guess = keyboard.nextInt();
			if (guess < 1 || guess > upperBound)
				System.out.println("Number out of range!");
			i++;

		} while (guess != num);
		
		System.out.println("\nIt took " + i + " guesses to guess " + num + ".");
		System.out.println("You guessed wrong " + (i-1)*100f/i + " percent of the time");
	}

	public String toString()
	{
		String output="\n\n\nDo you want to play again? (y/n) ";
		return output;
	}
}
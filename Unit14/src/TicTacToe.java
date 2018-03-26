//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe(){
	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int counter = 0; 
		
		for (int r=0; r<mat.length; r++) {
			for (int c=0; c<mat.length; c++) {
				mat[r][c] = game.charAt(counter);
				counter++;
			}
		}
	}

	public String getWinner()
	{
		//check horizontal
		for (int r=0; r<mat.length; r++) {
			if (mat[r][0] == mat[r][1] && mat[r][1] == mat[r][2]) {
				return mat[r][0] + " wins horizontally!";
			}
		}
		
		//check vertical
		for (int c=0; c<mat.length; c++) {
			if (mat[0][c] == mat[1][c] && mat[1][c] == mat[2][c]) {
				return mat[0][c] + " wins vertically!";
			}
		}
		
		//check diagonal
		if ((mat[1][1] == mat[0][0] && mat[2][2] == mat[1][1]) || (mat[0][2] == mat[1][1] && mat[2][0] == mat[1][1])) 
			return mat[1][1] + " wins diagonally!";
		else 
			return "cat's game: no winner!";
		}

	public String toString()
	{
		String output="";
		for(int i = 0; i < mat.length; i++) {
			output += "\n";
			for(int j = 0; j < mat.length; j++)
					output = output + mat[i][j] + " ";
		}
	
		return output;
	}
}
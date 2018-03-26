//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord(){
	}

   public FancyWord(String s)
	{
	   mat = new char[s.length()][s.length()];
	   
	   for (int a=0; a <s.length(); a++) {
		   for (int b=0; b < s.length(); b++) {
			   mat[a][b] = ' ';
		   }
	   }
	   
	   for (int x=0; x < s.length(); x++) {
		   mat[0][x] = s.charAt(x);
		   mat[s.length()-1][x] = s.charAt(x);
	   }
	   
	   
	   for (int i=1; i<s.length()-1; i++) {
		   mat[i][i] = s.charAt(i);
		   mat[i][s.length()-i-1] = s.charAt(s.length()-i-1);
	   }

	}

	public String toString()
	{
		String output="";
		for(int i = 0; i < mat.length; i++) {
			output += "\n";
			for(int j = 0; j < mat.length; j++)
					output = output + mat[i][j];
		}
		return output+"\n\n";
	}
}
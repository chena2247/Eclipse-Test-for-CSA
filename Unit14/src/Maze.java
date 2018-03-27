//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{
	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
	    Scanner chopper = new Scanner(line);
	    
		for (int r=0; r<size; r++) {
			for (int c=0; c<size; c++) {
			        maze[r][c] = (chopper.nextInt());
			}
		}
	}

	public boolean hasExitPath(int r, int c)
	{
		if ((r>=0 && r<maze.length) && (c>=0 && c<maze.length)){
			if (c==maze.length-1 && maze[r][c] == 1) {
				return true;
			}
			
			if( maze[r][c] == 0) 
			   return false;
			
			if (maze[r][c] == 2)
				return false;
			
			if (maze[r][c] == 1) {
				maze[r][c] = 2;
				if (hasExitPath(r+1, c) || hasExitPath(r, c+1) || hasExitPath(r-1, c) || hasExitPath(r, c-1))
					return true;
				
			}
			/*
			maze[r][c] = 2;
			if (c==maze.length-1 && maze[r][c] == 1) {
				return true;
			}
			else {
				if (hasExitPath(r+1, c) || hasExitPath(r, c+1) || hasExitPath(r-1, c) || hasExitPath(r, c-1))
						return true;*/
		}
		
		return false;
	}

	public String toString()
	{
		String output="";
		for(int i = 0; i < maze.length; i++) {
			output += "\n";
			for(int j = 0; j < maze.length; j++)
					output = output + maze[i][j] + " ";
		}
	
		return output + "\n\n";
	}
}
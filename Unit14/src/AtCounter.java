//� A+ Computer Science  -  www.apluscompsci.com
//Name - Anne Chen
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;
   private char[][] atMatCopy;
	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
							{'@','@','@','-','@','@','-','@','-','@'},
							{'-','-','-','-','-','-','-','@','@','@'},
							{'-','@','@','@','@','@','-','@','-','@'},
							{'-','@','-','@','-','@','-','@','-','@'},
							{'@','@','@','@','@','@','-','@','@','@'},
							{'-','@','-','@','-','@','-','-','-','@'},
							{'-','@','@','@','-','@','-','-','-','-'},
							{'-','@','-','@','-','@','-','@','@','@'},
							{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public void makeCopy() {
		atCount = 0;
		atMatCopy = new char[atMat.length][atMat.length];
		for(int i = 0; i < atMat.length; i++) {
			for(int j = 0; j < atMat.length; j++) {
					atMatCopy[i][j] = atMat[i][j];
			}
		}
	}
	
	public int countAts(int r, int c)
	{
		
	if((r >= 0 && r < atMat.length) && (c>=0 && c<atMat.length) && atMatCopy[r][c] == '@') {
		atCount++;
		atMatCopy[r][c] = '-';
		countAts(r-1,c);
		countAts(r+1,c);
		countAts(r,c+1);
		countAts(r,c-1);
	}
		return 0;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected. \n";
		return output;
	}
}
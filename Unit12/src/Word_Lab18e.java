//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word_Lab18e implements Comparable<Word_Lab18e>
{
	private String word;
	private int vowelCount;

	public Word_Lab18e( String s )
	{
		word = s;
	}
	
	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		for (int i=0; i<word.length(); i++) {
			for (int a=0; a<vowels.length(); a++) {
				if (word.charAt(i) ==  vowels.charAt(a))
					vowelCount++;
			}
		}
		return vowelCount;
	}

	public int compareTo(Word_Lab18e rhs)
	{
		if (numVowels() < rhs.numVowels()) {
			return -1;
		} else if (numVowels() > rhs.numVowels()) {
			return 1;
		} else return word.compareTo(rhs.word);
		
	}
	public String toString()
	{
		return word;
	}
}
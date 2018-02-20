//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	//add in second constructor
	
	public LetterRemover(String s, char rem) {
		sentence = s;
		lookFor = rem;
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = sentence;
		int i = 0;
		while (i < cleaned.length()) {
			if (cleaned.charAt(i) == lookFor) {
				cleaned = cleaned.substring(0,i) + cleaned.substring(i+1);
			}
			else {
				i++;
			}
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - Letter to remove: " + lookFor + "\nNew String: " + removeLetters();
	}
}
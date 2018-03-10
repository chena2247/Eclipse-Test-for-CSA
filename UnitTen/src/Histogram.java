//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
	}

	public Histogram(char[] values, String fName)
	{
		this();
		fileName = fName;
		for(int i=0;i<values.length;i++)
		{
			letters.add(values[i]);
			count.add(0);
		}
		out.println("search letters = "+letters);
		
	}

	public void loadAndAnalyzeFile() throws IOException
	{
	try {
		Scanner file = new Scanner(new File(fileName));
		String test = "";
		int lineCounter = file.nextInt();
		while (file.hasNextLine()) {
			test = file.nextLine();
			for (int a=0; a<letters.size(); a++) {
				for (int b=0; b<test.length(); b++) {
					if (test.charAt(b) == letters.get(a)) {
						count.set(a, count.get(a)+1);
					}
				}
			}
		}
	}
	catch (Exception e) {
		System.out.println("Error in loading");
	}
	}

	public char mostFrequent()
	{
		int most = 0;
		for (int i=0; i<count.size(); i++) {
			if (i==0) {
				most = i; }
			else if (count.get(i) > count.get(most)) {
				most = i; }
			}
		
		return letters.get(most);
	}

	public char leastFrequent()
	{
		int least = 0;
		for (int i=0; i<count.size(); i++) {
			if (i==0) {
				least = 0; }
			else if (count.get(i) < count.get(least)) {
				least = i; }
		}
		
		return letters.get(least);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}
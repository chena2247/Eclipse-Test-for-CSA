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

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		//load stuff
		this();
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		try{
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNext())
			{
				String insert = file.next();
				if(insert.equals("#"))
				{
					out.print(getRandomNoun() + " ");
				}
				else if(insert.equals("@"))
				{
					out.print(getRandomVerb() + " ");
				}
				else if(insert.equals("&"))
				{
					out.print(getRandomAdjective() + " ");
				}
				else
				{
					out.print(insert + " ");
				}
			}
			file.close();

		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("/Users/annechen/Desktop/Eclipse-Test-for-CSA/UnitTen/src/nouns.dat"));
			while (file.hasNextLine()) {
				nouns.add(file.nextLine());
			}
			file.close();
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("/Users/annechen/Desktop/Eclipse-Test-for-CSA/UnitTen/src/verbs.dat"));
			while (file.hasNextLine()) {
				verbs.add(file.nextLine());
			}
			file.close();
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("/Users/annechen/Desktop/Eclipse-Test-for-CSA/UnitTen/src/adjectives.dat"));
			while (file.hasNextLine()) {
				adjectives.add(file.nextLine());
			}
			file.close();
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
		return (String) verbs.get((int) (Math.random()*verbs.size()));
	}
	
	public String getRandomNoun()
	{
		
		return (String) nouns.get((int) (Math.random()*nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		
		return (String) adjectives.get((int) (Math.random()*adjectives.size()));
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}
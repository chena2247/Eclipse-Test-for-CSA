//� A+ Computer Science  -  www.apluscompsci.com
//Name -Anne Chen
//Date -2/11/18
//Class -APCSA
//Lab  -O4d

import static java.lang.System.*;

public class Name
{
	private String name;
	private int space;

	public Name()
	{

	}

	public Name(String s)
	{
		name = s;
	}

   public void setName(String s)
   {
	   name = s;
   }

	public String getFirst()
	{
		space = name.indexOf(" ");
		return name.substring(0,space);
		
	}

	public String getLast()
	{
		space = name.indexOf(" ");
		return name.substring(space+1);
	}

 	public String toString()
 	{
 		return name + "\n";
	}
}
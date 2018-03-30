//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{

		list = new ArrayList<String>();

	}

	public void add(String  word)
	{
		if(list.contains(word)){
			
		}
		else{
			list.add(word);
			sort();
		}

	}
	public void sort(){
		for(int i = 0; i < list.size(); i++){
			for(int j = i+1; j <list.size();j++){
				if(list.get(i).charAt(0)>list.get(j).charAt(0)){
				
					String replacement = list.get(i);
					list.set(i, list.get(j));
					list.set(j,replacement);
					
				}
			}
		}
	}

	public void remove(String word)
	{
		list.remove(word);
	}

	public String toString()
	{
		
		return list.toString();
	}
}
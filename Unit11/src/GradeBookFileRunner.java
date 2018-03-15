//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
	   	ArrayList<Class> myClasses = new ArrayList<Class>();
	   
		out.println("Welcome to the Class Stats program!\n\n");
		
		Scanner file = new Scanner(new File("/Users/annechen/Documents/CSA Units/Unit11-2016/Unit11-Assignments/Lab19b/gradebook.dat"));
		String name = file.nextLine();
		int stuCount = file.nextInt();
		Class myClass = new Class(name, stuCount);
		name = file.nextLine();
		for(int i = 0; i < stuCount; i++){
			String stuName = file.nextLine();
			String stuGradeList = file.nextLine();
			Student student = new Student(stuName, stuGradeList);
			myClass.addStudent(student);
		}
		
		myClasses.add(myClass);
		System.out.println(myClass);
		myClass.sort();
		System.out.println(myClass);
		
		out.println("Failure List = " + myClasses.get(0).getFailureList(70));	
		out.println("Highest Average = " +  myClasses.get(0).getStudentWithHighestAverage());
		out.println("Lowest Average = " +  myClasses.get(0).getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f", myClasses.get(0).getClassAverage()));									





	}		
}
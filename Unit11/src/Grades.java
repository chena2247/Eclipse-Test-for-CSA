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

public class Grades
{
	private double[] grades;
	private String realData;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner chop = new Scanner(gradeList);
		int count = chop.nextInt();
		grades = new double[count];
		
		realData = gradeList.substring(gradeList.indexOf("-")+2);
		
		Scanner chopper = new Scanner(realData); 
		int spot=0;
		while(chopper.hasNextDouble()){ 
			grades[spot]=chopper.nextDouble();
			spot++;
		}

	}
	
	public void setGrade(int spot, double grade)
	{
		grades[spot] = grade;
	}
	
	public double getSum()
	{
		double sum=0.0;
		for (int i=0; i<grades.length; i++) {
			sum += grades[i];
		}

		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for (int i=0; i<grades.length; i++) {
			if (grades[i]<low)
				low = grades[i];
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for (int i=0; i<grades.length; i++) {
			if (grades[i]>high)
				high = grades[i];
		}
		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{		
		return realData;
	}	
}
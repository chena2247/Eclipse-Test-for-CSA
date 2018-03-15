//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private ArrayList<Student> studentList;
	private Student test;
	
	public Class()
	{
		name="";
		studentList=new ArrayList<Student>();
	}
	
	public Class(String name_, int stuCount)
	{
		name = name_;
		studentList = new ArrayList<Student>(stuCount);
	}
	
	public void addStudent(Student s)
	{
		studentList.add(s);
	}
	
	public String getClassName()
	{
		return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0, numGrades = 0.0;
		for (int i=0; i<studentList.size(); i++) {
			double average = studentList.get(i).getAverage();
			classAverage += average;
		}
		return classAverage/numGrades;
	}
	
	public double getStudentAverage(int stuNum)
	{
		test = studentList.get(stuNum);
		return test.getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for (int i=0; i<studentList.size(); i++) {
			test = studentList.get(i);
			if (test.getName() == stuName) {
				break;
			}
		}
		return test.getAverage();
	}
	
	public String getStudentName(int stuNum)
	{
		test = studentList.get(stuNum);
		return test.getName();
	}

	public void sort() {
		for (int i=0; i<studentList.size(); i++) {
			Student personA = studentList.get(i);
			for (int x=studentList.size()-1; x>=0; x--) {
				if (x!=i) {
					Student personB = studentList.get(x);
					if (personA.compareTo(personB) == 1) {
						studentList.add(personB);
						studentList.add(personA);
					}
					else if (personA.compareTo(personA) == -1) {
						studentList.add(personB);
						studentList.add(personA);
					}
					else {
						studentList.add(personA);
						studentList.add(personB);
					}
				}
			}
		}
	}
	
	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		/*for (int i=0; i<studentList.size(); i++) {
			test = studentList.get(i);
			if (test.getAverage()>high) {
				high = test.getAverage();
				hName = getStudentName(i);
			}
		}*/
		sort();
		Student tester = studentList.get(0);
		return tester.getName();
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		
		/*for (int i=0; i<studentList.size(); i++) {
			test = studentList.get(i);
			if (test.getAverage()<low) {
				low = test.getAverage();
				hName = getStudentName(i);
			}
		}*/
		sort();
		Student tester = studentList.get(studentList.size()-1);
		return tester.getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i=0; i<studentList.size(); i++) {
			test = studentList.get(i);
			if (test.getAverage() <= 60) {
				output += test.getName() + " ";
			}
		}
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		
		return output;
	}  	
}
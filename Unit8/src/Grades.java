//� A+ Computer Science  -  www.apluscompsci.com
//Name - Anne Chen
//Date - 2/25/18
//Class - APCSA
//Lab  - 14d

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	private double[] nums;

	//constructor
	public Grades(int size, double[] original) {
		setGrades(size, original);
	}


	//set method
	public void setGrades(int size, double[] original) {
		nums = original;
	}


	private double getSum()
	{
		double sum=0.0;
		for (int i=0; i<nums.length; i++) {
			sum = sum + nums[i];
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/nums.length;
		return average;
	}

	//toString method
	public String toString() {
		String grades= "";
		for (int i=0; i<nums.length; i++) {
			grades +="grade " + (i+1) + " :: " + nums[i] + "\n";
		}
		grades += "\nAverage = " + getAverage() + "\n";
		return grades;
		
	}



}
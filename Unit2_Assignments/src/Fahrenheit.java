//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		celsius = (fahrenheit-32)*5/9;
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.printf(fahrenheit + " degrees Fahrenheit == %.3f degrees Celcius\n", getCelsius());
	}
}
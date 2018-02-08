//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02g
{
	public static void main( String[] args )
	{
		Fahrenheit first = new Fahrenheit();
		first.setFahrenheit(68);
		first.getCelsius();
		first.print();
		
		Fahrenheit second = new Fahrenheit();
		second.setFahrenheit(19);
		second.getCelsius();
		second.print();
		
		Fahrenheit third = new Fahrenheit();
		third.setFahrenheit(-20);
		third.getCelsius();
		third.print();
	}
}
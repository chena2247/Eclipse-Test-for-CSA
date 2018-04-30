//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   //add code here
		this(x,y,10,10,10);
	}

	public Ship(int x, int y, int s)
	{
	   //add code here
		this(x,y,10,10,s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			//URL url = getClass().getResource("/images/ship.jpg");
	        image = ImageIO.read(new File("/Users/annechen/Desktop/Eclipse-Test-for-CSA/Starfighter/src/ship.jpg"));
			//image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("problem with ship constructor");
		}
	}

	public void setSpeed(int s)
	{
	   //add more code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		//add code here
		if (direction == "LEFT") 
			setX(getX() - speed);
		else if (direction == "RIGHT") 
			setX(getX() + speed);
		else if (direction == "UP") 
			setY(getY()-speed);
		else 
			setY(getY()+speed);
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		//add code
		this(x,y,0);
		speed = 2;
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super(x,y);
		setSpeed(s);
	}

	public void setSpeed(int s)
	{
		speed = s;
	   //add code
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.YELLOW);
		//add code to draw the ammo
	   	window.drawRect(getX(),getY(),getWidth(),getHeight());

	}
	
	
	public void move( String direction )
	{
		//add code to draw the ammo

		if (direction == "UP") 
			setY(getY()-speed);
	}

	public String toString()
	{
		return "";
	}
}

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10,40,40);
		speed =5;
		setColor(Color.BLACK);
   }


   //add the other Paddle constructors
   public Paddle(int x, int y){
		super(x,y,10,10);
		setSpeed(5);
		setColor(Color.BLACK);
   }
   public Paddle(int x, int y, int spd){
		super(x,y,40,40);
		setSpeed(spd);
		setColor(Color.BLACK);
  }
	public Paddle(int x, int y, int width, int height){
		super(x,y,width,height);
		setSpeed(5);
		setColor(Color.BLACK);
	}
	public Paddle(int x, int y, int width, int height, Color col){
		super (x,y,width,height,col);
		setSpeed(5);
		setColor(col);

	}
	public Paddle(int x, int y, int width, int height, int spd){
		super (x,y,width,height);
		setSpeed(spd);
		setColor(Color.BLACK);

	}
	public Paddle(int x, int y, int width, int height, Color col, int spd){
		super (x,y,width,height,col);
		setSpeed(spd);
		setColor(col);
	}

	public void setSpeed(int spd){
		speed = spd;
	}


   /*public void moveUpAndDraw(Graphics window)
   {
	   if (getY()>0) {
	   draw(window, Color.WHITE);
	   setPos(getX(), getY()-getSpeed());
	   draw(window, getColor());
	   }
   }

   public void moveDownAndDraw(Graphics window)
   {
	   if (getY()<600) {
	   draw(window, Color.WHITE);
	   setPos(getX(), getY()+getSpeed());
	   draw(window, getColor());
	   }
   }*/
	
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
		 draw(window, getColor());
	}



   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   //add a toString() method
   public String toString(){
	   return getX() + " " + getY() + " " + getWidth()+ 
				" " + getHeight() + " " + getColor() + " " + getSpeed();
   }
}
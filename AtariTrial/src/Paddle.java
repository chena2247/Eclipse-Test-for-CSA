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
		super(10,10,10,10);
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
		super(x,y,10,10);
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


   public void moveUpAndDraw(Graphics window)
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
   }
   
   public void moveLeftAndDraw(Graphics window)
   {
	   if (getX()>50) {
	   draw(window, Color.WHITE);
	   setPos(getX()-getSpeed(), getY());
	   draw(window, getColor());
	   }
   }
   
   public void moveRightAndDraw(Graphics window)
   {
	   if (getX()<750) {
	   draw(window, Color.WHITE);
	   setPos(getX()+getSpeed(), getY());
	   draw(window, getColor());
	   }
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
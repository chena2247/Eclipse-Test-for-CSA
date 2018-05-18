//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200,10,10);
		setXSpeed(3);
		setYSpeed(1);
		setColor(Color.BLACK);
	}

	//add the other Ball constructors
	public Ball(int x, int y) {
		super(x,y,10,10);
		setXSpeed(3);
		setYSpeed(1);
		setColor(Color.BLACK);

	}
	
	public Ball(int x, int y, int width, int height) {
		super(x,y,width,height);
		setXSpeed(3);
		setYSpeed(1);
		setColor(Color.BLACK);

	}
	
	public Ball(int x, int y, int width, int height, Color col) {
		super(x,y,width,height,col);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int width, int height, Color col, int xS, int yS) {
		super (x,y,width,height,col);
		setXSpeed(xS);
		setYSpeed(yS);
	}
	
	public Ball(int x, int y, int width, int height, int xS, int yS) {
		super (x,y,width,height);
		setXSpeed(xS);
		setYSpeed(yS);
	}
	   
	   
   //add the set methods
   public void setXSpeed(int speed) {
	   xSpeed = speed;
   }
   
   public void setYSpeed (int speed) {
	   ySpeed = speed;
   }

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
  	   window.setColor(Color.WHITE);
	   window.fillOval(getX(), getY(), getWidth(), getHeight());
	   Ball tester = new Ball(getX(), getY(), getWidth(), getHeight(), Color.WHITE, getXSpeed(), getYSpeed());
       setX(getX()+xSpeed);
		//setY
       setY(getY()+ySpeed);

		//draw the ball at its new location
  	   window.setColor(tester.getColor());
	   window.fillOval(tester.getX(), tester.getY(), tester.getWidth(), tester.getHeight());
	   window.setColor(getColor());
	   window.fillOval(getX(), getY(), getWidth(), getHeight());
   }
	public boolean equals(Object obj)
	{
		Ball tester = (Ball)obj;
		if (xSpeed == tester.getXSpeed() && ySpeed == tester.getYSpeed()) {
			if (getX() == ((Block)obj).getX() && getY() == ((Block)obj).getY()
					&& getWidth() == ((Block)obj).getWidth()
					&& getHeight() == ((Block)obj).getHeight()
					&& getColor() == ((Block)obj).getColor())
				return true;
		}

		return false;
	}   

   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}
	public boolean didCollideLeft(Object obj) {
		Block leftPaddle = (Block) obj;

		
		Block paddle = (Block) obj;
		if (getX() < paddle.getX() + paddle.getWidth() && getX() > paddle.getX() && getY() > paddle.getY()
				&& getY() <= paddle.getY() + paddle.getHeight()) {
			return true;
		}
		return false;
	}

	public boolean didCollideRight(Object obj) {

		Block paddle = (Block) obj;

		if (getX() + getWidth() > paddle.getX() - Math.abs(getXSpeed()) && getX() < paddle.getX()
				&& getY() > paddle.getY() && getY() <= paddle.getY() + paddle.getHeight()) {
			return true;
		}
		return false;
	}

	public boolean didCollideTop(Object obj) {
		Block paddle = (Block) obj;
		if (getX() > paddle.getX() && getX() < paddle.getX() + paddle.getWidth()
				&& getX() + getWidth() > paddle.getX() && getX() + getWidth() < paddle.getX() +paddle.getWidth()
				&& getY() + getHeight() > paddle.getY() - Math.abs(getYSpeed())
				&& getY() < paddle.getY() + paddle.getHeight()) {
			System.out.println("TopCollided");
			return true;}
		return false;
	}

	public boolean didCollideBottom(Object obj) {

		Block paddle = (Block) obj;
		if ((getX() > paddle.getX() && getX() + getWidth() < paddle.getX() + paddle.getWidth())
				&& getY() + getHeight() > paddle.getY() - Math.abs(getYSpeed())
				&& getY() - Math.abs(getYSpeed()) < paddle.getY() + paddle.getHeight()) {
			return true;

		}
		return false;
	}

   //add a toString() method
	public String toString() {
		return getX()+" "+getY()+" "+getWidth()+" "+getHeight()+" "+getColor()+" "+getXSpeed()+" "+getYSpeed();
	}
	
}
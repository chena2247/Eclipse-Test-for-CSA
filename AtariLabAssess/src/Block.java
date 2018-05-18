//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block(){
		setX(0);
		setY(0);
		setWidth(0);
		setHeight(0);
	}
	
	public Block(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public Block(int x, int y, int width, int height) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
	}

	public Block(int x, int y, int width, int height, Color color) {
		setPos(x,y);
		setWidth(width);
		setHeight(height);
		setColor(color);
	}
	//add other Block constructors - x , y , width, height, color
	
   //add the other set methods
   public void setX(int x) {
	   xPos = x;
   }
   public void setY(int y) {
	   yPos = y;
   }
	
   public void setPos( int x, int y) {
    		setX(x);
    		setY(y);
    }
    
   public void setWidth(int wid) {
	   width = wid;
   }
   public void setHeight(int ht) {
	   height = ht;
   }

   public void setColor(Color col)
   {
	   color = col;
   }
   
   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block tester = (Block)obj;
		if (tester.getX() == getX()
				&& tester.getY() == getY()
				&& tester.getWidth() == getWidth()
				&& tester.getHeight() == getHeight()
				&& tester.getColor() == getColor()) {
			return true;
			}
		return false;
	}   

   //add the other get methods
	public int getX() {
		   return xPos; 
	   }
	   public int getY() {
		   return yPos; 
	   }
	   public int getWidth() {
		   return width; 
	   }
	   public int getHeight() {
		   return height; 
	   }
	   public Color getColor() {
		   return color; 
	   }

   //add a toString() method  - x , y , width, height, color
	   public String toString() {
		   return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " ";
	   }
}
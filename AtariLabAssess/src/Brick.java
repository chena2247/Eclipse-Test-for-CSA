import java.awt.Color;
import java.awt.Graphics;

public class Brick extends Block
{
	private Boolean ifHit;
  
   public Brick()
   {
		super(10,10,10,10);
		setColor(Color.BLACK);
		ifHit = false;
   }


   //add the other Brick constructors
   public Brick(int x, int y){
		super(x,y,10,10);
		setColor(Color.BLACK);
		ifHit = false;

   }
   public Brick(int x, int y, int spd){
		super(x,y,10,10);
		setColor(Color.BLACK);
		ifHit = false;
  }

	public Brick(int x, int y, int width, int height){
		super (x,y,width,height);
		setColor(Color.BLACK);
		ifHit = false;
	}
	public Brick(int x, int y, int width, int height, Color col){
		super (x,y,width,height,col);
		setColor(col);
		ifHit = false;
	}
	
	public void setPos(int x, int y) {
		setX(x);
		setY(y);
		ifHit = false;

	}
	
	public boolean getIfHit() {
		return ifHit;
	}
	
	public void setIfHit(Boolean bool) {
		ifHit = ifHit;
	}

	   public void draw(Graphics window)
	   {
	   	//uncomment after you write the set and get methods
	      window.setColor(Color.BLACK);
	      window.fillRect(getX(), getY(), getWidth(), getHeight());
	   }

	   public void draw(Graphics window, Color col)
	   {
		   window.setColor(col);
		   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   }
	   
   
   //add a toString() method
   public String toString(){
	   return getX() + " " + getY() + " " + getWidth()+ 
				" " + getHeight() + " " + getColor() + " ";
   }
}
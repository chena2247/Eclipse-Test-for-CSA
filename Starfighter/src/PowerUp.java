import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class PowerUp extends MovingThing{
	private int speed;
	
	/**
	 * Initialize power up. 
	 * When the alien catches it, it speeds up.
	 */
	public PowerUp() {
		this(0,0,0);
	}
	
	public PowerUp(int x, int y) {
		this(x,y,0);
		speed = 2;
	}
	
	/**
	 * Initializes PowerUp that extends MovingThing.
	 * @param x is horizontal position
	 * @param y is vertical position
	 */
	public PowerUp(int x, int y, int s) {
		super(x,y);
		setSpeed(s);
	}
	
	public void setSpeed(int s) {
		speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * Draw the display (cards and messages).
	 */
	public void draw( Graphics window) {
		window.setColor(Color.RED);
		window.drawOval(getX(), getY(), getWidth(), getHeight());
	}
	/**
	 * Moves the power up
	 * Only direction is down.
	 */
	
	public void move( String direction) {
		if (direction == "DOWN")
			setY(getY()+speed);
	}
	
	public String toString() {
		return "";
	}
	
}

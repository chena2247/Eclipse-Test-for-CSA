//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.math.*;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	//private Alien alienOne;
	//private Alien alienTwo;
	//private Ammo ammoOne;

	//uncomment once you are ready for this part
	
	private AlienHorde horde;
	private Bullets shots;
	private Powers power;

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(300,500,50,50,2);
		//alienOne = new Alien(100,40,50,50,2);
		//alienTwo = new Alien(300,40,50,50,2);
		shots = new Bullets();
		horde = new AlienHorde(75);
		power = new Powers();

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		if(keys[2] == true)
		{
			ship.move("UP");
		}
		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		if(keys[4] == true)
		{
			//ammoOne.draw(twoDGraph);
			//ammoOne = new Ammo(ship.getX() + 20, ship.getY()+ship.getSpeed());
		}

		//add code to move Ship, Alien, etc.
		if (ship.getX() < 0)
			ship.setX(0);
		if (ship.getX() > 740)
			ship.setX(740);
		if (ship.getY() < 0)
			ship.setY(0);
		if(ship.getY() > 520)
			ship.setY(520); 
		
		

		twoDGraph.drawImage(back, null, 0, 0);
		ship.draw(twoDGraph);
		//alienOne.draw(twoDGraph);
		//alienTwo.draw(twoDGraph);
		shots.drawEmAll(twoDGraph);
		horde.drawEmAll(twoDGraph);
		power.drawEmAll(twoDGraph);
		
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		shots.moveEmAll();
		horde.moveEmAll();
		horde.removeDeadOnes(shots.getList());
		power.moveEmAll();
		power.ifHit(ship);

	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
			shots.add(new Ammo(ship.getX() + 20, ship.getY() + ship.getSpeed()));

			if ((int)(Math.random()*15) == 1) {
				power.add(new PowerUp((int)(Math.random()*600),0,3));
			}

		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}


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

public class Pong2 extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle Paddle;
	private boolean[] keys;
	private BufferedImage back;
	private boolean startOfGame = true;
	private Wall rightW, leftW, topW, bottomW;
	private BrickLayer2 bricks;

	public Pong2()
	{
		//set up all variables related to the game
		ball = new Ball(100,100,10,10,Color.BLUE,2,1);
		Paddle = new Paddle(100,200,40,40,Color.MAGENTA,6);
		leftW = new Wall(0,0,10,600,Color.WHITE);
		rightW = new Wall(790,0,10,600,Color.WHITE);
		topW = new Wall(0,0,800,10,Color.WHITE);
		bottomW = new Wall(0,580,800,10,Color.WHITE);
		bricks = new BrickLayer2();
		startOfGame = true;
		
		keys = new boolean[4];

    
		setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   
   public void paint(Graphics window)
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
		if(startOfGame){
			graphToBack.setColor(Color.RED);
			graphToBack.setColor(Color.WHITE);
			startOfGame = false;
		}

		ball.moveAndDraw(graphToBack);
		Paddle.draw(graphToBack);
		leftW.draw(graphToBack);
		rightW.draw(graphToBack);
		bottomW.draw(graphToBack);
		topW.draw(graphToBack);
		bricks.drawEmAll(graphToBack);
		
		//see if the ball hits a brick
		bricks.removeCollider(ball, graphToBack);
				
		//see if the ball hits the top, bottom, left, or right wall 
		if (ball.getY()<=topW.getY()+topW.getHeight()) {
			ball.setYSpeed(-(ball.getYSpeed()));
			System.out.println("Top");
		}
		if (ball.getY()>=bottomW.getY()) {
			System.out.println("Bottom");
			ball.setYSpeed(-(ball.getYSpeed()));
		}
		if (ball.getX()<=leftW.getX()+leftW.getWidth()) {
			ball.setXSpeed(-(ball.getXSpeed()));
			System.out.println("Left");
		}
		if (ball.getX()>=rightW.getX()) {
			ball.setXSpeed(-(ball.getXSpeed()));
			System.out.println("Right");
		}

		if ((ball.getX() > Paddle.getX() && (ball.getX() < Paddle.getX() + Paddle.getWidth()))
				&& (ball.getY() > Paddle.getY() && (ball.getY() < Paddle.getY() + Paddle.getHeight()))) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
		}

		//see if the paddles need to be moved


		if(keys[0] == true){
			System.out.println(" Up Key Pressed");
			Paddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true){
			Paddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] == true){
			Paddle.moveLeftAndDraw(graphToBack);
		}
		if(keys[3] == true){
			Paddle.moveRightAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'I' : keys[0]=true; break;
			case 'K' : keys[1]=true; break;
			case 'J' : keys[2]=true; break;
			case 'L' : keys[3]=true; break;
			default:
				keys[0] = false;
				keys[1] = false;
				keys[2] = false;
				keys[3] = false;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		//System.out.println("released");
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'I' : keys[0]=false; break;
			case 'K' : keys[1]=false; break;
			case 'J' : keys[2]=false; break;
			case 'L' : keys[3]=false; break;
			default:
				keys[0] = false;
				keys[1] = false;
				keys[2] = false;
				keys[3] = false;
		}
		
	}

	public void keyTyped(KeyEvent e){
	//	System.out.println("pressed");
		
	}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}
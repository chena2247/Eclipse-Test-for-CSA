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

public class Pong extends Canvas implements KeyListener, Runnable, Collidable
{
	private BlinkyBall ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore, rightScore;
	private Block coverWord1, coverWord2;
	private boolean startOfGame = true;


	public Pong()
	{
		//set up all variables related to the game
		ball = new BlinkyBall(100,100,10,10,Color.BLUE,2,1);
		leftPaddle = new Paddle(100,200,20,50,Color.MAGENTA,6);
		rightPaddle = new Paddle(600,200,20,50,Color.MAGENTA,6);
		coverWord1 = new Block(110,30,140,30, Color.white);
		coverWord2 = new Block(540,30,140,30, Color.white);
		leftScore = 0; rightScore =0;
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

   public boolean didCollideLeft(Object obj) {
		return ball.getX()<=40;
   }
   public boolean didCollideRight(Object obj) {
	   return ball.getX()>=720;
   }
   public boolean didCollideTop(Object obj) {
	   return ball.getY()>=560;
   }
   public boolean didCollideBottom(Object obj) {
	   return ball.getY()<=10;
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
			graphToBack.drawString("Left Score - " + leftScore, 120, 50);
			graphToBack.drawString("Right Score - " + rightScore, 550, 50);
			graphToBack.setColor(Color.WHITE);
			startOfGame = false;
		}

		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=720)) {
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			if (ball.getX()<=40) {
				rightScore++;
				coverWord1.draw(graphToBack);
				coverWord2.draw(graphToBack);
				
				graphToBack.setColor(Color.red);
				graphToBack.drawString("Left Score - " + leftScore, 120, 50);
				graphToBack.drawString("Right Score - " + rightScore, 550, 50);
				graphToBack.setColor(Color.white);
				
				Color holder = ball.getColor();
				ball.setColor(Color.white);
				ball.draw(graphToBack);
				
				ball.setColor(holder);
				ball.setX(10);
				ball.setY(100);
				ball.setYSpeed(1);
				ball.setXSpeed(2);
				
			}
			if (ball.getX()>=720) {
				leftScore++;
				coverWord1.draw(graphToBack);
				coverWord2.draw(graphToBack);
				
				graphToBack.setColor(Color.red);
				graphToBack.drawString("Left Score - " + leftScore, 120, 50);
				graphToBack.drawString("Right Score - " + rightScore, 550, 50);
				graphToBack.setColor(Color.white);
				
				Color holder = ball.getColor();
				ball.setColor(Color.white);
				ball.draw(graphToBack);
				
				ball.setColor(holder);
				ball.setX(10);
				ball.setY(100);
				ball.setYSpeed(1);
				ball.setXSpeed(2);
			}
			
		}

		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=560)){
			ball.setYSpeed(-(ball.getYSpeed()+1));
		}

		//see if the ball hits the left paddle
		if ((ball.getX()<= leftPaddle.getX()+leftPaddle.getWidth()+Math.abs(ball.getXSpeed())) 
				&& (ball.getY() >= leftPaddle.getY() 
				&& ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight() 
				|| ball.getY() + ball.getHeight() >= leftPaddle.getY() 
				&& ball.getY()+ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight())){
			if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed()))
				ball.setYSpeed(-(Math.abs(ball.getYSpeed())+1));
			else
				ball.setXSpeed((Math.abs(ball.getXSpeed())+1));
		}
		
		//see if the ball hits the right paddle
		if((ball.getX()+ball.getWidth()>=rightPaddle.getX()-Math.abs(ball.getXSpeed()))
				&& (ball.getY()-ball.getHeight()>=rightPaddle.getY()&&
				ball.getY()-ball.getHeight()<=rightPaddle.getY()+rightPaddle.getHeight()||
				ball.getY()+ball.getHeight()>=rightPaddle.getY()&&
				ball.getY()+ball.getHeight()<=rightPaddle.getY()+rightPaddle.getHeight())){
			
			if(ball.getX()+ball.getWidth()>=rightPaddle.getX()+Math.abs(ball.getXSpeed()))
				ball.setYSpeed(-Math.abs(ball.getYSpeed())+1);
			else
				ball.setXSpeed(-(Math.abs(ball.getXSpeed())+1));
		}

		//see if the paddles need to be moved


		if(keys[0] == true){
			leftPaddle.moveUpAndDraw(graphToBack);
			//keys[0] = false;
		}
		if(keys[1] == true){
			leftPaddle.moveDownAndDraw(graphToBack);
			//keys[1] = false;

		}
		if(keys[2] == true){
			rightPaddle.moveUpAndDraw(graphToBack);
			//keys[2] = false;

		}
		if(keys[3] == true){
			rightPaddle.moveDownAndDraw(graphToBack);
			//keys[3] = false;

		}



		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
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
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
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
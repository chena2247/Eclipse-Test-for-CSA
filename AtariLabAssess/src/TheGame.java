//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import java.awt.Component;

public class TheGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public TheGame()
	{
		super("PONG");
		setSize(WIDTH,HEIGHT);
		
		Pong game = new Pong();

		((Component)game).setFocusable(true);			
		getContentPane().add(game);
						
		setVisible(true);		
		
		while (!game.gameOver() ) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
			System.out.println("New game");
			Pong2 game2 = new Pong2();
	    getContentPane().remove(game);
		((Component)game2).setFocusable(true);			
	    this.validate();
        getContentPane().add(game2);
		setVisible(true);		

	}
	
	public static void main( String args[] )
	{
		TheGame run = new TheGame();
		
		
	}
}
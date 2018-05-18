//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import java.awt.Component;

public class BreakoutGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public BreakoutGame()
	{
		super("Atari");
		setSize(WIDTH,HEIGHT);
		
		Atari game = new Atari();
		
		((Component)game).setFocusable(true);			
		getContentPane().add(game);
						
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		BreakoutGame run = new BreakoutGame();
	}
}
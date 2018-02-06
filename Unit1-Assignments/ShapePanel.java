//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		/*window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40); */

		//instantiate a Shape
		//tell your shape to draw
		
		Shape shapeone = new Shape(100,200,200,100,Color.RED);
		shapeone.draw ( window );
		
		//instantiate a Shape
		//tell your shape to draw
		
		Shape shapetwo = new Shape(400,300,100,200,Color.YELLOW);
		shapetwo.draw ( window );
		
		//instantiate a Shape
		//tell your shape to draw
		
		Shape shapethree = new Shape(600,100,80,50,Color.GREEN);
		shapethree.draw ( window );
	}
}
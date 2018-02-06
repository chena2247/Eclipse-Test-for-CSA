//� A+ Computer Science  -  www.apluscompsci.com
//Name - Anne Chen
//Date - 2/5/18
//Class - APCSA
//Lab  - Lab01d

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(1000,1000);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );
      
      head( window );
            
      upperBody( window );

      lowerBody( window );
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.RED);

      window.fillOval(200, 100, 200, 100);
      
      window.setColor(Color.BLUE);

      window.fillOval(250, 150, 10, 10);

      window.fillOval(350, 150, 10, 10);
      
      window.setColor(Color.GRAY);
      
      window.drawArc(250, 165, 100, 20, 0, -180);

   }

   public void upperBody( Graphics window )
   {

		window.setColor(Color.MAGENTA);
		
		window.fillRect(250, 200, 100, 50);
		
		window.setColor(Color.GRAY);
		
		window.drawLine(150, 175, 250, 200);
		
		window.drawLine(350, 200, 450, 175);
   }

   public void lowerBody( Graphics window )
   {
	   
	   window.setColor(Color.CYAN);
	   
	   window.fillRect(250, 250, 100, 100);
	   
	   window.setColor(Color.GRAY);
	   
	   window.drawLine(250, 350, 200, 300);
	   
	   window.drawLine(350, 350, 400, 400);
   }
}
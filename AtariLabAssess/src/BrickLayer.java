import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class BrickLayer {
	private List<Brick> bricks;

	public BrickLayer() { 
		bricks = new ArrayList<Brick>();
		int x = 40, y = 50;
		int a=0;
		while (a<2) {
			bricks.add(new Brick(x,y,80,20, Color.RED));
			bricks.add(new Brick(x,590-y,80,20, Color.RED));
			x += 100;
			if (x >=690) {
				x=40;
				y+=30;
				a++;
			}
		}
		int x1 = 40, y1 = y+30;
		int i=0;
		while (i<2) {
			bricks.add(new Brick(x1,y1,80,20,Color.ORANGE));
			bricks.add(new Brick(690-x1,y1,80,20,Color.ORANGE));
			y1 += 30;
			if (y1 >= 600-y-20) {
				x1 += 100;
				y1 = y+30;
				i++;

			}

		}
	}
	
	public void add(Brick br) {
		bricks.add(br);
	}
	
	public List<Brick> getList() {
		return bricks;
	}
	
	public void drawEmAll( Graphics window ) {
		for (int i=0; i<bricks.size(); i++) {
		    window.setColor(Color.RED);
			window.fillRect(bricks.get(i).getX(), bricks.get(i).getY(),
					bricks.get(i).getWidth(), bricks.get(i).getHeight());
		}
	}
	
	
	/*public void removeCollider(Ball ball, Graphics window) {
		window.setColor(Color.WHITE);
		for (int k=0; k<bricks.size(); k++) {
			if((ball.getX() <= bricks.get(k).getX() + bricks.get(k).getWidth() 
					&& ball.getX() >= bricks.get(k).getX() - bricks.get(k).getWidth()) 
					&& (ball.getY() <= bricks.get(k).getY() + bricks.get(k).getHeight() 
					&& ball.getY() >= bricks.get(k).getY() - bricks.get(k).getHeight()))	 {
				System.out.println("brick collided");
				bricks.get(k).setIfHit(true);
				window.fillRect(bricks.get(k).getX(), bricks.get(k).getY(),
						bricks.get(k).getWidth(), bricks.get(k).getHeight());
				bricks.get(k).setPos(-100, -100);				
			}
		}
	}*/
	
	public void removeCollider(Ball ball, Graphics window) {
		window.setColor(Color.WHITE);
		for (int k=0; k<bricks.size(); k++) {
			if ((ball.getX() > bricks.get(k).getX() && (ball.getX() < bricks.get(k).getX() + bricks.get(k).getWidth()))
					&& (ball.getY() > bricks.get(k).getY() && (ball.getY() < bricks.get(k).getY() + bricks.get(k).getHeight()))) {
				System.out.println("brick collided");
				bricks.get(k).setIfHit(true);
				window.fillRect(bricks.get(k).getX(), bricks.get(k).getY(),
						bricks.get(k).getWidth(), bricks.get(k).getHeight());
				bricks.get(k).setPos(-100, -100);			
				ball.setXSpeed(-ball.getXSpeed());
				ball.setYSpeed(-ball.getYSpeed());
			}
				
					
		}
	}
		
	public boolean gameDone() {
		for (int k=0; k<bricks.size(); k++) {
			if (bricks.get(k).getX() > 0)
				return false;
		}
		return true;
	}

}

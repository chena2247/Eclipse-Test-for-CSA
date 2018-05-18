import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class BrickLayer2 {
	private List<Brick> bricks;

	public BrickLayer2() { 
		bricks = new ArrayList<Brick>();
		int x = 20, y = 10;
		int a=0;
		while (a<3) {
			bricks.add(new Brick(x,y,80,15, Color.GREEN));
			bricks.add(new Brick(x,570-y,80,15, Color.GREEN));
			x += 90;
			if (x >=720) {
				x=20;
				y+=20;
				a++;
			}
		}
		int x1 = 20, y1 = y+10;
		int i=0;
		while (i<3) {
			bricks.add(new Brick(x1,y1,80,15,Color.GREEN));
			bricks.add(new Brick(730-x1,y1,80,15,Color.GREEN));
			y1 += 30;
			if (y1 >= 600-y-30) {
				x1 += 90;
				y1 = y+10;
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
		    window.setColor(Color.GREEN);
			window.fillRect(bricks.get(i).getX(), bricks.get(i).getY(),
					bricks.get(i).getWidth(), bricks.get(i).getHeight());
		}
	}
	
	
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
		
}

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Powers {
	
	private List<PowerUp> power;
	
	public Powers() { 
		power = new ArrayList<PowerUp>();
	}
	
	public void add(PowerUp pow) {
		power.add(pow);
	}
	
	public void drawEmAll(Graphics window) {
		window.setColor(Color.RED);
		for (int i=0; i<power.size(); i++) {
			window.fillOval(power.get(i).getX(), power.get(i).getY(), power.get(i).getWidth(), power.get(i).getHeight());
		}
	}
	
	public void moveEmAll() {
		for (int i=0; i<power.size(); i++) {
			if (power.get(i).getY()<800)
					power.get(i).move("DOWN");
		}
	}
	
	public void ifHit(Ship ship) {
		for (int i=0; i<power.size(); i++) {
			if ((power.get(i).getX()<=ship.getX()+ship.getWidth()
			&& power.get(i).getX() >= ship.getX()-ship.getWidth())
			&& (power.get(i).getY() <= ship.getY()+ship.getHeight()
			&& power.get(i).getY() >= ship.getY()-ship.getHeight())) {
				ship.setSpeed(ship.getSpeed()+1);
				power.get(i).setPos(-100, -100);
			}
		}
	}
}

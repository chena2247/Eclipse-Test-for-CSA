import java.awt.Color;
import java.awt.Graphics;

public class Wall extends Block{
	public Wall(int x, int y, int width, int height, Color col){
		super(x,y,width,height,col);
	}
	public void draw(Graphics window) {
		 draw(window, Color.WHITE);
		 draw(window, getColor());
	}
}

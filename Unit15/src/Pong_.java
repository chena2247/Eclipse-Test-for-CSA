
public class Pong_ {

}
package Pong;

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

public class Breakout extends Canvas implements KeyListener, Runnable {
	private Ball ball;
	private Paddle paddle;
	private boolean[] keys;
	private BufferedImage back;
	private Wall left;
	private Wall right;
	private Wall top;
	private Wall bottom;

	private Block block1;
	private Block block2;
	private Block block3;
	private Block block4;
	private Block block5;
	private Block block6;
	private Block block7;
	private Block block8;
	private Block block9;
	private Block block10;
	private Block block11;
	private Block block12;
	private Block block13;
	private Block block14;
	private Block block15;
	private Block block16;
	private Block block17;
	private Block block18;
	private Block block19;
	private Block block20;

	public int score=0;
	
	public Breakout() {

		ball = new Ball(400, 300, 10, 10, Color.RED, 3, 3);
		
		paddle = new Paddle(745, 200, 30, 100, Color.GREEN, 5);

		block1 = new Block(30, 50, 10, 50, Color.BLUE);
		block2 = new Block(30, 150, 10, 50, Color.BLUE);
		block3 = new Block(30, 250, 10, 50, Color.BLUE);
		block4 = new Block(30, 350, 10, 50, Color.BLUE);
		block5 = new Block(30, 450, 10, 50, Color.BLUE);
		block6 = new Block(50, 50, 10, 50, Color.BLUE);
		block7 = new Block(50, 150, 10, 50, Color.BLUE);
		block8 = new Block(50, 250, 10, 50, Color.BLUE);
		block9 = new Block(50, 350, 10, 50, Color.BLUE);
		block10 = new Block(50, 450, 10, 50, Color.BLUE);
		block11 = new Block(70, 50, 10, 50, Color.BLUE);
		block12 = new Block(70, 150, 10, 50, Color.BLUE);
		block13 = new Block(70, 250, 10, 50, Color.BLUE);
		block14 = new Block(70, 350, 10, 50, Color.BLUE);
		block15 = new Block(70, 450, 10, 50, Color.BLUE);
		block16 = new Block(90, 50, 10, 50, Color.BLUE);
		block17 = new Block(90, 150, 10, 50, Color.BLUE);
		block18 = new Block(90, 250, 10, 50, Color.BLUE);
		block19 = new Block(90, 350, 10, 50, Color.BLUE);
		block20 = new Block(90, 450, 10, 50, Color.BLUE);

		left = new Wall(0, 0, 10, 600, Color.BLACK);
		right = new Wall(775, 0, 10, 600, Color.BLACK);
		bottom = new Wall(10, 550, 800, 20, Color.BLACK);
		top = new Wall(10, 0, 800, 10, Color.BLACK);

		keys = new boolean[2];

		setBackground(Color.WHITE);
		setVisible(true);
		new Thread(this).start();
		addKeyListener(this); // starts the key thread to log key strokes
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		Graphics2D twoDGraph = (Graphics2D) window;
		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));
		Graphics graphToBack = back.createGraphics();
		
		graphToBack.drawString("Score: " + score, 390, 20);
		
		ball.moveAndDraw(graphToBack);

		paddle.draw(graphToBack);
		
		left.draw(graphToBack);
		right.draw(graphToBack);
		top.draw(graphToBack);
		bottom.draw(graphToBack);

		block1.draw(graphToBack);
		block2.draw(graphToBack);
		block3.draw(graphToBack);
		block4.draw(graphToBack);
		block5.draw(graphToBack);
		block6.draw(graphToBack);
		block7.draw(graphToBack);
		block8.draw(graphToBack);
		block9.draw(graphToBack);
		block10.draw(graphToBack);
		block11.draw(graphToBack);
		block12.draw(graphToBack);
		block13.draw(graphToBack);
		block14.draw(graphToBack);
		block15.draw(graphToBack);
		block16.draw(graphToBack);
		block17.draw(graphToBack);
		block18.draw(graphToBack);
		block19.draw(graphToBack);
		block20.draw(graphToBack);

		if (ball.didCollideTop(top)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		if (ball.didCollideBottom(bottom)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		if (ball.didCollideLeft(left)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		if (ball.didCollideRight(right)) {
			ball.setColor(Color.WHITE);
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score=0;
			graphToBack.drawString("Score: " + score, 390, 20);
			ball.setX(410);
			ball.setY(290);
			ball.setColor(Color.RED);
			ball.setXSpeed(ball.getXSpeed() + 3);
			ball.setYSpeed(ball.getYSpeed() + 2);
		}
		if (ball.didCollideRight(paddle) || ball.didCollideLeft(paddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}

		else if (ball.didCollideTop(paddle) || ball.didCollideBottom(paddle)) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());

		}
		else if (ball.didCollideLeft(block1) || ball.didCollideRight(block1)) {
			ball.setXSpeed(-ball.getXSpeed());
			block1.draw(graphToBack, Color.WHITE);
			block1.setWidth(0);
			block1.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block2) || ball.didCollideRight(block2)) {
			ball.setXSpeed(-ball.getXSpeed());
			block2.draw(graphToBack, Color.WHITE);
			block2.setWidth(0);
			block2.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block3) || ball.didCollideRight(block3)) {
			ball.setXSpeed(-ball.getXSpeed());
			block3.draw(graphToBack, Color.WHITE);
			block3.setWidth(0);
			block3.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block4) || ball.didCollideRight(block4)) {
			ball.setXSpeed(-ball.getXSpeed());
			block4.draw(graphToBack, Color.WHITE);
			block4.setWidth(0);
			block4.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block5) || ball.didCollideRight(block5)) {
			ball.setXSpeed(-ball.getXSpeed());
			block5.draw(graphToBack, Color.WHITE);
			block5.setWidth(0);
			block5.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block6) || ball.didCollideRight(block6)) {
			ball.setXSpeed(-ball.getXSpeed());
			block6.draw(graphToBack, Color.WHITE);
			block6.setWidth(0);
			block6.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block7) || ball.didCollideRight(block7)) {
			ball.setXSpeed(-ball.getXSpeed());
			block7.draw(graphToBack, Color.WHITE);
			block7.setWidth(0);
			block7.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block8) || ball.didCollideRight(block8)) {
			ball.setXSpeed(-ball.getXSpeed());
			block8.draw(graphToBack, Color.WHITE);
			block8.setWidth(0);
			block8.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block9) || ball.didCollideRight(block9)) {
			ball.setXSpeed(-ball.getXSpeed());
			block9.draw(graphToBack, Color.WHITE);
			block9.setWidth(0);
			block9.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block10) || ball.didCollideRight(block10)) {
			ball.setXSpeed(-ball.getXSpeed());
			block10.draw(graphToBack, Color.WHITE);
			block10.setWidth(0);
			block10.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block11) || ball.didCollideRight(block11)) {
			ball.setXSpeed(-ball.getXSpeed());
			block11.draw(graphToBack, Color.WHITE);
			block11.setWidth(0);
			block11.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block12) || ball.didCollideRight(block12)) {
			ball.setXSpeed(-ball.getXSpeed());
			block12.draw(graphToBack, Color.WHITE);
			block12.setWidth(0);
			block12.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block13) || ball.didCollideRight(block13)) {
			ball.setXSpeed(-ball.getXSpeed());
			block13.draw(graphToBack, Color.WHITE);
			block13.setWidth(0);
			block13.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block14) || ball.didCollideRight(block14)) {
			ball.setXSpeed(-ball.getXSpeed());
			block14.draw(graphToBack, Color.WHITE);
			block14.setWidth(0);
			block14.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block15) || ball.didCollideRight(block15)) {
			ball.setXSpeed(-ball.getXSpeed());
			block15.draw(graphToBack, Color.WHITE);
			block15.setWidth(0);
			block15.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block16) || ball.didCollideRight(block16)) {
			ball.setXSpeed(-ball.getXSpeed());
			block16.draw(graphToBack, Color.WHITE);
			block16.setWidth(0);
			block16.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block17) || ball.didCollideRight(block17)) {
			ball.setXSpeed(-ball.getXSpeed());
			block17.draw(graphToBack, Color.WHITE);
			block17.setWidth(0);
			block17.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block18) || ball.didCollideRight(block18)) {
			ball.setXSpeed(-ball.getXSpeed());
			block18.draw(graphToBack, Color.WHITE);
			block18.setWidth(0);
			block18.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block19) || ball.didCollideRight(block19)) {
			ball.setXSpeed(-ball.getXSpeed());
			block19.draw(graphToBack, Color.WHITE);
			block19.setWidth(0);
			block19.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		else if (ball.didCollideLeft(block20) || ball.didCollideRight(block20)) {
			ball.setXSpeed(-ball.getXSpeed());
			block20.draw(graphToBack, Color.WHITE);
			block20.setWidth(0);
			block20.setHeight(0);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 390, 20);
			score++;
			graphToBack.drawString("Score: " + score, 390, 20);
		}
		if (keys[0] == true) {
			paddle.moveUpAndDraw(graphToBack);
		}
		if (keys[1] == true) {
			paddle.moveDownAndDraw(graphToBack);
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = true;
			break;
		case 'S':
			keys[1] = true;
			break;

		}
	}

	public void keyReleased(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = false;
			break;
		case 'S':
			keys[1] = false;
			break;

		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void run() {
		System.out.println("Name: Andy Period: 4 Date: 4/4/18 Computer Number: 20");
		try {
			while (true) {
				Thread.currentThread().sleep(8);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}



package Pong;

import java.awt.Color;

public class Wall extends Block{
	public Wall(int x, int y, int width, int height, Color col){
		super(x,y,width,height,col);
	}
}





package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable {

	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int i, int j) {
		super(i, j);
	}

	public Ball(int i, int j, int k, int l) {
		super(i, j, k, l);
	}

	public Ball(int i, int j, int k, int l, Color col) {
		super(i, j, k, l, col);
	}

	public Ball(int i, int j, int k, int l, Color col, int m, int n) {
		super(i, j, k, l, col);
		xSpeed = m;
		ySpeed = n;
	}

	public boolean didCollideLeft(Object obj) {
		Block paddle = (Block) obj;
		if (getX() < paddle.getX() + paddle.getWidth() && getX() > paddle.getX() && getY() > paddle.getY()
				&& getY() <= paddle.getY() + paddle.getHeight()) {
			return true;
		}
		return false;
	}

	public boolean didCollideRight(Object obj) {

		Block paddle = (Block) obj;
		if (getX() + getWidth() > paddle.getX() - Math.abs(getXSpeed()) && getX() < paddle.getX()
				&& getY() > paddle.getY() && getY() <= paddle.getY() + paddle.getHeight()) {
			return true;
		}
		return false;
	}

	public boolean didCollideTop(Object obj) {
		Block paddle = (Block) obj;
		if ((getX() > paddle.getX() && paddle.getX() + paddle.getWidth() > getX() + getWidth())
				&& getY() + getHeight() > paddle.getY() - Math.abs(getYSpeed())
				&& getY() < paddle.getY() + paddle.getHeight()) {

			return true;
		}
		return false;
	}

	public boolean didCollideBottom(Object obj) {

		Block paddle = (Block) obj;
		if ((getX() > paddle.getX() && getX() + getWidth() < paddle.getX() + paddle.getWidth())
				&& getY() + getHeight() > paddle.getY() - Math.abs(getYSpeed())
				&& getY() - Math.abs(getYSpeed()) < paddle.getY() + paddle.getHeight()) {

			return true;

		}
		return false;
	}

	public void setSpeed(int i, int j) {
		xSpeed = i;
		ySpeed = j;
	}

	public void setXSpeed(int i) {
		xSpeed = i;
	}

	public void setYSpeed(int j) {
		ySpeed = j;
	}

	public void moveAndDraw(Graphics window) {
		draw(window, Color.WHITE);
		setX(getX() + xSpeed);
		setY(getY() + ySpeed);
		draw(window);
	}

	public boolean equals(Object obj) {
		return this == obj;
	}

	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	public String toString() {
		String output = "Ball xSpeed=" + xSpeed + ", ySpeed=" + ySpeed;
		return output;
	}
}




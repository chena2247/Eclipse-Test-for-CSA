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



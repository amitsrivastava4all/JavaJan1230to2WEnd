import java.awt.Color;
import java.awt.Graphics;

public class Ball implements GameConstants {
	private int x;
	private int y;
	private int w;
	private int h;
	private int xSpeed;
	private int ySpeed;
	private static RandomGenerator ballPostion = new RandomGenerator(GHEIGHT);
	private static RandomGenerator speedRandom = new RandomGenerator(MAX_SPEED);
	public void drawBall(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 50, 50);
	}
	
	public void changeDirection() {
		int randomSpeed= speedRandom.getRandom();
		if(x>=GWIDTH-50) {
			xSpeed = -randomSpeed;
		}
		else
		if(x<=0) {
			xSpeed = randomSpeed;
		}
		if(y>=GHEIGHT-50) {
			ySpeed = -randomSpeed;
		}
		else
		if(y<=0) {	
			ySpeed =  randomSpeed;
		}
	}
	public void move() {
		
		x+=xSpeed;
		y+=ySpeed;
	}
	public Ball() {
		this.x = this.y = ballPostion.getRandom();
		this.xSpeed = this.ySpeed = speedRandom.getRandom();
		this.w = this.h= 50;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	//this is a comment added
	
	

}









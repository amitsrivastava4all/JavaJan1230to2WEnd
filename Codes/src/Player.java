import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Player implements GameConstants{
	private int x;
	private int y;
	private int w;
	private int h;
	private int speed;
	private Image image;
	public void drawPlayer(Graphics g) {
		g.drawImage(image, x, y, w, h, null);
		move();
	}
	
	public void move() {
		x+=speed;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Player(){
		x = 30;
		w = h = 72;
		y = FLOOR - h ;
		speed = 0;
		
		image = new ImageIcon(Player.class.getResource(PLAYER_IMAGE)).getImage();
	}

}

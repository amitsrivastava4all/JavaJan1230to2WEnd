import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants {
	private Player player ;
	private Timer timer;
public Board() {
	setSize(GWIDTH,GHEIGHT);
	player = new Player();
	gameLoop();
	setFocusable(true);
	bindEvents();
}

private void gameLoop() {
	ActionListener r = (e)->{
		repaint();
	};
	timer= new Timer(DELAY,r);
//	timer  = new Timer(DELAY,(e)->{
//		repaint();
//	}) ;
	timer.start();
}

private void bindEvents() {
	this.addKeyListener(new KeyAdapter() {
//		public void keyTyped(KeyEvent e) {
//			System.out.println("Key Typed "+e.getKeyChar()+" "+e.getKeyCode());
//		}
		
		public void keyReleased(KeyEvent e) {
			player.setSpeed(0);
		}
		
		public void keyPressed(KeyEvent e) {
			int keyCode =  e.getKeyCode();
			if(keyCode == KeyEvent.VK_LEFT) {
				player.setSpeed(-5);
			}
			else
			if(keyCode == KeyEvent.VK_RIGHT) {
				player.setSpeed(5);
			}
			else
			if(keyCode == KeyEvent.VK_UP) {
				
			}
			else
			if(keyCode == KeyEvent.VK_DOWN) {
	
			}
			System.out.println("Key Pressed "+e.getKeyChar()+" "+e.getKeyCode());
		}
	});
}

private void drawBackground(Graphics g) {
	Image bg = new ImageIcon(Board.class.getResource(BACKGROUND_IMAGE)).getImage();
	g.drawImage(bg, 0, 0, GWIDTH, GHEIGHT, null);
}
@Override
public void paintComponent(Graphics g) {
	drawBackground(g);
	player.drawPlayer(g);
}
}

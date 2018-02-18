import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel implements GameConstants {
public Board() {
	setSize(GWIDTH,GHEIGHT);
	
}

private void drawBackground(Graphics g) {
	Image bg = new ImageIcon(Board.class.getResource(BACKGROUND_IMAGE)).getImage();
	g.drawImage(bg, 0, 0, GWIDTH, GHEIGHT, null);
}
@Override
public void paintComponent(Graphics g) {
	drawBackground(g);
}
}

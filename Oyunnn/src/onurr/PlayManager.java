package onurr;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import mino.Block;
import mino.Mino;
import mino.Mino_L1;

public class PlayManager {

	final int WIDTH = 360;
	final int HEIGHT = 600;
	public static int left_x;
	public static int right_x;
	public static int top_y;
	public static int bottom_y;
	public static  int dropInterval=60;
	
	
	Mino currentMino;
	final int MINO_START_X;
	final int MINO_START_Y;

	public PlayManager() {
	    left_x = (GamePanel.WIDTH / 2) - (this.WIDTH / 2);
	    right_x = left_x + this.WIDTH;
	    top_y = 50;
	    bottom_y = top_y + this.HEIGHT;

	    MINO_START_X = left_x + (WIDTH / 2) - Block.SIZE;
	    MINO_START_Y = top_y + Block.SIZE;

	    currentMino = new Mino_L1();
	    currentMino.setXY(MINO_START_X, MINO_START_Y);
	}

	public void update() {
	    currentMino.update();
	}

	public void draw(Graphics2D g2) {
	    g2.setColor(Color.white);
	    g2.setStroke(new BasicStroke(4f));
	    g2.drawRect(left_x - 4, top_y - 4, WIDTH + 8, HEIGHT + 8);

	    int x = right_x + 20; // Sağ kareye yakın bir pozisyon
	    int y = top_y + 20;   // Üst kareye yakın bir pozisyon
	    g2.drawRect(x + 20, y + 383, 200, 200);
	    g2.setFont(new Font("Arial", Font.PLAIN, 30));
	    g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
	    g2.drawString("NEXT", x + 80, y + 440);

	    if (currentMino != null) {
	        currentMino.draw(g2);
	    }
	}


	
	
}

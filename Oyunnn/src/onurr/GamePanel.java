package onurr;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
   public static final int WIDTH=1280;
   public static final int HEIGHT=720;
   final int fps=60;
   Thread gameThread;
   PlayManager pm;
   
   
   public GamePanel() {
	   this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
	   this.setBackground(Color.black);
	   this.setLayout(null);
	   pm= new PlayManager();
	   this.addKeyListener(new KeyHandler());
	   this.setFocusable(true);
   }

   
    public void LaunchGame() {
    	gameThread=new Thread(this);
    	gameThread.start();
    }
@Override
     public void run() {
    
	double drawInterval=1000000000/fps;
	double delta=0;
	long lastTime=System.nanoTime();
	long currentTime;
	
	while(gameThread!=null) {
		currentTime=System.nanoTime();
		
		delta+=(currentTime-lastTime)/drawInterval;
		lastTime=currentTime;
		if(delta>=1) {
			update();
			repaint();
			delta--;
		}
		}
	
	
	
}
     public void update() {
    	 pm.update();
     }
     public void paintComponent(Graphics g) {
    	 super.paintComponent(g);
    	 
    	 Graphics2D g2=(Graphics2D)g;
    	 pm.draw(g2);
     }
}

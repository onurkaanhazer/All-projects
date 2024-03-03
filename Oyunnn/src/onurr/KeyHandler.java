package onurr;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
	
	public static boolean alt,sağ,sol,üst; 

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code=e.getKeyCode();
		if(code==KeyEvent.VK_LEFT) {
			sol=true;
		}
		if(code==KeyEvent.VK_RIGHT) {
			sağ=true;
		}
		if(code==KeyEvent.VK_DOWN) {
			alt=true;
		}
		if(code==KeyEvent.VK_UP) {
			üst=true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

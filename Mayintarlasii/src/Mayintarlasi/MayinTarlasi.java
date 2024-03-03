package Mayintarlasi;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MayinTarlasi implements MouseListener {
	JFrame frame;
	Btn[][] board=new Btn [10][10];
     public MayinTarlasi() {
    	 frame =new JFrame("Mayın Tarlası");
    	 frame.setSize(800, 800);
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 frame.setLayout(new GridLayout(10,10));
    	 for(int row=0;row<board.length;row++) {
    		 for(int col=0;col<board[0].length;col++) {
    			 Btn b=new Btn(row,col);
    			 frame.add(b);
    			 b.addMouseListener(this);
    			 board [row][col]=b;
    		 }
    		 
    		 
    	 }
    	 generateMine();
    	 print();
    	 frame.setVisible(true);
    	 
     }
     public void generateMine() {
    	int i=0;
    	while(i<10) {
    		int randRow = (int) (Math.random()*board.length);
    		int randcol = (int) (Math.random()*board[0].length);
    		while(board[randRow][randcol].isMine()) {
    			 randRow = (int) (Math.random()*board.length);
        		 randcol = (int) (Math.random()*board[0].length);
    			
    		}
    		board[randRow][randcol].setMine(true);
    		i++;
    		
    			
    		
    	}
    	 
     }
     public void print() {
    	 for(int row=0;row<board.length;row++) {
    		 for(int col=0;col<board[0].length;col++) {
    		 if(board[row][col].isMine()) {
    			 board[row][col].setIcon(new ImageIcon("bomb2.png"));
    		 }
    		 
    		 
    		 }
    		 }
    	 
    	 
    	 
    	 
    	 
     }
	@Override
	public void mouseClicked(MouseEvent e) {
		Btn b=(Btn) e.getComponent();
		if(e.getButton()==1) {
			System.out.println("sol tık");
		}
		else if(e.getButton()==3) {
			System.out.println("sağ tık");
			if(!b.isFlag()) {
				b.setIcon(new ImageIcon("flag.png"));
				b.setFlag(true);
			}else {
				b.setIcon(null);
				b.setFlag(false);
				
			}
			
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

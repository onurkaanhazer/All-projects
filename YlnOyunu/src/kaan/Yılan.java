package kaan;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class Yılan extends JLabel {
    public Kutu mHead = new Kutu();
    public Timer mTimer =null;
    public Yem mYem=new Yem();
    public Random mRandom =null;
    public ArrayList <Kutu>Liste=new ArrayList <Kutu>();
    
    Yılan() {
    	mRandom=new Random(System.currentTimeMillis());
        addKeyListener(new KlavyeKontrol());
        setFocusable(true);
        mTimer =new Timer(100,new TimerKontrol());
        mTimer.start();
        
        Liste.add(mHead);
        for(int i=1;i<10;i++) {
        	KuyrukEkle();
        	
        	
        }
        
        
        add(mYem);
        
        add(mHead);
    }
    public void KuyrukEkle() {
    	Kutu k=Liste.get(Liste.size()-1).KutuOlustur();
    	Liste.add(k);
        add(k);
    	
    	
    }
    public void YemEkle() {
    	int Width=getWidth()-30-mYem.mGenislik;
    	int Height=getHeight()-30-mYem.mGenislik;
    	int posx=10+Math.abs(mRandom.nextInt())%Width;
    	int posy=10+Math.abs(mRandom.nextInt())%Height;
    	posx=posx-posx%20;
    	posy=posy-posy%20;
    	
    	for(int i=0;i<Liste.size();i++) {
    		if((posx==Liste.get(i).getX())&&(posy==Liste.get(i).getY())) {
    			 YemEkle();
    			 return;
    		}
    	}
    	
    	
    	mYem.setPosition(posx, posy);
    	
    	
    }
    public boolean carpismaVarmi() {
    	
    	int kalem=10;
    	int genislik=getWidth();
    	int yukseklik=getHeight();
    	
    	
    	if(mHead.getX()<=10) {
    		return true;
    	}
    	if(mHead.getX()+mHead.mGenislik>=genislik-kalem) {
    		return true;
    	}
    	if(mHead.getY()<=10) {
    		return true;
    	}
    	if(mHead.getY()+mHead.mGenislik>=genislik-kalem) {
    		return true;
    	}
    	for(int i=1;i<Liste.size();i++) {
    		int x=Liste.get(i).getX();
    		int y=Liste.get(i).getY();
    		if((x==mHead.getX())&&(y==mHead.getY()))
    			return true;
    	}
    	if((mYem.getX()==mHead.getX())&&(mYem.getY()==mHead.getY())){
    		KuyrukEkle();
    		YemEkle();
    	}
    	
    	
    	
    	
    	
    	return false;
    }
    public void HepsiniYurut() {
    	
    	for(int i=Liste.size()-1;i>0;i--) {
    		Kutu onceki=Liste.get(i-1);
    		Kutu sonraki=Liste.get(i);
    		
    		
    		Liste.get(i).Hareket();
    		sonraki.mYon=onceki.mYon;	
    }
    	mHead.Hareket();
    	
    }

 class TimerKontrol implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(carpismaVarmi())
			mTimer.stop();
	HepsiniYurut();
		
	
	
	
	
	}
	 
	 
    	
    }
    
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rect = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
        g2.setColor(Color.red);
        g2.setStroke(new BasicStroke(10));
        g2.draw(rect);
        super.paint(g);
    }

    class KlavyeKontrol implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            	
            	if(mHead.mYon!=YON.SAG)
            	mHead.mYon=YON.SOL;
             
            }

            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            	if(mHead.mYon!=YON.SOL)
            	mHead.mYon=YON.SAG;
            }

            if (e.getKeyCode() == KeyEvent.VK_UP) {
            	if(mHead.mYon!=YON.ASAGI)
            	mHead.mYon=YON.YUKARI;
            }

            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            	if(mHead.mYon!=YON.YUKARI)
            	mHead.mYon=YON.ASAGI;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

	
}

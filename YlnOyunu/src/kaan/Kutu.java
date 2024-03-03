package kaan;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JLabel;

public class Kutu  extends JLabel {

	public int mGenislik=20;
	public int mYon=YON.SAG;
	Kutu(){
		
		setBounds(100, 100, mGenislik, mGenislik);
		
	}

	@Override
	public void paint (Graphics g) {
		Graphics2D g2=(Graphics2D)g;
		Rectangle2D rect=new Rectangle2D.Double(1, 1, getWidth()-2, getHeight()-2);
		g2.setColor(Color.red);
		g2.setStroke(new BasicStroke(2));
		g2.draw(rect);
		g2.fill(rect);
		
		
	}
	public void SolaGit() {
		  int posx = getX();
          int posy = getY();
          posx -=mGenislik;
          setBounds(posx, posy,mGenislik,mGenislik);
		
	}
	public void SağaGit() {
		  int posx = getX();
          int posy = getY();
          posx +=mGenislik;
          setBounds(posx, posy,mGenislik,mGenislik);
		
		
		
	}
	public void YukariGit() {
		  int posx = getX();
          int posy = getY();
          posy -=mGenislik;
          setBounds(posx, posy,mGenislik,mGenislik);
		
		
	}
	public void AsagiGit() {
		 int posx = getX();
         int posy = getY();
         posy +=mGenislik;
         setBounds(posx, posy,mGenislik,mGenislik);
		
		
	}
	public Kutu KutuOlustur() {
		Kutu k =new Kutu();
		int x=getX();
		int y=getY();
		k.setBounds(x, y, mGenislik, mGenislik);
		k.mYon=-mYon;
		k.Hareket();
		k.mYon=mYon;
		
		
		return k;
	}
	
	
	
	public void Hareket() {
		if(mYon==YON.SAG) {
			SağaGit();
		}
		else if(mYon==YON.SOL) {
			SolaGit();
		}
		else if(mYon==YON.ASAGI) {
			AsagiGit();
		}
		else
			YukariGit();
		
		
	}

}

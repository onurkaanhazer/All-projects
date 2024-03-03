package kaan;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class AnaPencere extends JFrame{
	private static AnaPencere mpencere=null;
	private int mGenislik=600;
	private int mYukseklik=600;
	private AnaPencere(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		SetDimension( mGenislik, mYukseklik);
		setResizable(false);
		Yılan y=new Yılan();
		add(y);
		
	}
	
	public static AnaPencere penceregetir() {
		if(mpencere==null) 
			mpencere=new AnaPencere();
		
		
			return mpencere;
		}

		
	
	
	public void SetDimension(int Genislik,int Yukseklik) {
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		int posx=0;
		int posy=0;
		
		if(mGenislik+100>dim.width)
			mGenislik=dim.width-100;
		if(mYukseklik+100>dim.height)
			mYukseklik=dim.height-100;
		
		posx=(dim.width-mGenislik)/2;
		posy=(dim.height-mYukseklik)/2;
		
		setBounds(posx, posy, mGenislik, mYukseklik);
		
	}
	

}

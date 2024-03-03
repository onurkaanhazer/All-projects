package Tetriss;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Tahta extends JPanel implements KeyListener{
	
	private static final int TAHTA_GENISLIK=10;
	private static final int TAHTA_YÜKSEKLIK=20;
	private static final int KARE_BOYUTU=30;
	private Color[][] tahta;
	
	public  Tahta() {
		tahta=new Color[TAHTA_YÜKSEKLIK][TAHTA_GENISLIK];
		setBackground(Color.BLACK);
	}
	
	public void kutucuguAsagiKaydir() {
		
	}
	
	
	public void kutucuguEkle(Kutucuk kutucuk,int row,int col) {
		int [][] matris	=kutucuk.getMatris();
		int renk=kutucuk.getrenkKodu();
	}
	
	public static int getTahtaGenislik() {
		return TAHTA_GENISLIK;
	}


	public static int getTahtaYükseklik() {
		return TAHTA_YÜKSEKLIK;
	}


	public static int getKareBoyutu() {
		return KARE_BOYUTU;
	}

	 public void keyPressed(KeyEvent e) {
		int keyCode =e.getKeyCode();
		if(keyCode== KeyEvent.VK_LEFT) {
			
		}
	}
	
	
	
	@Override
	public synchronized void addKeyListener(KeyListener l) {
		// TODO Auto-generated method stub
		super.addKeyListener(l);
	}

	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		for(int row =0 ;row<TAHTA_YÜKSEKLIK;row++) {
			for(int col=0;col< TAHTA_GENISLIK;col++) {
				Color renk=tahta[row][col];
				if(renk!=null) {
					g.setColor(renk);
					g.fillRect(col * KARE_BOYUTU, row * KARE_BOYUTU, KARE_BOYUTU, KARE_BOYUTU);
				}
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}

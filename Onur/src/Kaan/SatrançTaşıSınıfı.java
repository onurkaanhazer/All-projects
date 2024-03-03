package Kaan;

public class SatrançTaşıSınıfı extends SatrançTahtasi {
 private String renk;
 private int pozisyonX;
 private int pozisyonY;
public SatrançTaşıSınıfı(String renk, int pozisyonX, int pozisyonY) {
	this.renk = renk;
	this.pozisyonX = pozisyonX;
	this.pozisyonY = pozisyonY;
}
public boolean bosMu(int pozisyonX,int poxisyonY,SatrançTaşıSınıfı [][] tahta) {
	if(pozisyonX<0 || pozisyonX>7 || pozisyonY<0 || pozisyonY>7) {
		return false;
	}
	return tahta[pozisyonY][pozisyonX] == null;
	
}
 
public void hareketEt(int yeniPozisyonX,int yeniPozisyonY) {
	if(yeniPozisyonX<0 || yeniPozisyonX>7 || yeniPozisyonY<0 || yeniPozisyonY>7) {
		System.out.println("Geçersiz işlem");
		return;
	
	if(yeniPozisyonX==pozisyonX && yeniPozisyonY==pozisyonY+1) {
		if(tahta.)
		pozisyonX=yeniPozisyonX;
		pozisyonY=yeniPozisyonY;
		System.out.println("taş 1 birim ileri gitti");
	}
	
	else if(yeniPozisyonX==pozisyonX+1 && yeniPozisyonY==pozisyonY) {
		pozisyonX=yeniPozisyonX;
		pozisyonY=yeniPozisyonY;
		System.out.println("taş 1 birim sağa gitti");
	}
	else if(yeniPozisyonX==pozisyonX-1 && yeniPozisyonY==pozisyonY) {
		pozisyonX=yeniPozisyonX;
		pozisyonY=yeniPozisyonY;
		System.out.println("taş 1 birim sola gitti");
	}
	else
		System.out.println("Geçersiz hamle");
	
}
}

public int getPozisyonX() {
	return pozisyonX;
}

public void setPozisyonX(int pozisyonX) {
	this.pozisyonX = pozisyonX;
}

public int getPozisyonY() {
	return pozisyonY;
}

public void setPozisyonY(int pozisyonY) {
	this.pozisyonY = pozisyonY;
}



}

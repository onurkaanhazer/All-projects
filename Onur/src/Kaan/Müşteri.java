package Kaan;

public class Müşteri {
  public String	ad,soyad;
  public int hesapNumarası,bakiye;
public Müşteri(String ad, String soyad, int hesapNumarası, int bakiye) {
	this.ad = ad;
	this.soyad = soyad;
	this.hesapNumarası = hesapNumarası;
	this.bakiye = bakiye;
}
public void BakiyeSorgulama() {
	System.out.println("Güncel bakiye tutarınız : " + this.bakiye);
}
public void ParaYatırma(int Ytutar) {
	this.bakiye+=Ytutar;
	System.out.println("Güncel tutar : " + this.bakiye);
}
public void ParaÇekme(int Çtutar) {
	this.bakiye-=Çtutar;
	System.out.println("Güncel tutar : " + this.bakiye);
}
public String getAd() {
	return ad;
}
public void setAd(String ad) {
	this.ad = ad;
}
public String getSoyad() {
	return soyad;
}
public void setSoyad(String soyad) {
	this.soyad = soyad;
}
public int getHesapNumarası() {
	return hesapNumarası;
}
public void setHesapNumarası(int hesapNumarası) {
	this.hesapNumarası = hesapNumarası;
}
public int getBakiye() {
	return bakiye;
}
public void setBakiye(int bakiye) {
	this.bakiye = bakiye;
}

/*public void ParaTransferi(Müşteri alici,int bakiye) {
	if(bakiye>this.bakiye) {
		System.out.println("Yetersiz bakiye");
	}
	else
	      this.bakiye=this.bakiye-bakiye;
	      alici.bakiye+=bakiye;
	System.out.println(this.ad+" "+this.soyad+" "+"Kullanıcısının hesabında kalan bakiye : " + this.bakiye);
	System.out.println(alici.ad+" "+alici.soyad+" "+"Kullanıcısının hesabında oluşan yeni bakiye : " + alici.bakiye);
	
	
}
  */
}

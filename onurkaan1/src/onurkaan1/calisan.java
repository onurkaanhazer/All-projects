package onurkaan1;

public class calisan {
   String adsoyad,eposta;
   String numara;

   
   
 public static void listele(calisan [] girisyapanlar) {
	 for(calisan c : girisyapanlar) {
		 System.out.println(c.giris());
	 }
	 
 }
   
   public String giris() {
	   return this.adsoyad+"giris yapti";
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
public calisan(String adsoyad, String eposta, String numara) {	
	this.adsoyad = adsoyad;
	this.eposta = eposta;
	this.numara = numara;
}





public String getAdsoyad() {
	return adsoyad;
}


public void setAdsoyad(String adsoyad) {
	this.adsoyad = adsoyad;
}


public String getEposta() {
	return eposta;
}


public void setEposta(String eposta) {
	this.eposta = eposta;
}


public String getNumara() {
	return numara;
}


public void setNumara(String numara) {
	this.numara = numara;
}
	
}

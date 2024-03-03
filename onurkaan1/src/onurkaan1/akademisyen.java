package onurkaan1;

public class abstract akademisyen  extends calisan {
	public String getBolum() {
		return bolum;
	}
	
	
	public String giris() {
		return this.adsoyad+"giris yapti a kapsından";
		
	}
	
	



	public void setBolum(String bolum) {
		this.bolum = bolum;
	}



	public String getGorevler() {
		return gorevler;
	}



	public void setGorevler(String gorevler) {
		this.gorevler = gorevler;
	}



	public String getDers() {
		return ders;
	}



	public void setDers(String ders) {
		this.ders = ders;
	}



	String bolum,gorevler;
	String ders;

	

	  public abstract void dersegir();
		  
	  


	
	
	

	public akademisyen(String adsoyad, String eposta, String numara, String bolum, String gorevler, String ders) {
		super(adsoyad, eposta, numara);
		this.bolum = bolum;
		this.gorevler = gorevler;
		this.ders = ders;
	}

	
}

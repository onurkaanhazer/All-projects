package onurkaan1;

public class Asistan  extends akademisyen{
	protected String yukseklisans;
		public String getYukseklisans() {
		return yukseklisans;
	}

	public void setYukseklisans(String yukseklisans) {
		this.yukseklisans = yukseklisans;
	}

		public Asistan(String adsoyad, String eposta, String numara, String bolum, String gorevler, String ders,
			String yukseklisans) {
		super(adsoyad, eposta, numara, bolum, gorevler, ders);
		this.yukseklisans = yukseklisans;
	}

	
  
}

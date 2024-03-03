package onurkaan1;

public class abstract Ogretımuyesı extends akademisyen {
	public String getYukseklisans() {
		return yukseklisans;
	}

	public void setYukseklisans(String yukseklisans) {
		this.yukseklisans = yukseklisans;
	}

	public Ogretımuyesı(String adsoyad, String eposta, String numara, String bolum, String gorevler, String ders,
			String yukseklisans) {
		super(adsoyad, eposta, numara, bolum, gorevler, ders);
		this.yukseklisans = yukseklisans;
	}

	protected String yukseklisans;
	

}

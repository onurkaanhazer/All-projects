package Kaan;

public class Kitap {
	private String kitap_adi,yazar_adi;
	private int ısbn,basım_yılı;
	public Kitap(String kitap_adi, String yazar_adi, int isbn, int basım_yılı) {
		this.kitap_adi = kitap_adi;
		this.yazar_adi = yazar_adi;
		ısbn = isbn;
		this.basım_yılı = basım_yılı;
	}
	public String getKitap_adi() {
		return kitap_adi;
	}
	public void setKitap_adi(String kitap_adi) {
		this.kitap_adi = kitap_adi;
	}
	public String getYazar_adi() {
		return yazar_adi;
	}
	public void setYazar_adi(String yazar_adi) {
		this.yazar_adi = yazar_adi;
	}
	public int getIsbn() {
		return ısbn;
	}
	public void setIsbn(int isbn) {
		ısbn = isbn;
	}
	public int getBasım_yılı() {
		return basım_yılı;
	}
	public void setBasım_yılı(int basım_yılı) {
		this.basım_yılı = basım_yılı;
	}
	
	

}

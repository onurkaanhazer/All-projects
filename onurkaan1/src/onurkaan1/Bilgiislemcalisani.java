package onurkaan1;

public class Bilgiislemcalisani extends Memurlar {
	public String getGorev() {
		return gorev;
	}

	public void setGorev(String gorev) {
		this.gorev = gorev;
	}

	protected String gorev;

	public Bilgiislemcalisani(String adsoyad, String eposta, String numara, String departman, String mesai,
			String gorev) {
		super(adsoyad, eposta, numara, departman, mesai);
		this.gorev = gorev;
	}
}

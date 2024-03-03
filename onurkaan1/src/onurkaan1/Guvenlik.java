package onurkaan1;

public class Guvenlik  extends Memurlar{
     public String getDeapartman() {
		return deapartman;
	}
	public void setDeapartman(String deapartman) {
		this.deapartman = deapartman;
	}
	public String getMesai() {
		return mesai;
	}
	public void setMesai(String mesai) {
		this.mesai = mesai;
	}
	protected String deapartman;
     protected String  mesai;
	public Guvenlik(String adsoyad, String eposta, String numara, String departman, String mesai, String deapartman,
			String mesai2) {
		super(adsoyad, eposta, numara, departman, mesai);
		this.deapartman = deapartman;
		mesai = mesai2;
	}
}

package onurkaan1;

public class Memurlar  extends calisan{
	
       public Memurlar(String adsoyad, String eposta, String numara, String departman, String mesai) {
		super(adsoyad, eposta, numara);
		this.departman = departman;
		this.mesai = mesai;
	}

	String departman,mesai;
       
 
	
	
}

import java.util.HashMap;

public class KullaniciAdiVeSifreler {

	HashMap<String,String> logininfo=new HashMap<String,String>();
	
	
	KullaniciAdiVeSifreler(){
		logininfo.put("onur", "123");
		logininfo.put("kaan", "456");
		logininfo.put("mete", "789");
	}
	
	protected HashMap getlogininfo() {
		return logininfo;
	}
	
}

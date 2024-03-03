package Kaan;

import java.util.ArrayList;

public class Kütüphane {
  private ArrayList<Kitap> Kitaplar=new ArrayList<>();
  
  
  public void Kitap_ekleme(Kitap kitM) {
	  Kitaplar.add(kitM);
  }
  public void Kitap_listeleme() {
	 for(int i=0;i<=Kitaplar.size();i++) {
		 System.out.println(Kitaplar.get(i));
	 }
	 
	
	  
	  
  }
  public void Kitap_silme(int ısbn) {
	  Kitap silkitap=null;
	  for(Kitap kitap:Kitaplar) {
		  if(kitap.getIsbn()==ısbn) {
			  silkitap=kitap;
			  break;
		  }
		  if(silkitap!=null) {
			  System.out.println("Aradığnız kitap bulundu");
			  Kitaplar.remove(silkitap);
			  System.out.println("Aradığınız kitap silindi");
		  }
		  else {
			  System.out.println("Aradığınız kitap bulunamadı");
		  }
	  }
	  
  }
}

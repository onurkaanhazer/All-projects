package Kaan;

import java.util.ArrayList;

public class Banka {
     private ArrayList<Müşteri> musteriListesi=new ArrayList<>();
     
     public void HesapBulma(int hesapNumarası) {
    	 int hesap=hesapNumarası;
    	 if(musteriListesi.contains(hesap)) {
    		 System.out.println("Aranan hesaba ulaşıldı ");
    	 }
    	 else
    		 System.out.println("Böyle bir hesaba ulaşılamadı");
    	 
     }
     public void MüşteriEkleme(Müşteri yeniM) {
    	 musteriListesi.add(yeniM);
     }
     public void MüşteriSilme(int hesapNumarası) {
    	 Müşteri silinecekMüşteri=null;
    	 for(Müşteri müşteri: musteriListesi) {
    		 if(müşteri.getHesapNumarası()==hesapNumarası) {
    			 silinecekMüşteri=müşteri;
    			 break;
    		 }
    		 
    	 }if(silinecekMüşteri!=null) {
    		 musteriListesi.remove(silinecekMüşteri);
    		 System.out.println("Müşteri sistemden başarıyla silinmiştir");
    	 }
    	 else
    		 System.out.println("Böyle bir müşteri bulunamadı");
    	 
     }
}

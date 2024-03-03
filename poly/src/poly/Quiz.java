package poly;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int tip, yaş;
        double km, toplam_fiyat;
        System.out.println("Otobüs bileti fiyatı hesaplayan uygulamaya hoşgeldiniz. Lütfen aşağıdaki bilgileri doldurun.");
        System.out.println("Gideceğiniz mesafe kaç km?");
        km = Scan.nextDouble();
        System.out.println("Kaç yaşındasınız?");
        yaş = Scan.nextInt();
        System.out.println("Yolculuk tipiniz nedir? 1-)Tek yön\t 2-)Gidiş-Dönüş  ");
        tip = Scan.nextInt();
      
        if(km>0 && yaş>0 && (tip==1 || tip==2)) {
        	toplam_fiyat=km*0.10;
        	double indirim;
        
      
        if(yaş<12) {
    	 indirim=0.50;
         }
        else if(yaş>=12 && yaş<=24) {
        	indirim=0.10;
        }
        else if(yaş>65) {
        	indirim=0.30;
        }
        toplam_fiyat=(toplam_fiyat*0.70);
        
        if(tip==2) {
        	toplam_fiyat-=(toplam_fiyat*0.20);
        	toplam_fiyat*=2;
        }
        System.out.println("Toplam tutar="+ toplam_fiyat);
    }
        else
        	System.out.println("Hatalı veri girdiniz!");
}
}
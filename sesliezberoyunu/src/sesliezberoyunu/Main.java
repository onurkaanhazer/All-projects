package sesliezberoyunu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		 Scanner scan=new Scanner(System.in);
		 ArrayList<String> kelimeler=new  ArrayList<String>();
         kelimeler.add("araba");
         kelimeler.add("Bilgisayar");
         kelimeler.add("sayaç");
         kelimeler.add("defter");
         kelimeler.add("kalem");
         kelimeler.add("silgi");
         kelimeler.add("telefon");
         
         Random random=new Random();
		 int indeks=random.nextInt(kelimeler.size());
		 String secilen=kelimeler.get(indeks);
		 
		   System.out.println("lütfen araba,bilgisayar,sayaç,defter,kalem,silgi,telefon kelimelerinden birini seçiniz");
		   String kelime=scan.nextLine();
		   
		   if(secilen==kelime) {
			   System.out.println("tebrikler kelimeyi doğru tahmin ettiniz");
		   }
		   else {
			   System.out.println("Malesef bilemediniz kelime şuydu="+ secilen);
		   }
	}

}

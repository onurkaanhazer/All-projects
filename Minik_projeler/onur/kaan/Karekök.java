package kaan;

import java.util.Scanner;

public class Karekök {

	public static void main(String[] args) {
	  System.out.println("Karekök uygulamasına hoşgeldiniz");
	  System.out.println("Lütfen karekökünün alınmasını istediğiniz sayıyı giriniz");
	  Scanner scan=new Scanner(System.in);
	  int sayi=scan.nextInt();
	  System.out.println("Sayını karekökü = " + Math.sqrt(sayi));
	  

	}

}

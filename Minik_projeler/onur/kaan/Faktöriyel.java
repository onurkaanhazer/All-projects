package kaan;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Faktöriyel {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Ebob hesaplayan uygulamaya hoşgeldiniz");
		  System.out.println("Lütfen hesaplanmasını istediğiniz iki sayıyı giriniz");
		  int sayi1=scan.nextInt();
		  int sayi2=scan.nextInt();
		  int sonuc=1;
		  int buyuk=Math.max(sayi1, sayi2);
		  for(int i=1;i<=buyuk;i++) {
			  if(sayi1%i==0 && sayi2%i==0) {
				sonuc=i;
				 
			  }
		  }
		  System.out.println("Ebob = " + sonuc);
	}

}

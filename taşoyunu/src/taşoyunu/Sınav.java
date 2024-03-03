package taşoyunu;

import java.util.Scanner;

public class Sınav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 boolean asal=true;
		int sayi;
		do {
			 System.out.println("Lütfen pozitif bir sayı giriniz"); 
			  sayi = scan.nextInt();
		}while(sayi<2);
		 
		 for(int i=2;i<sayi;i++) {
			 if(sayi%i==0) {
				 System.out.println("sayı asal değildir");
				 asal=false;
				 break;
			 }
		 }
		 
	}
}


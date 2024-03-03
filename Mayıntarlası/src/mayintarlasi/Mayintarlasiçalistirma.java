package mayintarlasi;

import java.util.Scanner;

public class Mayintarlasiçalistirma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int row,column;
		System.out.println("mayin tarlasi oyununa hoşgeldiniz");
		System.out.println("lütfen oynamak istediginiz boyutları giriniz");
		System.out.println("satir sayisi:");
		//row=scan.nextInt();
		System.out.println("sütun sayisi:");
		//column=scan.nextInt();
		mayintarlasi tahta1=new mayintarlasi(5,5);
		tahta1.run();
		
		
	}

}

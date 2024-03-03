package kaan;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
          System.out.println("Fibonacci programına hoşgeldiniz");
          System.out.println("Lütfen serinin ilk kaç elemanını görmnek istiyorsanız yazın");
          int sayi1=scan.nextInt();
          long terim1 = 0; // İlk terim
          long terim2 = 1; // İkinci terim

          System.out.println("Fibonacci Dizisi:");

          if (sayi1 >= 1) {
              System.out.print(terim1 + " ");
          }
          if (sayi1 >= 2) {
              System.out.print(terim2 + " ");
          }

          for (int i = 3; i <= sayi1; i++) {
              long yeniTerim = terim1 + terim2;
              System.out.print(yeniTerim + " ");

              terim1 = terim2;
              terim2 = yeniTerim;
          }
      }
  
          
        

	}



package kaan;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ortalama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("Not hesaplama uygulamasına hoşgeldiniz");
    System.out.println("Lütfen sırasıyla birinci ve ikinci notlarınızı giriniz");
    int not1,not2;
    double ortalama;
    not1=scan.nextInt();
    not2=scan.nextInt();
    ortalama=(not1*0.40)+(not2*0.60);
    System.out.println("Not oralamanız = " + ortalama);
    if(ortalama<50) {
    	System.out.println(" başarısız");
    }
    else if(ortalama>50 && ortalama<80) {
    	System.out.println("Orta");
    }
    else
    	System.out.println("Başarılı");
    
    
    try {
        // Dosyayı oluşturun veya varsa üzerine yazın
        FileWriter dosyaYazici = new FileWriter("notlar.txt");

        // Kullanıcının girdiği notları dosyaya yazın
        dosyaYazici.write("Sınav Notları:\n");
        dosyaYazici.write("Not 1: " + not1 + "\n"); // not1 kullanıcının girdiği not olsun
        dosyaYazici.write("Not 2: " + not2 + "\n"); // not2 kullanıcının girdiği not olsun
        // Diğer notları da aynı şekilde yazabilirsiniz

        // Dosyayı kapatın
        dosyaYazici.close();
        
        System.out.println("Notlar dosyaya kaydedildi.");
    } catch (IOException e) {
        System.out.println("Dosya yazma hatası: " + e.getMessage());
    }

	}

}
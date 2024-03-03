package email_uygulaması;

import java.util.Scanner;

public class email {

	private String ad;
	private String soyad;
	private String sifre;
	private String departman;
	private int mailkapasitesi=500;
	private String alternatif_email;
	private int standartSifreUzunluğu=10;
	
	
	
	Scanner scan=new Scanner(System.in);
	int secim=scan.nextInt();
	
	public email(String ad, String soyad) {
		this.ad = ad;
		this.soyad = soyad;
		System.out.println("Email'iniz oluşturuldu:"+ad+" "+soyad);
		this.departman=setDepartman();
		System.out.println("Departmanınız="+departman);
		this.sifre=rastgeleSifre(standartSifreUzunluğu);
		System.out.println("Şifreniz = "+ this.sifre);
		System.out.println("sizin için oluşturulan email = "+ this.ad+"."+this.soyad+"@"+this.departman+".company.com");
	}
	private  String setDepartman() {
		System.out.println("Hangi departmandansınız");
		System.out.println("1_Satış departmanı\n2_Üretim departmanı\n3_Geliştirme departmanı\n0_Hiçbiri");
		Scanner scan=new Scanner(System.in);
		int secim=scan.nextInt();
		if(secim==1) {
			return "satis";
		}
		else if(secim==2) {
			return "üretim";
		}
		else if(secim==3) {
			return "Gelistirme";
		}
		else
			return "";
		
	}
	
	private String rastgeleSifre(int uzunluk) {
		String SifreAyarla="ABCDEFGHIJKLMNOPRSTUVYZ0123456789!^+%&/#$½@";
		char [] sifre=new char[uzunluk];
		for(int i=0;i<uzunluk;i++) {
			int rand=(int) (Math.random()*SifreAyarla.length());
			sifre[i]=SifreAyarla.charAt(rand);
		}
		return new String (sifre);
	}
	
	public void MailKapasitesiAyarla(int kapasite) {
		this.mailkapasitesi=kapasite;
	}
	
	public void yeniEmail(String yeniMail) {
	   this.alternatif_email=yeniMail;	
	}
	
	public void yeniSifre(String Ysifre) {
		this.sifre=Ysifre;
	}
	
	public int MailKapasitesiDondur() {
		return mailkapasitesi;
	}
	
}

	import java.util.Random;
	import java.util.Scanner;
	
	public class TasKagitMakasOyunu {
	
		public static void main(String[] args) {
		    Scanner scan=new Scanner(System.in);
			System.out.println("taş-kağıt-makas oyunun hoşgeldiniz lütfen taş kağıt yada makas arasından birisinin seçiniz");
			String secim=scan.nextLine();
			String [] oyun= {"taş","kağıt","makas"};
			Random rand=new Random();
			int select=rand.nextInt(oyun.length);
		     String pcSecim =oyun[select];
				
		     if(secim.equals(pcSecim)) {
		    	System.out.println("tebrikler doğru tahmin ettiniz");
		     }
		     else {
		    	 System.out.println("malesef bilemediniz cevap şuydu" +" "+ pcSecim);
		     }
		     
			}
				
		}
	
	

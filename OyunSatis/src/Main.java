import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random=new Random();
		System.out.println("Oyun satışı yapan mağazamıza hoşgeldiniz");
		double balance=random.nextDouble(500);
		System.out.println("Başlangıçta Bakiyeniz rastgele olarak belirlenmiştir bakiyeniz:  "+balance);
		System.out.println("Bu mağazada aşağıdaki oyunlar bulunmaktadır bakiyeniz yettiği müddetçe istediğinizi alabilirsiniz ");
        
	}

}

package poly;

public class Main {

	public static void main(String[] args) {
		int a=0;
		try {
			a=2/0;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		System.out.println(a);
	}

}

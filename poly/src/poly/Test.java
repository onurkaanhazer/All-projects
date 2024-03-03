package poly;

public class Test implements Runnable{
    String name;
    
	public Test(String name) {
		this.name = name;
		System.out.println(name+"işlem oluştu");
	}
    
	

	public void run() {
		
	
		try {
			for(int i=5;i>0;i--) {
				System.out.println(this.name+" " +i);
			Thread.sleep(1000);
	
		}
		} catch (InterruptedException e) {
				
			System.out.println(this.name+"hata ile karşılaşıldı");
			}
		System.out.println(name+"işlem bitti");
		}
		
	

}

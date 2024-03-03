import java.util.LinkedHashSet;

public class BankaUygulamasıMain {

	public static void main(String[] args) {
	   
		try {
			int [] arr=new int [3];
		arr[4]=10;
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		
		int a=0;
		
		
		try {
			int b=0/a;
			
		}catch(Exception e) {
			System.out.println(e.toString());
			
		}
		
		
	/*	public Student find(String id) {
			if(id.equals("123")) {
				return new Student;
			}
			else {
				throw new Exception();
			}
		}
		*/
		
		LinkedHashSet gunler =new LinkedHashSet();
		gunler.add("pazartesi");
		gunler.add("salı");
		
		gunler.forEach(item->System.out.println(item+" "));

	}

}

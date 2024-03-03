import java.util.Scanner;

public class ÖgrenciDataBase {
    
	private String firstname;
	private String lastname;
	private String gradeYear;
	private int StudenID;
	private String courses;
	private int tuitionBalance;
	private static int costofCourse=600;
	private static int id=1001;
	
	
	Scanner scan=new Scanner(System.in);
	
	public ÖgrenciDataBase(String firstname,String lastname,String gradeYear) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.gradeYear=gradeYear;
		
		System.out.println("adınız = " + this.firstname + " /soyadınız ="+this.lastname+ " /sınıfnız = "+ this.gradeYear);
		
		setStudenID();
		
	}
	
	
	private int setStudenID() {
		int yıl=Integer.parseInt(gradeYear);
		this.StudenID=yıl+id;
		return this.StudenID;
		
	}
	
     public void enroll() {
    	 System.out.println("kayıt olmak için kurs giriniz (çıkmak için 0 a basınız)");
    	 String course=scan.nextLine();
    	 if(course!="0") {
    		 
    	 }
     }
	
	
	
}

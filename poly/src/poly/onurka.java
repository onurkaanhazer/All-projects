package poly;

public class onurka {
  private int a=10;
  public class Inner{
	  int a=1;
	  public void run() {
		  System.out.println(a);
		  System.out.println(this.a);
		  System.out.println(onurka.this.a);
	  }
  }
}

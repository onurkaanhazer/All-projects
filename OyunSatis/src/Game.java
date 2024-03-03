
public class Game {
   private String title;
   private double price;
   private 	String platform;
	
	
	Game(String title,double price,String platform){
		this.title=title;
		this.price=price;
		this.platform=platform;
	}
	
	
	public void settitle(String title) {
		this.title=title;
	}
	public String gettitle() {
		return title;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getPlatform() {
		return platform;
	}


	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	
	
}


public class Customer {
	private String name;
	private String surName;
	private double balance;
	
	
	Customer(String name,String surName,double balance){
		this.name=name;
		this.surName=surName;
		this.balance=balance;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
	
}

package Banking;

public class Account {
	
	private double balance;
	
	public Account() {
		
		balance=0.0;
	}
	
	public void deposit(double amount) {
		
		balance = balance + amount;
		
	}
	
	public double getBalance() {
		
		return balance;
	}
	
			

}

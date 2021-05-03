package Banking;

public class bankingMain {

	public static void main(String[] args) {
		
		Account customer1 = new Account();
		customer1.deposit(1000);
		
		Account customer2 = new Account();
		customer2.deposit(5000.50);
		
		System.out.print("The account for Customer1 has a balance of ");
		System.out.println(customer1.getBalance());
		
		System.out.print("The account for Customer2 has a balance of ");
		System.out.println(customer2.getBalance());

	}

}

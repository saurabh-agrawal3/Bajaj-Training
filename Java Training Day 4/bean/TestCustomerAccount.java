package bean;

public class TestCustomerAccount {
	
	public static void main(String [] args) {
		
		Customer c1 = new Customer();
		
		c1.setcId(101);
		c1.setName("Atharva");
	
		
		Account account = c1.getAccount();
		
		
		account.setAnumber(2301);
		
		account.setBalance(1000);
		
		
		System.out.println(c1.getcId() + " " + c1.getName() + " " + account.getAnumber() + " " + account.getBalance());
		
		
		
		
		
	}

}

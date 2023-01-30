package bean;

public class Customer {
	
	private int cId;
	private String name;
	private Account account;
	
	// composition relation ship
	
	public  Customer () {
	   account = new Account();
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}

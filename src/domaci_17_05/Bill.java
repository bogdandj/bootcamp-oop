package domaci_17_05;

public class Bill {
	private String account;
	private String fullName;
	private double balance;
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public double getBalance() {
		return balance;
	}

	public double changeBalance(double change) {
		this.balance = this.balance + change;
		if(this.balance < 0) {
			this.balance = 0;
		}
		return this.balance;
	}
	
	
	
	public Bill(String account, String fullName, double balance) {
		
		this.account = account;
		this.fullName = fullName;
		this.balance = balance;
	}
	public void print() {
		System.out.println(this.fullName + " " + this.account);
		System.out.println(this.balance);
	}

}

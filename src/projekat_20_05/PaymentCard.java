package projekat_20_05;

public abstract class PaymentCard {

	protected double balance;
	protected String number;
	protected String expYear;
	protected String expMonth;


	public double getBalance() {
		return balance;
	}

	public String getNumber() {
		return number;
	}

	public String getExpYear() {
		return expYear;
	}

	public String getExpMonth() {
		return expMonth;
	}

	public PaymentCard(double balance, String number, String expYear, String expMonth) {
		super();
		this.balance = balance;
		this.number = number;
		this.expYear = expYear;
		this.expMonth = expMonth;
	}
	
	public void addPayment(double payment) {
		this.balance = this.balance + payment;
	}
	
	public abstract void executeTransaction(double payment);
	
	public abstract void print();


}

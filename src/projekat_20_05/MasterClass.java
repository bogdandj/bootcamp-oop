package projekat_20_05;

public class MasterClass extends PaymentCard {

	public MasterClass(double balance, String number, String expYear, String expMonth) {
		super(balance, number, expYear, expMonth);
	}

	@Override
	public void executeTransaction(double payment) {
		double comission = 0;
		comission = payment + (payment * 1.5) / 100;
		this.balance = this.balance - comission;

	}

	public void chargeMaintenance() {
		this.balance = this.balance - 2;
	}

	@Override
	public void print() {
		System.out.println(
				"Master Class: " + this.number + ", " + this.expMonth + "/" + this.expYear + "," + this.balance);
	}

}

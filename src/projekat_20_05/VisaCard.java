package projekat_20_05;

public class VisaCard extends PaymentCard {

	private String owner;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public VisaCard(double balance, String number, String expYear, String expMonth, String owner) {
		super(balance, number, expYear, expMonth);
		this.owner = owner;
	}

	@Override
	public void executeTransaction(double payment) {
		if (this.balance > payment) {

			double comission = 0;
			comission = payment + (payment * 1.8) / 100;
			if (comission > 4) {
				this.balance = this.balance - 4;
			}
			else {
				this.balance = this.balance - comission;
			}
		} 

	}

	@Override
	public void print() {
		System.out.println("VisaCard: " + this.number + ", " + this.expMonth + "/" + this.expYear + "," + this.balance);
	}

}

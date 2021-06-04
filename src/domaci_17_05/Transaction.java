package domaci_17_05;

public class Transaction {

	private String id;
	private Bill send;
	private Bill recieve;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Bill getSend() {
		return send;
	}

	public void setSend(Bill send) {
		this.send = send;
	}

	public Bill getRecieve() {
		return recieve;
	}

	public void setRecieve(Bill recieve) {
		this.recieve = recieve;
	}

	public Transaction(String id, Bill send, Bill recieve) {

		this.id = id;
		this.send = send;
		this.recieve = recieve;
	}

	private double commission(double payment) {
		if (payment <= 4500) {
			return 45;
		} else {
			return payment / 100;
		}
	}

	public boolean executeTransaction(double pay) {
		double balance = 0;
		balance = pay + commission(pay);
		if (this.send.getBalance() - pay > 0) {
			send.changeBalance(-balance);
			recieve.changeBalance(pay);
			return true;
		}
		return false;

	}

	public void print() {
		System.out.println("Racun sa: " + this.send.getFullName() + " - " + this.send.getAccount() + " " + this.send.getBalance());
		System.out.println("Racun na: " + 
				this.recieve.getFullName() + " - " + this.recieve.getAccount() + " " + this.recieve.getBalance());
	}

}

package projekat_20_05;

public class Student extends Person {
	
	private String indexNumber;
	private double debt;
	
	
	
	
	public String getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;
	}

	public double getDebt() {
		return debt;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}

	public Student(String name, String jmbg, String indexNumber, double debt) {
		super(name, jmbg);
		this.indexNumber = indexNumber;
		this.debt = debt;
	}
	
	public void payTuition(double payment) {
		this.debt = this.debt - payment;
	}
	
	@Override
	public void print() {
		System.out.println(this.name + ", " + this.jmbg);
		System.out.println(this.indexNumber + ", " + this.debt);
	}
	
	

}

package projekat_24_05;

public abstract class Athlete {
	
	private String fullName;
	protected double result;
	
	public abstract boolean compareResults(Athlete ath1);
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void print() {
		System.out.println(this.fullName + " " + this.result);
	}

	public Athlete(String fullName, double result) {
		super();
		this.fullName = fullName;
		this.result = result;
	}

	
}

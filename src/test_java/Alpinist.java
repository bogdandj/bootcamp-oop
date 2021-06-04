package test_java;

public class Alpinist extends Mountaineer {

	protected int numberOfPoints;

	public int getNumberOfPoints() {
		return numberOfPoints;
	}

	public void setNumberOfPoints(int numberOfPoints) {
		this.numberOfPoints = numberOfPoints;
	}

	public Alpinist(String id, String fullName, int numberOfPoints) {
		super(id, fullName);
		this.numberOfPoints = numberOfPoints;
	}

	@Override
	public double monthlyPrice() {
		double sum = 0;
		sum = 1500 - this.numberOfPoints * 50;
		if (sum < 0) {
			sum = 0;
		}
		return sum;
	}

	@Override
	public boolean successfulAscent(Mountain mountain) {
		if (mountain.getHeight() <= 4000) {
			return true;
		}
		return false;
	}

	@Override
	public void print() {
		System.out.println("Alpinista, ID: " + this.id);
		System.out.println("Ime i prezime: " + this.fullName);
		System.out.println("Broj poena: " + this.numberOfPoints);

	}

}

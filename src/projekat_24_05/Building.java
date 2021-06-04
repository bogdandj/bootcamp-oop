package projekat_24_05;

public class Building extends Objekat {

	protected int numberOfApartments;

	public Building(String address, double surfaceArea, String zone, int numberOfAparments) {
		super(address, surfaceArea, zone);
		this.numberOfApartments = numberOfApartments;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tax() {
		return this.coefficient() * this.surfaceArea * this.numberOfApartments;
	}

	@Override
	public void print() {
		System.out.println(this.address + " " + this.surfaceArea + " " + this.zone + " " + this.numberOfApartments);

	}

}

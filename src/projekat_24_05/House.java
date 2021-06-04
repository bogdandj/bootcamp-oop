package projekat_24_05;

public class House extends Objekat {
	
	protected int people;
	

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public House(String address, double surfaceArea, String zone, int people) {
		super(address, surfaceArea, zone);
		this.people = people;
	}

	@Override
	public double tax() {
		return this.coefficient() * this.surfaceArea;
	}

	@Override
	public void print() {
		System.out.println(this.address + " " + this.surfaceArea + " " + this.zone + " " + this.people);
		
	}
	
	
	
	

}

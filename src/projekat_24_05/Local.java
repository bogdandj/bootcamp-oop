package projekat_24_05;

public class Local extends Objekat {

	public Local(String address, double surfaceArea, String zone) {
		super(address, surfaceArea, zone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tax() {
		return this.coefficient() * this.surfaceArea * 1.3;
	}

	@Override
	public void print() {
		System.out.println(this.address + " " + this.surfaceArea + " " + this.zone);
		
	}
	
	
	
	

}

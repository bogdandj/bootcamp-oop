package test_java;

public class RecreationalMountaineer extends Mountaineer {

	protected int equipmentWeight;
	protected String county;
	protected int maxAscentWithoutEquipment;


	public RecreationalMountaineer(String id, String fullName, int equipmentWeight, String county,
			int maxAscentWithoutEquipment) {
		super(id, fullName);
		this.equipmentWeight = equipmentWeight;
		this.county = county;
		this.maxAscentWithoutEquipment = maxAscentWithoutEquipment;
	}



	@Override
	public double monthlyPrice() {
		return 1000;
	}

	@Override
	public boolean successfulAscent(Mountain mountain) {
		int maxAscent = this.maxAscentWithoutEquipment - this.equipmentWeight * 50;
		if (maxAscent >= mountain.getHeight()) {
			return true;
		}
		return false;
	}

	@Override
	public void print() {
		System.out.println("Rekreativac, ID: " + this.id);
		System.out.println("Ime i prezime: " + this.fullName);
		System.out.println("Okrug: " + this.county);

	}

}

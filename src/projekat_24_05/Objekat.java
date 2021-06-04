package projekat_24_05;

public abstract class Objekat {
	
	protected String address;
	protected double surfaceArea;
	protected String zone;
	
	public Objekat(String address, double surfaceArea, String zone) {
		super();
		this.address = address;
		this.surfaceArea = surfaceArea;
		this.zone = zone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSurfaceArea() {
		return surfaceArea;
	}
	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	public double coefficient() {
		if(this.zone.equals("1")) {
			return 1.4;
		} else if (this.zone.equals("2")) {
			return 1.1;
		} else if (this.zone.equals("3")) {
			return 1.05;
		}
		return 0;
	}
	
	public abstract double tax();
	
	public abstract void print();

}

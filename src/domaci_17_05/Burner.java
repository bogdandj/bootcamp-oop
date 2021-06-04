package domaci_17_05;

public class Burner {

	private String type;
	private int intesity;
	private double heaterPower;

	public Burner(String type, double heaterPower) {

		this.type = type;
		this.intesity = 0;
		this.heaterPower = heaterPower;
	}

	public int getIntesity() {
		return intesity;
	}

	private int maxIntensity() {
		if (this.type.equals("regular")) {
			return 3;
		} else if (this.type.equals("express")) {
			return 12;
		}
		return 0;
	}
	
	public void heatUp() {
		this.intesity = this.intesity + 1;
		if (this.type.equals("regular") && this.intesity + 1 > 3) {
			this.intesity = 3;
		} else if (this.type.equals("express") && this.intesity + 1 > 12) {
			this.intesity = 12;
		}
	}
	
	public void heatTurnOff() {
		this.intesity = 0;
	}
	
	public boolean onOrOff() {
		if(this.intesity > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double consumption(double hours) {
		return 100 / this.maxIntensity() * this.intesity * this.heaterPower * hours;
	}
	
	public void print() {
		System.out.println("Ringla je ukljucena" + this.onOrOff());
		System.out.println("Tip ringle: " + this.type);
		System.out.println("Jacina: " + this.intesity);
		System.out.println("Jacina grejaca " + this.heaterPower);
	}

}

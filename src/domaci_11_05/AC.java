package domaci_11_05;

public class AC {
	
	protected String brand;
	protected int heatUsage;
	protected int coolUsage;
	protected int temp;
	protected String mode;
	
	
	
	public AC(String brand, int heatUsage, int coolUsage, int temp, String mode) {
		super();
		this.brand = brand;
		this.heatUsage = heatUsage;
		this.coolUsage = coolUsage;
		this.temp = temp;
		this.mode = mode;
	}



	public void print() {
		System.out.println(this.brand + " " + this.mode + " " + this.temp);
	}
	
	public double usage() {
		if (this.mode == "cooling") {
			return 30 * 15 * this.coolUsage;
		} else {
			return 30 * 15 * this.heatUsage;
		}
	}
	
	public double bill() {
		double bill = 0;
		if(usage() <= 350) {
			return usage() * 6;
		} else {
			return (350 * 6) + ((usage() - 350) * 9);
		}
	}

}

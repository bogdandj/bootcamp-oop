package domaci_17_05;

public class ElectricStove {

	private String brand;
	private int warranty;
	private int maxBurners;
	private Burner upLeft;
	private Burner upRight;
	private Burner downLeft;
	private Burner downRight;

	public ElectricStove(String brand, int warranty, int maxBurners, Burner upLeft, Burner upRight, Burner downLeft,
			Burner downRight) {

		this.brand = brand;
		this.warranty = warranty;
		this.maxBurners = maxBurners;
		this.upLeft = upLeft;
		this.upRight = upRight;
		this.downLeft = downLeft;
		this.downRight = downRight;
	}

	public String getBrand() {
		return brand;
	}

	public int getWarranty() {
		return warranty;
	}

	public int getMaxBurners() {
		return maxBurners;
	}

	public Burner getUpLeft() {
		return upLeft;
	}

	public Burner getUpRight() {
		return upRight;
	}

	public Burner getDownLeft() {
		return downLeft;
	}

	public Burner getDownRight() {
		return downRight;
	}
	

	public void intensify(int burner) {
		int count = 0;
		switch (burner) {
		case 1:
			this.upLeft.heatUp();
			break;
		case 2:
			this.upRight.heatUp();
			break;
		case 3:
			this.downLeft.heatUp();
			break;
		case 4:
			this.downRight.heatUp();
			break;
		}
		
		if (this.upLeft.onOrOff()) {
			count++;
		}
		if (this.downLeft.onOrOff()) {
			count++;
		}
		if (this.upRight.onOrOff()) {
			count++;
		}
		if (this.downRight.onOrOff()) {
			count++;
		}
		
		if(count > this.maxBurners && burner == 1) {
			this.upRight.heatTurnOff();
			this.downLeft.heatTurnOff();
			this.downRight.heatTurnOff();
		} else if (count > this.maxBurners && burner == 2) {
			this.upLeft.heatTurnOff();
			this.downLeft.heatTurnOff();
			this.downRight.heatTurnOff();
		} else if (count > this.maxBurners && burner == 3) {
			this.upLeft.heatTurnOff();
			this.upRight.heatTurnOff();
			this.downRight.heatTurnOff();
		} else if (count > this.maxBurners && burner == 4) {
			this.upLeft.heatTurnOff();
			this.upRight.heatTurnOff();
			this.downLeft.heatTurnOff();
		} 
			
			
			
	
	}
	
	public void turnOff(int burner) {
		switch (burner) {
	case 1:
		this.upLeft.heatTurnOff();
		break;
	case 2:
		this.upRight.heatTurnOff();
		break;
	case 3:
		this.downLeft.heatTurnOff();
		break;
	case 4:
		this.downRight.heatTurnOff();
		break;
		
	}
		
	}
	
	public double totalConsumption(int time) {
		double cons = 0;
		cons = cons + this.upLeft.consumption(time);
		cons = cons + this.upRight.consumption(time);
		cons = cons + this.downLeft.consumption(time);
		cons = cons + this.downRight.consumption(time);
		return cons;
	}

}

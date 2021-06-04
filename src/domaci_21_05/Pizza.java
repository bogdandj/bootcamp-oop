package domaci_21_05;

public class Pizza extends Product{
	
	protected double doughPrice;
	
	

	public Pizza(double doughPrice) {
		super();
		this.doughPrice = doughPrice;
	}

	@Override
	public double calculatePrice() {
		return totalPrice() + this.doughPrice;
	}

	@Override
	public void print() {
	System.out.println(calculatePrice());
		
	}
	

}

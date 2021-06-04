package domaci_21_05;

public class IcePoint extends Product {
	
	protected String type;
	protected boolean big;

	@Override
	public double calculatePrice() {
		if (big) {
			return totalPrice() + 130;
		} else {
			return totalPrice() + 100;
		}
	}

	@Override
	public void print() {
		System.out.println(this.type + " " + this.big + " " + calculatePrice());
		
	}

	public IcePoint(String type, boolean big) {
		super();
		this.type = type;
		this.big = big;
	}
	
	

}

package domaci_21_05;

public class Topping {

	protected String name;
	protected double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Topping(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

}

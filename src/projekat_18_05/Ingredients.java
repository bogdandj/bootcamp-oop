package projekat_18_05;

public class Ingredients {
	
	private String name;
	private double price;
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}

	public Ingredients(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void print() {
		System.out.println(this.name + " " + this.price);
	}
}

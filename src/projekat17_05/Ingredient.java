package projekat17_05;

public class Ingredient {
	private String name;
	private double price;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public Ingredient(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Ingredient(String name) {
		this.name = name;
	}
	public Ingredient(){
		
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	

}

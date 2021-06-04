package domaci_21_05;

import java.util.ArrayList;

public abstract class Product {

	protected ArrayList<Topping> toppings = new ArrayList<Topping>();

	public void addTopping(Topping topping) {
		toppings.add(topping);
	}

	public double totalPrice() {
		double sum = 0;
		for (int i = 0; i < toppings.size(); i++) {
			sum = sum + toppings.get(i).getPrice();

		}
		return sum;
	}

	public abstract double calculatePrice();
	
	public abstract void print();

}

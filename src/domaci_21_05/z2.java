package domaci_21_05;

import java.util.ArrayList;

public class z2 {

	public static void main(String[] args) {
		
		Topping top1 = new Topping("cheese", 50);
		Topping top2 = new Topping("chocolate", 70);

		ArrayList<Topping> toppings = new ArrayList<Topping>();
		
		IcePoint ice1 = new IcePoint("chocolate", true);
		IcePoint ice2 = new IcePoint("vanila", false);
		IcePoint ice3 = new IcePoint("chocolate", false);
		
		Pizza pizza1 = new Pizza(120);
		Pizza pizza2 = new Pizza(200);
		

		ice1.addTopping(top2);
		
	}

}

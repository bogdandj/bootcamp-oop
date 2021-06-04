package projekat_18_05;

import projekat_18_05.Ingredients;

public class zad1 {

	public static void main(String[] args) {
		Ingredients ing1 = new Ingredients ("Water", 1.2);
		Ingredients ing2 = new Ingredients ("Flour", 0.7);
		Ingredients ing3 = new Ingredients ("Sugar", 0.9);
		
		ing1.print();
		
		Pasta pasta = new Pasta();
		pasta.add(ing1);
		pasta.add(ing2);
		pasta.add(ing3);
		
		pasta.pastaPrice();
		pasta.print();


		

	}

}

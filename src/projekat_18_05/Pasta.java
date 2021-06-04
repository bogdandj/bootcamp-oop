package projekat_18_05;

import java.util.ArrayList;

import projekat17_05.Ingredient;

public class Pasta {

	private ArrayList<Ingredients> ingredients = new ArrayList<Ingredients>();

	public void add(Ingredients ingredients) {
		this.ingredients.add(ingredients);
	}

	public void removeIngredient(String name) {
		for (int i = 0; i < ingredients.size(); i++)
			if (ingredients.get(i).getName().equals(name))
				ingredients.remove(i);
	}

	public ArrayList<Ingredients> getIngredients() {
		return ingredients;
	}

	public Pasta() {
	}

	public double pastaPrice() {
		double sum = 0;
		for (int i = 0; i < ingredients.size(); i++) {
			ingredients.get(i).getPrice();
			sum = sum + ingredients.get(i).getPrice();
		}
		return sum;
	}

	public void print() {
		for (int i = 0; i < ingredients.size(); i++) {
			System.out.println(ingredients.get(i).getName() + " - " + ingredients.get(i).getPrice());
		}
		System.out.println("Cena paste je " + pastaPrice());
	}
}

package projekat17_05;

import java.util.ArrayList;
import java.util.Scanner;

public class zad3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = s.nextInt();

		ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

		for (int i = 0; i < n; i++) {

			Ingredient ing = new Ingredient();
			System.out.println("Enter an ingredient");
			ing.setName(s.next());
			System.out.println("Enter a price");
			ing.setPrice(s.nextInt());
			ingredients.add(ing);

		}

		for (int i = 0; i < ingredients.size(); i++) {
			System.out.println(ingredients.get(i).getName() + ": " + ingredients.get(i).getPrice());

		}

	}

}

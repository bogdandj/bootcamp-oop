package projekat29_04;

import java.util.Scanner;

public class zad5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] brojevi = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Unesite vrednost od 0 do 9");
		int k = s.nextInt();

		System.out.println("Unesite vrednost");
		int nova = s.nextInt();

		brojevi[k] = nova;

		System.out.println(brojevi[k]);

	}

}

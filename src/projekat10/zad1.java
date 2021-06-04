package projekat10;

import java.util.ArrayList;
import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Unesite N brojeva");
		int n = s.nextInt();

		ArrayList<Integer> brojevi = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			System.out.println("Unesite broj");
			int x = s.nextInt();
			brojevi.add(x);
		}

		System.out.println(brojevi);

	}

}

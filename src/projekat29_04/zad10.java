package projekat29_04;

import java.util.Scanner;

public class zad10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Unesite broj");
		int n = s.nextInt();

		int[] brojevi = new int[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Unesite broj");
			int a = s.nextInt();
			brojevi[i] = a;
		}

		for (int i = 0; i < n; i++) {
			System.out.println(brojevi[i]);

		}

	}

}
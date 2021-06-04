package projekat29_04;

import java.util.Scanner;

public class zad11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Unesite broj");
		int n = s.nextInt();
		int suma = 0;


		for (int i = 0; i < n; i++) {

			System.out.println("Unesite broj");
			int a = s.nextInt();
			suma += a;
		}



		System.out.println(suma);

	}

}

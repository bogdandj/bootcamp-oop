/*Napisati program koji ucitava N brojeva od korisnika i 
sabira samo trocifrene brojeve.
Unesite N: 5
Unesite broj: 1
Unesite broj: 32
Unesite broj: 121
Unesite broj: 1333
Unesite broj: 144
Suma je: 265
*/



package domaci_28_04;

import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int suma = 0;

		System.out.println("Unesite niz");
		int n = s.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Unesite broj");
			int a = s.nextInt();

			if (a > 99 && a < 1000) {
				suma = suma + a;
			}

		}
		System.out.println(suma);

	}

}

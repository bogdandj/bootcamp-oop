/*2.Zadatak
Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A
stampa sve elemente niza koji su veci od nule.
Primer izvrsenja:
Unesite N: 5
Unesite broj: 1
Unesite broj: -4
Unesite broj: 3
Unesite broj: -7
Unesite broj: 9

Brojevi veci od nule u nizu A su: 1, 3, 9,*/


package domaci_29;

import java.util.Scanner;

public class zad2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Unesite niz");
		int n = s.nextInt();
		int k = 0;

		int[] niz = new int[n];
		int[] niz2 = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Unesite broj");
			int b = s.nextInt();
			niz[i] = b;
		}

		for (int i = 0; i < n; i++) {
			if (niz[i] > 0) {
				niz2[k++] = niz[i];
			}

		}
		System.out.println("Brojevi iz niza koji su pozitivni su ");
		for (int i = 0; i < k; i++) {
			System.out.print(niz2[i] + ", ");

		}

	}
}

/*3. Napisati program koji ucitava niz A duzine N i broj X. 
Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
	Primer izvrsenja:
	Unesite N: 5
Unesite broj: 1
Unesite broj: 3
Unesite broj: 7
Unesite broj: 3
Unesite broj: 9
Unesite X: 3

Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 
1, 3
*/

package domaci_29;

import java.util.Scanner;

public class zad3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int k = 0;
		int b = 0;
		System.out.println("Unesite niz");
		int n = s.nextInt();

		int[] niz = new int[n];
		int[] niz2 = new int[n];

		System.out.println("Unesite X");
		int x = s.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("unesite broj");
			b = s.nextInt();
			niz[i] = b;
		}

		for (int i = 0; i < n; i++) {
			if (niz[i] == x) {
				niz2[k++] = i;
			}
		}
		System.out.println("Brojevi koji imaju istu vrednost kao X su na pozicijama ");
		for (int i = 0; i < k; i++) {
			System.out.print(niz2[i] + ", ");

		}
	}
}

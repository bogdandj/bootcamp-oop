/*5. (Za vezbanje) Napisati program koji ucitava niz
 *  stringova duzine N,*  tako da ucitavanje elemenata u
 *   niz a bude obrnuto. 
		Primer:
		Unesite N: 4
		Unesite string: xxx1
		Unesite string: xxx4
		Unesite string: xxx6
		Unesite string: xxx9

		Niz a: xxx9, xxx6, xxx4, xxx1
		Komentar: Stanje niza a u memoriji je:
			a[0]="xxx9",
			a[1]="xxx6",
			a[2]="xxx4",
			a[3]="xxx1",*/

package domaci_29;

import java.util.Scanner;

public class zad5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String a;
		System.out.println("Unesite niz");
		int n = s.nextInt();
		String[] niz = new String[n];

		for (int i = niz.length - 1; i >= 0; i--) {
			System.out.println("Unesite string");
			a = s.next();
			niz[i] = a;
		}

		for (int i = 0; i < n; i++) {
			System.out.println(niz[i]);
		}

	}

}

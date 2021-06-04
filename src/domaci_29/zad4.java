/*4. (Za vezbanje) Napisati program koji ucitava niz a duzine N. 
Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza
a kopiraju u niz b,
a ostale elemente niza b ispuniti jedinicama.
(niz b je iste duzine kao i niz a)

Unesite N: 6
Unesite broj: 1
Unesite broj: 5
Unesite broj: 2
Unesite broj: 7
Unesite broj: 8
Unesite broj: -1

Niz a: 1, 5, 2, 7, 8, -1
Niz b: 1, 5, 2, 1, 1, 1*/

package domaci_29;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class zad4 {

	public static void main(String[] args) {
		
		int b = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite niz");
		int n = s.nextInt();
		
		int[] niz = new int[n];
		int[] niz2 = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite broj");
			b = s.nextInt();
			niz[i] = b;
		}
		
		
		for (int i = 0; i < 3; i++) {
			niz2[i] = niz[i];
		}
		for (int i = 3; i < n; i++) {
			niz2[i] = 1;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(niz2[i]);
		}
			
		

	}

}

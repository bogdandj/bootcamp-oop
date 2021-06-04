/*1.Zadatak
Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim,
iz niza, broji koliko je parnih brojeva uneto. N i brojeve unosi korisnik.
Unesite N: 5
Unesite broj: 1
Unesite broj: 3
Unesite broj: 4
Unesite broj: 7
Unesite broj: 8
U nizu ima 2 parna broja.*/



package domaci_29;

import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int par = 0;
		System.out.println("Unesite niz");
		int n = s.nextInt();
		
		int[] niz = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			System.out.println("Unesite broj");
			int b = s.nextInt();
			niz[i] = b;
		}
		
		for (int i = 0; i < n; i++) {
			if(niz[i] % 2 == 0) {
				par++;
			}
		}
		System.out.println(par);
	}

}

/*Napisati program koji ucitava N brojeva od korisnika i 
prikazuje koliko je K brojeva uneto.N i K unosi korisnik
Unesite N: 4
Unesite K: 1
Unesite broj: 1
Unesite broj: 2
Unesite broj: 4
Unesite broj: 1
	Uneto je 2 broja koja imaju vrednost 1. (jer su unete dve jedinice)*/



package domaci_28_04;

import java.util.Scanner;

public class zad2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite duzinu niza");
		int n = s.nextInt();
		
		System.out.println("Unesite K");
		int k = s.nextInt();
		
		int match = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite broj");
			int br = s.nextInt();
			
			if(br == k) {
				match++;
			}
		}
		System.out.println(match);

	}

}

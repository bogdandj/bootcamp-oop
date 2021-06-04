/*Napisati program koji od korisnika ucitava N jednocifrenih brojeva
i od njih formira rezultujuci broj kao na primeru*/

package domaci_27_4;

import java.util.Scanner;

public class zad5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite N");
		int n = s.nextInt();
		int suma = 0;
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Unesite broj");
			int broj = s.nextInt();
			suma = suma*10 + broj;
			
			
		}
		
		System.out.println(suma);
		
		
	}

}

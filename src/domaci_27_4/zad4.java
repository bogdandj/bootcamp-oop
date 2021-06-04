/*Napisati program koji od korisnika ucitava N brojeva i na kraju ispisuje srednju vrednost svih brojeva.
*/
package domaci_27_4;

import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite N");
		int n = s.nextInt();
		int suma = 0;
		int srednja = 0;
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Unesite broj");
			int broj = s.nextInt();
			suma = suma + broj;
			
		}
		srednja = suma / n;
		System.out.println("Srednja vrednost je " + srednja);

	}

}

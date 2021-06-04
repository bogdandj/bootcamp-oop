/*Napisati program koji ucitava brojeva od korisnika 
i za svaki broj prikazuje apsolutnu vrednost sve dok se ne unese nula.
Primer izvrsenja:
Unesite broj: 3
Apsolutna vrednost je 3
Unesite broj: -1
Apsolutna vrednost je 1
Unesite broj: 0
Kraj programa jer je uneta nula.*/


package domaci_28_04;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class zad3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite niz");
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite broj");
			int a = s.nextInt();
			
			if(a != 0) {
			a = a * (-1);
			System.out.println("Apsolutna vrednost je " + a);
		}
			else {
				System.out.println("Kraj programa jer je uneta nula");
			}
		

	}

}
}

/*(Za vezbanje) Napisati program koji ucitava jednocifrene brojeve
dok se ne unese 0 i formira novi broj X tako sto lepe u novi broj
kao na primeru. X je int. 
Smatrati da korisnik unosi samo jednocifrene brojeve.*/

package domaci_28_04;

import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int x = 0;
		int a = 1;

		while (a != 0) {
			System.out.println("Unesite broj");
			a = s.nextInt();
			x = x * 10 + a;

		}

		System.out.println(x);

	}

}

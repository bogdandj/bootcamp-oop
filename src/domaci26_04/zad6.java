/*6. (Za vezbanje)Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.

*/
package domaci26_04;

import java.util.Scanner;

public class zad6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite vrednost X1");
		int x1 = s.nextInt();
		
		System.out.println("Unesite vrednost Y1");
		int y1 = s.nextInt();
		
		System.out.println("Unesite vrednost X2");
		int x2 = s.nextInt();
		
		System.out.println("Unesite vrednost Y2");
		int y2 = s.nextInt();
		
		System.out.println("Unesite vrednost X3");
		int x3 = s.nextInt();
		
		System.out.println("Unesite vrednost Y3");
		int y3 = s.nextInt();
		
		
		if ((x3 >= x1) && (x3 <= x2) && (y3 >= y1) && (y3 <= y2)) {
			System.out.println("Korisnik je kliknuo u okviru login forme");
		}
		else {
			System.out.println("Korisnik nije kliknuo u okviru login forme");
		}
	}
	

}

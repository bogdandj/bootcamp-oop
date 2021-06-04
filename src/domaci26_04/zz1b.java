/*(Za vezbanje):Napisati program koji nalazi najmanji od 3 ili 4 uneta broja.
Primer izvrsenja:
Unesite broj a: 22
Unesite broj b: 42
Unesite broj c: 21
Unesite broj d: -2
Najmanji broj je: -2
*/



package domaci26_04;

import java.util.Scanner;

public class zz1b {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesti A");
		int a = s.nextInt();
		
		System.out.println("Unesi B");
		int b = s.nextInt();
		
		System.out.println("Unesi C");
		int c = s.nextInt();
		
		if (a < b && a < c) {
			System.out.println("Najmanji broj je " + a);
		}
		else if (b < a && b < c) {
			System.out.println("Najmanji broj je " + b);
		}
		else if (c < a && c < b) {
			System.out.println("Najmanji broj je " + c);
		}
		else {
			System.out.println("Dve vrednosti imaju isti broj");
		}

	}

}

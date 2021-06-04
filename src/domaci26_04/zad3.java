/*3.  Napisati program koji za unetu vrednost x odredjuje i prikazuje vrednost funkcije y. Funkcija y je definisana kao:
    			       (x,       x < 2
y =  (2,      2 <= x < 10
    			       (x - 1, x >= 10
*/
package domaci26_04;

import java.util.Scanner;

public class zad3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Uneti X");
		int x = s.nextInt();

		int y;

		if (x < 2) {
			y = x;
			System.out.println("Y = " + y);
		} else if (x >= 2 && x < 10) {
			y = 2;
			System.out.println("Y = " + y);
		} else if (x >= 10) {
			y = x-1;
			System.out.println("Y = " + y);
		}
		
		
	}
}
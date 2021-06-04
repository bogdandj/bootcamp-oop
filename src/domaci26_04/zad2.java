/*2. Napisati program koji za ucitava brojeve a i b (b ima vrednosti 1, 2 ili 3) Ukoliko se za b unese:
b=1, vrednost promenljive a se uvecava za 10
b=2, vrednost promenljive a se smanjuje za 20
b=3, vrednost promenljive a se duplira

*/

package domaci26_04;

import java.util.Scanner;

public class zad2 {

	public static void main(String[] args) {

			Scanner s = new Scanner(System.in);

			System.out.println("Unesti A");
			int a = s.nextInt();

			System.out.println("Unesi B");
			int b = s.nextInt();

			if (b == 1) {
				a = a + 10;
			} else if (b == 2) {
				a = a - 20;
			} else if (b == 3) {
				a = a * 2;
			}
			
			System.out.println("A = " + a);
		}
	}

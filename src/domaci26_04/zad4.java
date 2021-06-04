/*4.     (za vezbanje) Napisati program koji za uneti broj a
 *  pronalazi i  ispisuje apsolutnu vrednost. */

package domaci26_04;

import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesti A");
		int a = s.nextInt();
		
		if (a < 0) {
		    a = a * (-1);
		} else {
		}
		System.out.println("Apsolutna vrednost je " + a);


	}

}
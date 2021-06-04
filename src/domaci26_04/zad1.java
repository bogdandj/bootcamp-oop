/*1.Napisati program koji pronalazi manji broj za dva uneta broja (uneta sa tastature). Najmanji broj sacuvati u posebnu promenljivu i na kraju ispisati njenu vrednost.. 
Primer izvrsenja:
Unesite broj a: 22
Unesite broj b: 42
Manji broj je 22
*/


package domaci26_04;

import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesti A");
		int a = s.nextInt();
		
		System.out.println("Unesi B");
		int b = s.nextInt();
		
		int c;
		
		if (a > b) {
			c = b;
			System.out.println("C = " + c);
			
		}
		else if (a < b) {
			c = a;
			System.out.println("C = " + c);
		}
		else {
			System.out.println("Brojevi su jednaki");
		}
		


	}

}
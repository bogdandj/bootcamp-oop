/*5. (za vezbanje) Napisati program koji ucitava 4 broja (a,b,c,d)
i formira string p (p ima startni deo #) tako sto negativne brojeve lepi
sa leve strane a pozitivne i nulu sa desne.*/

package domaci26_04;

import java.util.Scanner;

public class zad5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String p = "#";
		
		System.out.println("Unesi vrednost A");
		int a = s.nextInt();
		
		System.out.println("Unesi vrednost B");
		int b = s.nextInt();
		
		System.out.println("Unesi vrednost C");
		int c = s.nextInt();
		
		System.out.println("Unesi vrednost D");
		int d = s.nextInt();
		
		if (a >= 0) {
			p = p + " " + a;
		}
		else if (a < 0) {
			p = a + " " + p;
		}
		
		if (b >= 0) {
			p = p + " " + b;
		}
		else if (b < 0) {
			p = b + " " + p;
		}
		
		if (c >= 0) {
			p = p + " " + c;
		}
		else if (c < 0) {
			p = c + " " + p;
		}
		
		if (d >= 0) {
			p = p + " " + d;
		}
		else if (d < 0) {
			p = d + " " + p;
		}
		
		System.out.println(p);

	}

}
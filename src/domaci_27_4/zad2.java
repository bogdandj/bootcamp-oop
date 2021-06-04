/*Napisati program koji za uneti broj x 
(smatrajte da korisnik unosi jednocifreni broj) ispisuje tablicu mnozenja za taj broj.     
*/
package domaci_27_4;

import java.util.Scanner;

public class zad2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesi broj");
		int a = s.nextInt();
		int b = a;
		
		for (int i = 1; i<10; i++) {
			a = b * i;
			System.out.println(a);
		}
		

	}

}

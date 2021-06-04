/*(Switch) Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature
(operator je string i moze imati vrednosti +, - , *, /) 
racuna  i ispisuje na ekranu odgovarajuci zbir, razliku, 
proizvod ili kolicnik za dva broja a i b uneta sa tastature.
*/
package domaci_27_4;

import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite A");
		int a = s.nextInt();
		
		System.out.println("Unesite B");
		int b = s.nextInt();
		
		int c;
		
		System.out.println("Unesite operator");
		String o = s.next();
		
		switch(o) {
		case "+":
			c = a + b;
			System.out.println("Rezultat je " + c);
		break;
		
		case "-":
			c = a - b;
			System.out.println("Rezultat je " + c);
		break;
		
		case "*":
			c = a * b;
			System.out.println("Rezultat je " + c);
		break;
		
		case "/":
			
			c = a / b;
			System.out.println("Rezultat je " + c);
		break;
		default:
			System.out.println("Nevalidan unos");
		
		}

	}

}

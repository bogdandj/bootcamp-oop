/* Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
 Brojevi su ulazni parametri funkcije.
 U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima. */

package domaci_06;

public class zad1 {

	public static void main(String[] args) {

		operacije(8, 2);
		operacije(5, 1);
		operacije(70, 20);

	}

	public static void operacije(double a, double b) {

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println("\n");

	}

}

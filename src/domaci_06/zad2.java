/*Napisati funkciju koja za dva jednocifrena broja
koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru:
	ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
	ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.*/

package domaci_06;

public class zad2 {

	public static void main(String[] args) {
		
		System.out.println(spajanje(8, 4));

	}

	public static double spajanje(double a, double b) {

		return a*10 + b;

	}

}

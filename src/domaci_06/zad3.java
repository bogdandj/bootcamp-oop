/*(Za vezbanje )Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.

Primer izvrsenja: 
izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1*/


package domaci_06;

public class zad3 {

	public static void main(String[] args) {

		System.out.println(celi(-5, -1));

	}

	public static double celi(double a, double b) {

		double c = 0;
		if (a < b) {
			return c = b - a - 1;
		} else {
			System.out.println("Nema celih brojeva izmedju ova dva broja");
		}

		return c;
	}

}

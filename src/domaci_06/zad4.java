/*(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.*/

package domaci_06;

public class zad4 {

	public static void main(String[] args) {

		System.out.println(najveci(12, 7, 84));

	}

	public static double najveci(double a, double b, double c) {
		double x = 0;

		if (a > b && a > c) {
			x = a;
		} else if (b > c) {
			x = b;
		} else {
			x = c;
		}

		return x;
	}

}

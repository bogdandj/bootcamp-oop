/*Napisati funkciju koja proverava da li je kliknuto u okviru login forme za web stranicu.
Funkcija kao parametre prima x i y koordinate za T1, T2 i M i vraca da li je tacka u tom regionu.
Napomena: Funkcija prima 6 broja, i vraca true/false.*/


package domaci_07;

public class zad2 {

	public static void main(String[] args) {

		System.out.println(klik(3, 1, 20, 12, 11, 7));

	}

	public static boolean klik(int x1, int y1, int x2, int y2, int m1, int m2) {
		boolean z = false;

		if (((m1 >= x1) && (m2 <= x2) && (m1 >= y1) && (m2 <= y2))) {
			z = true;
		}

		return z;
	}
}

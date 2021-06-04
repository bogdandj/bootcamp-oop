/*4. Za potrebe loto igre na srecu, potrebno je implementirati metodu koja vraca informaciju da li je odigrana

loto kombinacija upravo dobitna kombinacija. Metoda kao parametre prima dva niza oba duzine 7,
prvi niz predstavlja odigranu kombinaciju a drugi niz predstavlja izvucenu kombinaciju.
Metoda kao povratnu vrednost vraca true ili false.
U main programu pozvati metodu za vise kombinacija i ispisati odgovarajuce poruke.
Primer poziva metoda:
Ako se metoda pozove za:
odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena= {1,2 ,3, 7, 32, 29} vraca false
Ako se metoda pozove za:
odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena={1, 2, 3, 4, 5, 33, 29} vraca true.*/


package test;

public class zad4 {

	public static void main(String[] args) {

		int[] odigrana = { 1, 7, 12, 22, 25, 26, 29 };
		int[] izvucena = { 1, 7, 20, 23, 25, 26, 29 };

		int[] odigrana1 = { 1, 7, 17, 25, 26, 29, 31 };
		int[] izvucena1 = { 1, 8, 21, 30, 31, 33, 35 };
		
		int[] odigrana2 = { 2, 5, 9, 12, 17, 20, 27 };
		int[] izvucena2 = { 2, 5, 9, 12, 17, 20, 27 };


		System.out.println(loto(odigrana, izvucena));
		System.out.println(loto(odigrana1, izvucena1));
		System.out.println(loto(odigrana2, izvucena2));

	}

	public static boolean loto(int[] odi, int[] izv) {

		boolean dobitnik = false;
		int match = 0;

		for (int i = 0; i < odi.length; i++) {
			if (odi[i] == izv[i]) {
				match++;
			}
			if (match == 7) {
				dobitnik = true;
			}
		}

		return dobitnik;
	}

}

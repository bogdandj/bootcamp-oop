/*Napisati funkciju koja vraca indeks trazenog broj K u nizu N. Niz i K su parametri funkcije.
Napomena ukoliko se vrednost K ne nalazi u nizu vratiti -1.	

	Primer: 
niz = {8,3,4, 5, 0} i K = 33 => vraca -1
niz = {8,3,4, 5, 0} i K = 3 => vraca 1*/

package domaci_07;

public class zad1 {

	public static void main(String[] args) {
		int[] brojevi = { 1, 6, 865, -22, -5, 12, 65, 27, 51, 5, -20 };

		System.out.println(provera(brojevi, 12));
	}

	public static int provera(int[] numbers, int k) {
		int x = -1;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == k) {
				x = i;
			}

		}
		return x;
	}
}

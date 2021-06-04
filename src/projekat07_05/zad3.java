package projekat07_05;

public class zad3 {

	public static void main(String[] args) {

		System.out.println(metoda(1561, 4));
	}

	public static boolean metoda(int n, int k) {

		int brojac = 0;

		brojac = janko(n);

		return brojac == k;

	}

	public static int janko(int e) {
		int count = 0;

		while (e >= 1) {
			e = e / 10;
			count++;
		}
		return count;
	}
}

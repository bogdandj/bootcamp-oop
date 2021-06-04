package projekat07_05;

public class zad4 {

	public static void main(String[] args) {
		int[] brojevi = {1, 2, 3, 4, 5, 6, 7, 22, 28, 99, 150};
		
		stampajParne(brojevi);
	}

	public static void stampajParne(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0) {
				System.out.println(niz[i]);
			}

		}
	}

}


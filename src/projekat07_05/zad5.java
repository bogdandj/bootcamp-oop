package projekat07_05;

public class zad5 {

	public static void main(String[] args) {
		int[] brojevi = {1, 2, 3, 4, 5, 6, 7, 22, 28, 4, 99, 150};

		
		stampajParne(brojevi, 4);
	}

	public static void stampajParne(int[] niz, int k) {
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == k) {
				System.out.print(i + ", ");
			}

		}
	}

}


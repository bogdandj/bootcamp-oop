package projekat07_05;

public class zad6 {

	public static void main(String[] args) {
		String[] reakcija = { "lol", "sunglasses", "like", "heart" };

		int[] brojac = { 1, 2, 0, 4 };

		podaci("Bogdan", "Djuric", "blabla", reakcija, brojac);
	}

	public static void podaci(String ime,
			String prezime,
			String poruka,
			String[] niz1,
			int[] niz2) {
		
		System.out.println(prezime + " " + " " + ime + "\n" + poruka);
		for (int i = 0; i < niz1.length; i++) {
			System.out.print(niz1[i] + (niz2[i]) + "|");
		}
	}

}

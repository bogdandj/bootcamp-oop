package projekat07_05;

public class zad9 {

	public static void main(String[] args) {
		String[] sastojci = { "luk", "parmezan", "pecurke", "pavlaka", "paradajz" };
		double[] cene = { 50, 120, 90, 67, 42 };

		rucak("spagete", sastojci, cene, false);
		
	}

	public static void rucak(String testenina, String[] sastojci, double[] cene, boolean stalna) {

		double racun = 0;
		System.out.println("Sastojci");

		if (testenina.equals("spagete")) {
			racun += + 40;
			System.out.println("Spagete - 40");
		} else if (testenina.equals("pene")) {
			racun += + 50;
			System.out.println("Penee - 50");
		}
		
		

		for (int i = 0; i < cene.length; i++) {
			System.out.println(sastojci[i] + " - " + cene[i]);
			racun += + cene[i];
		}
		
		if (stalna == true) {
			racun = racun * 0.9;
			System.out.println("Popust 10%");
		}
		System.out.println("Cena paste je " + racun);
		
		


	}

}
package test_java;

public class zadatak1 {

	public static void main(String[] args) {

		Mountain zlatibor = new Mountain("Zlatibor", "Srbija", 1700);
		Mountain tara = new Mountain("Tara", "Srbija", 1900);
		Mountain himalaji = new Mountain("Himalaji", "Nepal", 8878);
		Mountain alpi = new Mountain("Alpi", "Francuska", 3752);

		RecreationalMountaineer rm1 = new RecreationalMountaineer("5150-7943", "Bogdan Djuric", 5, "Sumadijski", 2500);
		RecreationalMountaineer rm2 = new RecreationalMountaineer("1180-7741", "Pera Peric", 10, "Moravski", 1400);
		RecreationalMountaineer rm3 = new RecreationalMountaineer("2221-4705", "Sima Simic", 2, "Raskog", 1700);

		Alpinist alp1 = new Alpinist("8895-4307", "Mita Mitic", 5);
		Alpinist alp2 = new Alpinist("1119-4786", "Ivan Ivanic", 11);
		Alpinist alp3 = new Alpinist("6627-4709", "Milos Milosevic", 20);

		MountainLodge lodge1 = new MountainLodge("Stari dom", 1972);

		lodge1.addMountaineer(rm1);
		lodge1.addMountaineer(rm2);
		lodge1.addMountaineer(rm3);

		lodge1.addMountaineer(alp1);
		lodge1.addMountaineer(alp2);
		lodge1.addMountaineer(alp3);

		System.out.println("Mesecna clanarina: " + rm1.monthlyPrice());
		System.out.println("Planinar moze da se popne do vrha: " + rm1.successfulAscent(zlatibor));
		rm1.print();

		System.out.println("\n");

		System.out.println("Mesecna clanarina: " + rm2.monthlyPrice());
		System.out.println("Planinar moze da se popne do vrha: " + rm2.successfulAscent(zlatibor));
		rm2.print();

		System.out.println("\n");

		System.out.println("Mesecna clanarina: " + alp1.monthlyPrice());
		System.out.println("Planinar moze da se popne do vrha: " + alp1.successfulAscent(zlatibor));
		alp1.print();

		System.out.println("\n");

		System.out.println("Mesecna clanarina: " + alp2.monthlyPrice());
		System.out.println("Planinar moze da se popne do vrha: " + alp2.successfulAscent(zlatibor));
		alp1.print();

		System.out.println("\n");

		System.out.println("Broj planinara koji mogu da se popnu na planinu: "
				+ lodge1.numberOfMountaineersThatReachTop(zlatibor));
		lodge1.removeMountaineer("5150-7943");
		System.out.println("Broj planinara koji mogu da se popnu na planinu nakon uklanjanja jednog planinara: "
				+ lodge1.numberOfMountaineersThatReachTop(zlatibor));

		System.out.println("\n");

		lodge1.print();
		System.out.println("Mesecna zarada planinskog doma je: " + lodge1.monthlyIncome());

	}

}

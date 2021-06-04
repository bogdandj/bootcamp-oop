package projekat_20_05;

public class z4 {

	public static void main(String[] args) {
		Package pack1 = new Package("Paket", "Bogdan Djuric", 3200, 24, 100, 60);
		
		EONPackage eon1 = new EONPackage("Pera Peric", 4000, 36);
		
		DuoPackage duo1 = new DuoPackage("Mita Mitic", 5000, 48, "Tablet");
		
		pack1.print();
		
		eon1.print();
		
		duo1.print();

	}

}

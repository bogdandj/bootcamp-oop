package domaci_17_05;

public class z2 {

	public static void main(String[] args) {
		Bill bill1 = new Bill("4592-4811-1201-4812", "Bogdan Djuric", 48000);
		Bill bill2 = new Bill("4592-5555-1108-9294", "Pera Peric", 1200);
		
		bill1.print();
		bill2.print();


		Transaction tr1 = new Transaction("991216", bill1, bill2);
		tr1.executeTransaction(10000);
		tr1.print();
	}

}

package projekat_11_5;

public class main {

	public static void main(String[] args) {
		
		racun racun1 = new racun();
		racun1.brojRacuna = "840-5792-4522-7052";
		racun1.imeIPrezime = "Bogdan Djuric";
		racun1.stanje = 482900.53;

		racun racun2 = new racun();
		racun2.brojRacuna = "8490-4810-5412-1111";
		racun2.imeIPrezime = "Pera Peric";
		racun2.stanje = 15802.84;
		
		
		if(racun1.stanje > racun2.stanje) {
			System.out.println(racun1.imeIPrezime + " " + racun1.brojRacuna + " " + racun1.stanje);
		} else {
			System.out.println(racun2.imeIPrezime + " " + racun2.brojRacuna + " " + racun2.stanje);
		}
		
		stampa(racun1.brojRacuna, racun1.imeIPrezime, racun1.stanje);
		stampa(racun2.brojRacuna, racun2.imeIPrezime, racun2.stanje);
		
	}
	
	public static void stampa(String brRa, String ime, double sta) {
		System.out.println(ime + " " + brRa + " " + sta);
		
	}

}
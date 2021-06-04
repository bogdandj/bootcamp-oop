/*
(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere.
Podatke za igrace i trenere unosi korisnik sa tastature.*/

package projekat_20_05;

public class z2 {

	public static void main(String[] args) {
		VisaCard visa = new VisaCard(55000, "5959-14851-151-00042", "2025", "7", "Bogdan Djuric");
		MasterClass master = new MasterClass(79000, "8894-145-1500-4856", "2023", "11");

		visa.executeTransaction(1200);
		visa.print();
		
		master.executeTransaction(45000);
		master.chargeMaintenance();
		master.print();
	}

}

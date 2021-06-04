package projekat_24_05;

public class z2 {

	public static void main(String[] args) {
		
		TaxAdministration admin1 = new TaxAdministration("Kragujevac");
		
		Objekat house = new House("Glavna ulica", 56, "1", 4);
		Objekat building = new Building("Karadjordjeva 3", 72, "2", 35);
		Objekat local = new Local("Kneza Milosa", 40, "3");
		
		admin1.addObject(house);
		admin1.addObject(building);
		admin1.addObject(local);
		
		System.out.println(admin1.highestTax().getAddress());
		admin1.lowestTax();
		admin1.sumTax();
		admin1.print();

	}

}

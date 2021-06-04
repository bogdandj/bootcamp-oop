/*Kreirati klasu Korpa koja ima:
niz ambalaza
metodu dodaj ambalazu
metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
*/

package domaci_24_05;

import java.util.ArrayList;

public class Cart {

	protected ArrayList<Package> packages = new ArrayList<Package>();

	public void addPackage(Package pack) {
		packages.add(pack);
	}

	public void removePackage(String barcode) {
		for (int i = 0; i < packages.size(); i++) {
			if (packages.get(i).getBarcode().equals(barcode)) {
				packages.remove(i);
			}
		}

	}

	private double totalPrice(int discount) {
		double sum = 0;
		for (int i = 0; i < packages.size(); i++) {
			sum = sum + packages.get(i).price();
		}
		return sum - discount;
	}

	public double totalPriceWithCard(SuperCard card) {
		return totalPrice(0) - card.getDiscount();
	}

}

/*Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
atribut koji kaze da li se moze reciklirati
osnovna cena
gettere i setter za atribute
konstuktori koji su vam potrebni
racuna cenu tako da ispunjava uslova:
ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
ako nije u cenu ulazi samo osnovna cena
metoda stampaj stampa sve podatke iz klase tetrapak.
*/

package domaci_24_05;

public class TetraPak extends Package {

	protected boolean recyclable;
	protected double price;

	public boolean isRecyclable() {
		return recyclable;
	}

	public void setRecyclable(boolean recyclable) {
		this.recyclable = recyclable;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public TetraPak(String barcode, String name, double neto, double bruto, boolean recyclable, double price) {
		super(barcode, name, neto, bruto);
		this.recyclable = recyclable;
		this.price = price;
	}

	@Override
	public double price() {
		if (recyclable == true) {
			return this.weightPackage() * 1.5 + this.price;
		}
		return this.price;
	}

	@Override
	public void print() {
		System.out.println("Barkod: " + this.barcode);
		System.out.println("Naziv proizvoda: " + this.name);
		System.out.println("Neto tezina proizvoda: " + this.neto + "gr");
		System.out.println("Bruto tezina proizvoda: " + this.bruto + "gr");
		System.out.println("Ovaj proizvod je moguce reciklirati: " + this.recyclable);
		System.out.println("Cena: " + this.price() + " dinara");

	}

}

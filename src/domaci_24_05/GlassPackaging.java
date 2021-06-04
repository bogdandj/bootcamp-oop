/*Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
kaucija za flasu
atribut koji kaze da li se za flasu placa kaucija
osnovna cena
gettere i setter za atribute
konstuktori koji su vam potrebni
racuna cenu
ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
ako se ne placa, (osnovna cena) * 1.2
metoda stampaj stampa sve podatke iz klase staklena flasa.
*/

package domaci_24_05;

public class GlassPackaging extends Package {

	protected double deposit;
	protected boolean payDeposit;
	protected double price;

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public boolean isPayDeposit() {
		return payDeposit;
	}

	public void setPayDeposit(boolean payDeposit) {
		this.payDeposit = payDeposit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public GlassPackaging(String barcode, String name, double neto, double bruto, double deposit, boolean payDeposit,
			double price) {
		super(barcode, name, neto, bruto);
		this.deposit = deposit;
		this.payDeposit = payDeposit;
		this.price = price;
	}

	@Override
	public double price() {
		if (this.payDeposit == true) {
			return this.price * 1.2 + this.deposit;
		}
		return this.price * 1.2;
	}

	@Override
	public void print() {
		System.out.println("Barkod: " + this.barcode);
		System.out.println("Naziv proizvoda: " + this.name);
		System.out.println("Neto tezina proizvoda: " + this.neto + "gr");
		System.out.println("Bruto tezina proizvoda: " + this.bruto + "gr");
		System.out.println("Cena depozita za ambalazu: " + this.deposit + " dinara");
		System.out.println("Obavezno je platiti depozit za ovaj proizvod: " + this.payDeposit);
		System.out.println("Cena: " + this.price() + " dinara");

	}

}

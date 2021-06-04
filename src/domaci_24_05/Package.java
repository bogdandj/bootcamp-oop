/*Kreirati abstraktnu klasu Ambalaza koja ima:
barkod (primer: 328232-2823)
naziv artikla
neto tezinu
bruto tezinu
konstuktore (default-ni i sa parametrima)
gettere i settere
metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
abstraktnu metodu koja vraca cenu artikla
abstraktnu metodu stampaj
*/

package domaci_24_05;

public abstract class Package {
	protected String barcode;
	protected String name;
	protected double neto;
	protected double bruto;

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNeto() {
		return neto;
	}

	public void setNeto(double neto) {
		this.neto = neto;
	}

	public double getBruto() {
		return bruto;
	}

	public void setBruto(double bruto) {
		this.bruto = bruto;
	}

	public Package(String barcode, String name, double neto, double bruto) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.neto = neto;
		this.bruto = bruto;
	}

	public Package() {
	}

	public double weightPackage() {
		return this.bruto - this.neto;
	}

	public abstract double price();

	public abstract void print();
}

/*Kreirati klasu SuperKartica koja ima:
broj kartice
ime i prezime vlasnika
popust (200, 500, … )
konstuktore (default-ni i sa parametrima)
gettere i settere 
metodu stampaj koja stampa karticu u formatu:
(broj kartice), (ime i prezime)
*/

package domaci_24_05;

public class SuperCard {

	protected String number;
	protected String fullName;
	protected double discount;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public SuperCard() {
	}

	public SuperCard(String number, String fullName, double discount) {
		super();
		this.number = number;
		this.fullName = fullName;
		this.discount = discount;
	}

	public void print() {
		System.out.println("Broj kartice: " + this.number);
		System.out.println("Vlasnik kartice: " + this.fullName);
	}

}

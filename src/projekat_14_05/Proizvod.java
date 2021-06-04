package projekat_14_05;

public class Proizvod {
	
	private String nazivProizvoda;
	private Kupac musterija;
	private double cenaIzrade;

	
	public void setNazivProizvoda(String nazivProizvoda) {
		this.nazivProizvoda = nazivProizvoda;
	}
	
	public String getNazivProizvoda() {
		return this.nazivProizvoda;
	}
	
	public void setMusterija(Kupac musterija) {
		this.musterija = musterija;
	}
		
	public void setCenaIzrade(double cenaProizvoda) {
		this.cenaIzrade = cenaProizvoda;
	}
	
	public double getCenaIzrade() {
		return this.cenaIzrade;
	}
	
	public Proizvod(String nazivProizvoda, Kupac musterija, double cenaProizvoda) {
		this.nazivProizvoda = nazivProizvoda;
		this.cenaIzrade = cenaProizvoda;
		this.musterija = musterija;
	}
	
	/*Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
		cena izrade * 1.9 * (100 - popust na clansku karticu) / 100*/

	public double stampajCenu() {
		double cena = 0;
		cena = this.cenaIzrade * 1.9 * (100 - this.musterija.getClanskaKarta().getPopust()) / 100;
		return cena;
	}
	
	/*Metodu za stampanje proizvoda u formatu:
		naziv proizvoda - cena
		ime i prezime - broj kartice*/

	public void stampaj() {
		System.out.println(this.nazivProizvoda + " - " + stampajCenu() + this.musterija.getImeIPrezime() + this.musterija.getClanskaKarta().getClanskaKarta());
	}
	
	}


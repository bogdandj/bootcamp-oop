package projekat17_05;

public class Ugovor {
	
	private String datumUgovora;
	private FizickoLice prodavac;
	private FizickoLice kupac;
	private double cena;
	private String adresa;
	
	
	public double procenat() {
		if(this.kupac.getKupovala() == true) {
			return 2;
		} else{
		return 0.03;
		}
		
	}
	
	public double zarada() {
		return 1000 + this.cena * procenat();
	}
	
	public Ugovor (String datumUgovora, FizickoLice prodavac, FizickoLice kupac, double cena, String adresa) {
		this.datumUgovora = datumUgovora;
		this.prodavac = prodavac;
		this.kupac = kupac;
		this.cena = cena;
		this.adresa = adresa;
	}
	
	public void print() {
		System.out.println("Dana " + this.datumUgovora + " godine sklopljen je ugovor izmedju " + this.prodavac.getIme() + " i "
				+ this.kupac.getIme() + " o kupovini nekretnine " + this.adresa + " po ceni od " + this.cena + 
				" pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + this.zarada());
	}

}

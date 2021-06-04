package domaci_14_05;

public class Knjiga {
	
	private String ISBN;
	private String naziv;
	private int godinaIzdanja;
	private Autor autorKnjige;
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getISBN(String ISBN) {
		return this.ISBN;
	}
	
	public void setNaziv(String Naziv) {
		this.naziv = naziv;
	}
	
	public String getNaziv() {
		return this.naziv;
	}
	
	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}
	
	public int getGodinaIzdanja() {
		return this.godinaIzdanja;
	}
	
	public Autor getAutorKnjige() {
		return this.autorKnjige;
	}
	
	public Knjiga (String ISBN, String naziv, int godinaIzdanja, Autor autorKnjige) {
		this.ISBN = ISBN;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
		this.autorKnjige = autorKnjige;
	}
	
	public void print() {
		System.out.println(ISBN);
		System.out.println(this.naziv + " - " + this.godinaIzdanja);
		System.out.println("Autor: " + this.autorKnjige.getAutorKnjige());


	}

}

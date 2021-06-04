package projekat_14_05;

public class Korisnik {
	private String imeKorisnika;
	private String prezimeKorisnika;
	
	
	public void setImeKorisnika(String imeKorisnika) {
		this.imeKorisnika = imeKorisnika;
	}
	
	public String getImeKorisnika() {
		return this.imeKorisnika;
	}
	
	public void setPrezimeKorisnika(String prezimeKorisnika) {
		this.prezimeKorisnika = prezimeKorisnika;
	}
	
	public String getPrezimeKorisnika() {
		return this.prezimeKorisnika;
	}
	
	public Korisnik (String imeKorisnika, String prezimeKorisnika) {
		this.imeKorisnika = imeKorisnika;
		this.prezimeKorisnika = prezimeKorisnika;
	}
	
	public void stampaj() {
		System.out.println(this.imeKorisnika + " " + this.prezimeKorisnika);
	}

}

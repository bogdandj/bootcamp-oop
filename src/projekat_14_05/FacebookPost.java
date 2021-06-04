package projekat_14_05;

public class FacebookPost {

	private String opis;
	private Korisnik kreator;
	
	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	public String getOpis() {
		return this.opis;
	}
	
	public void setKreator(Korisnik kreator) {
		this.kreator = kreator;
	}
	
	public FacebookPost(String opis) {
		this.opis = opis;
	}
	
	public void stampaj() {
		System.out.println(this.opis + " " + this.kreator.getImeKorisnika() + " " + this.kreator.getPrezimeKorisnika());
	}
}

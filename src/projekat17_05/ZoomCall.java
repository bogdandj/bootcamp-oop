package projekat17_05;

public class ZoomCall {
	private String link;
	private String password;
	private Korisnik korisnik;
	private Korisnik gost;

	
	public String getLink() {
		return this.link;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public Korisnik getHost() {
		return this.korisnik;
	}
	
	public Korisnik getGost() {
		return this.gost;
	}
	
	public void setGost(Korisnik gost) {
		this.gost = gost;
	}
	
	public ZoomCall(String link, String password, Korisnik korisnik, Korisnik gost){
		this.link = link;
		this.password = password;
		this.korisnik = korisnik;
		this.gost = gost;
	}
	
	public void stampaj() {
		System.out.println("Zoom Call: " + this.link);
		System.out.println("Passowrd: " + this.password);
		System.out.println("Host: " + this.korisnik);
		System.out.println("Gost: " + this.gost);
		System.out.println("Maksimalno trajanje videa je " + this.korisnik.getTipLicence());
	}
	
	
}

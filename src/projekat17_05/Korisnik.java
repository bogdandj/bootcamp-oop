package projekat17_05;

public class Korisnik {

	private String ime;
	private String tipLicence;

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getIme() {
		return this.ime;
	}

	public String getTipLicence() {
		return this.tipLicence;
	}

	public Korisnik(String ime, String tipLicence) {
		this.ime = ime;
		this.tipLicence = tipLicence;
	}
	
	public Korisnik(String ime) {
		this.ime = ime;
	}

	public void pretplatiSe(int uplata) {
		if (uplata == 100) {
			this.tipLicence = "pro";
		}
		if (uplata == 150) {
			this.tipLicence = "premium";
		}

	}

	public void ponistiPreplatu() {
		this.tipLicence = "basic";
	}

	public int duzinaVidea() {
		if (this.tipLicence.equals("basic")) {
			return 40;
		} else if (this.tipLicence.equals("pro")) {
			return 240;
		} else if (this.tipLicence.equals("premium")) {
			return 1440;
		} else {
			return 0;
		}
	}

	public void print() {
		System.out.println(this.ime);
	}

}

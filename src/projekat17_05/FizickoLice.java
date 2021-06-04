package projekat17_05;

public class FizickoLice {
	private String ime;
	private int brojLK;
	private String JMBG;
	private boolean kupovala;
	
	
	public String getIme() {
		return this.ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public int getBrojLK() {
		return this.brojLK;
	}
	
	public void setBrojLK(int brojLK) {
		this.brojLK = brojLK;
	}
	
	public String getJMBG() {
		return this.JMBG;
	}

	public boolean getKupovala() {
		return this.kupovala;
	}
	
	public void setKupovala(boolean kupovala) {
		this.kupovala = kupovala;
	}
	
	public FizickoLice(String ime, int brojLK, String JMBG, boolean kupovala) {
		this.ime = ime;
		this.brojLK = brojLK;
		this.JMBG = JMBG;
		this.kupovala = kupovala;
	}
	
	public FizickoLice(String ime, int brojLK, String JMBG) {
		this.ime = ime;
		this.brojLK = brojLK;
		this.JMBG = JMBG;
	}
	
	
	public void stampaj() {
		System.out.println(this.ime + ", " + this.brojLK);
	}
	
}

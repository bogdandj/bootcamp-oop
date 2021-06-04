package projekat_14_05;

public class Kupac {
	
	private String imeIPrezime;
	private ClanskaKarta clanskaKarta;

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	
	public String getImeIPrezime() {
		return this.imeIPrezime;
	}
	
	public void setClanskaKarta(ClanskaKarta clanskaKarta) {
		this.clanskaKarta = clanskaKarta;
	}
	
	public ClanskaKarta getClanskaKarta() {
		return this.clanskaKarta;
	}
	
	public Kupac (String imeIPrezime, ClanskaKarta clanskaKarta) {
		this.imeIPrezime = imeIPrezime;
		this.clanskaKarta = clanskaKarta;
	}
	
	public void stampajKupca() {
		System.out.println(this.imeIPrezime + " - " + this.clanskaKarta.getClanskaKarta());
	}
	
	
}

package projekat_14_05;

public class Film {
	
	private String nazivFilma;
	private int godinaFilma;
	private Reziser rezija;
	
	public void setNazivFilma(String nazivFilma) {
		this.nazivFilma = nazivFilma;
	}
	
	public String getNazivFilma() {
		return this.nazivFilma;
	}
	
	public void setGodinaFilma(int godinaFilma) {
		this.godinaFilma = godinaFilma;
	}
	
	public int getGodinaFilma() {
		return this.godinaFilma;
	}
	
	public void setRezija(Reziser reziser1) {
		this.rezija = reziser1;
	}
	
	
	public Film(String nazivFilma, int godinaFilma) {
		this.nazivFilma = nazivFilma;
		this.godinaFilma = godinaFilma;
		
	}
	
	public void stampaj() {
		System.out.println(this.nazivFilma + " " + this.godinaFilma + " " + this.rezija.getImeRezisera() + " " + this.rezija.getGodineRezisera());
	}
	

}

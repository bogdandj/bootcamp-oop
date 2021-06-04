package domaci_14_05;

public class Vaga {
	private String mernaJedinica;
	private Proizvod sifra;

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public String getMernaJedinica() {
		return this.mernaJedinica;
	}

	public Proizvod getSifra() {
		return this.sifra;
	}
	
	public void setSifra(Proizvod sifra) {
		this.sifra = sifra;
	}

	public Vaga() {

	}

	public double sracunajCenu(double tezina) {
		if (this.mernaJedinica.equals("KG")) {
			return tezina * this.sifra.getCenaKg();
		} else if (this.mernaJedinica.equals("LB")) {
			return tezina * this.sifra.getCenaLb();
		} else {
			return 0;
		}

	}
	
	public void print(double tezina) {
		if (mernaJedinica.equals("KG")) {
		System.out.println(this.sifra.getSifra() + " - " + this.sifra.getNaziv());
		System.out.println(this.sifra.getCenaKg() + this.mernaJedinica + " " + tezina);
		System.out.println("Tezina: " + sracunajCenu(tezina));
	} else if (mernaJedinica.equals("LB")) {
		System.out.println(this.sifra.getSifra() + " - " + this.sifra.getNaziv());
		System.out.println(this.sifra.getCenaLb() + this.mernaJedinica + " " + tezina);
		System.out.println("Tezina: " + sracunajCenu(tezina));
	}
	
	
	}
}

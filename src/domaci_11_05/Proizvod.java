package domaci_11_05;

public class Proizvod {
	
	String nazivProizvoda;
	double cena;
	double tezina;
	
	public void stampaj() {
		System.out.println(this.nazivProizvoda + " " + this.cena + " " + this.tezina);
	}
	
	public void povecajCenu(int ipovecanje) {
		double povecanje = 0;
		this.cena = this.cena + povecanje;
	}
	
	public double vratiCenuSaPopustom(double popust) {
		return this.cena * popust/100;
		
	}
	
	public double racunajPostarinu() {
		double postarina = 0;
		if (this.tezina <= 100) {
			postarina = 200;
		} else if (this.tezina > 101 && this.tezina <= 500) {
			postarina = 400;
		} else if (this.tezina > 500) {
			postarina = 1000;
		}
		
		return postarina;
	}

}

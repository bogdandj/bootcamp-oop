package projekat_11_5;

public class Auto {

	String vozac;
	String modelAuta;
	int brojVrata;
	double potrosnjaGoriva;
	double brzina;
	String registracija;
	boolean klima;
	int godinaProizvodnje;
	int mesecIstekaRegistracije;
	int kubikaza;

	public void stampajAuto() {
		System.out.println("Ime i prezime: " + this.vozac);
		System.out.println(this.modelAuta + " - " + this.brojVrata + "-ro vrata");
		System.out.println("Sa potrosnjom od " + this.potrosnjaGoriva + "l na 100km");
		System.out.println(this.brzina + " km/h je trenutna brzina automobila");
	}

	public boolean prekoracenje(int limit) {
		boolean presao = false;
		if (this.brzina > limit) {
			presao = true;
		}
		return presao;
	}

	public double kazna(int limit) {
		double placanje = 0;

		if (brzina > limit) {
			placanje = (this.brzina - limit) * 1000;
		}

		return placanje;
	}

	public void dodajGas() {
		this.brzina = this.brzina + 10;
	}

	public void koci() {

		this.brzina = this.brzina - 10;
		if(this.brzina - 10 < 0) {
			this.brzina = 0;
		}

	}

	public double potroseno() {
		double f = 1;
		if (this.klima == true) {
			f = 1.2;
		}

		double trosi = ((this.brzina / 100) * this.potrosnjaGoriva) * f;
		return trosi;
	}
	
	public boolean oldTimer() {
		boolean old = false;
		
		if(this.godinaProizvodnje < 1950) {
			old = true;
		}
		return old;
	}
	
	public boolean isteklaRegistracija() {
		boolean istekla = false;
		
		if(this.mesecIstekaRegistracije < 5) {
			istekla = true;
		}
		return istekla;
	}
	
	public double cenaRegistracija() {
		double cenaReg;
		if(this.kubikaza <= 2000) {
			cenaReg = this.kubikaza * 100;
		} else {
			cenaReg = (this.kubikaza * 100) * 1.3;
		}
		return cenaReg;
	}

}

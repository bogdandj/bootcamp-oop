package projekat_13_05;

public class Radnik {

	private int jmbg;
	private String imeIPrezime;
	private int brojDece;
	private int strucnaSprema;
	private double godineStaza;

	public int getJmbg() {
		return this.jmbg;
	}

	public String getImeIPrezime() {
		return this.imeIPrezime;
	}

	public void setImeIPrezime(String ime) {
		this.imeIPrezime = ime;
	}

	public int getBrojDece() {
		return this.brojDece;
	}

	public void setBrojDece(int deca) {
		this.brojDece = deca;
	}

	public int getStrucnaSprema() {
		return this.strucnaSprema;
	}

	public void setStrucnaSprema(int sprema) {
		this.strucnaSprema = sprema;
	}

	public double getGodineStaza() {
		return this.godineStaza;
	}

	public void setGodineStaza(int staz) {
		this.godineStaza = staz;
	}

	public Radnik(int jmbg) {
		this.jmbg = jmbg;
		System.out.println(jmbg);
	}

	public Radnik(int jmbg, String ime, int deca, int ss, int god) {
		this.jmbg = jmbg;
		this.imeIPrezime = ime;
		this.brojDece = deca;
		this.strucnaSprema = ss;
		this.godineStaza = god;

		System.out.println(jmbg + ime + deca + ss + god);
	}

	public double minuliRad() {
		double minuliRad = 0;

		if (this.godineStaza < 10) {
			minuliRad = this.godineStaza * 1.05;
		} else if (this.godineStaza > 10 && this.godineStaza < 20) {
			minuliRad = (this.godineStaza * 1.05) + this.godineStaza * 1.075;
		} else if (this.godineStaza > 20) {
			minuliRad = ((this.godineStaza * 1.05) + this.godineStaza * 1.075) + this.godineStaza * 1.075;
		}

		return minuliRad;
	}

	public double koeficijentSlozenosti() {
		double koeficijent = 1.0;

		switch (this.strucnaSprema) {
		case 1:
			koeficijent = 1.03;
			break;
		case 2:
			koeficijent = 1.65;
			break;
		case 3:
			koeficijent = 2;
			break;
		case 4:
			koeficijent = 2.27;
			break;
		case 5:
			koeficijent = 2.88;
			break;
		case 6:
			koeficijent = 3.09;
			break;
		case 7:
			koeficijent = 3.40;
			break;
		case 8:
			koeficijent = 4.12;
			break;
		}
		return koeficijent;
	}

	public double plata() {

		double minuliRad = minuliRad();
		double koeficijent = koeficijentSlozenosti();
		return 25000 + (minuliRad + koeficijent) * 10000;
	}

	public boolean kreditnoSposoban() {
		boolean sposoban = false;

		if (plata() > 50000) {
			sposoban = true;
		} else {
		}
		return sposoban;
	}

	public int brojSlobodnihDana() {
		return 22 + (this.brojDece) * 2;
	}

}

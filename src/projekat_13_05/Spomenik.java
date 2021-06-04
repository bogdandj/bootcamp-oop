package projekat_13_05;

public class Spomenik {
	
	public String imeSpomenika;
	public boolean otvoreno;
	public String grad;

	
	public Spomenik() {
	}
	
	public Spomenik(String ime, boolean otv, String lokacija) {
		this.imeSpomenika = ime;
		this.otvoreno = otv;
		this.grad = lokacija;
	}
	
	public void stampaj() {
		System.out.println(imeSpomenika + " " + otvoreno + " " + grad);
	}
}

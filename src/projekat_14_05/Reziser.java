package projekat_14_05;

public class Reziser {

	private String imeRezisera;
	private int godineRezisera;

	public void setImeRezisera(String imeRezisera) {
		imeRezisera = this.imeRezisera;
	}

	public String getImeRezisera() {
		return this.imeRezisera;
	}

	public void setGodineRezisera(int godineRezisera) {
		this.godineRezisera = godineRezisera;
	}

	public int getGodineRezisera() {
		return this.godineRezisera;
	}

	public Reziser(String imeRezisera, int godineRezisera) {
		this.imeRezisera = imeRezisera;
		this.godineRezisera = godineRezisera;
	}

	public void stampaj() {
		System.out.println(this.imeRezisera + " " + this.godineRezisera);
	}

}

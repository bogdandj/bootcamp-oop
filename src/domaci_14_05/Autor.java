package domaci_14_05;

public class Autor {

	private String autorKnjige;

	public void setAutorKnjige(String autorKnjige) {
		this.autorKnjige = autorKnjige;
	}

	public String getAutorKnjige() {
		return this.autorKnjige;
	}

	public Autor(String autorKnjige) {
		this.autorKnjige = autorKnjige;
	}

	public void print() {
		System.out.println(this.autorKnjige);
	}

}

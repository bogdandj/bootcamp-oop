package vezbanje;

public class Video {
/*//	svi atributi su private
//	id video - koji je string i na primer izgleda v6tuOipj5mk
//	naziv video
//	duzinu video u sekundama (npr: ako je video 2min i 10s, duzina je 130)
//	broj lajkova
//	broj dislajkova
//	broj pregleda
//	gettere za sve atribute
//	settere nemamo
​*/
	private String idVideo;
	private String naziv;
	private int duzina;
	private int brLike;
	private int brDislike;
	private int brPregleda;
	
	public String getIdVideo() {
		return idVideo;
	}
	public String getNaziv() {
		return naziv;
	}
	public int getDuzina() {
		return duzina;
	}
	public int getBrLike() {
		return brLike;
	}

	public int getBrDislike() {
		return brDislike;
	}
	public int getBrPregleda() {
		return brPregleda;
	}
	public Video(String idVideo, String naziv, int duzina, int brLike, int brDislike, int brPregleda) {
		super();
		this.idVideo = idVideo;
		this.naziv = naziv;
		this.duzina = duzina;
		this.brLike = brLike;
		this.brDislike = brDislike;
		this.brPregleda = brPregleda;
	}
//	metodu lajkuj - koja povecava broj lajkova za jedan
	public void lajkuj() {
		this.brLike = this.brLike + 1;
	}
//	metodu dislajkuj - koja povecava broj dislajkova za jedan
	public void dislajkuj() {
		this.brDislike = this.brDislike - 1;
	}
//	metodu pogledaj - koja povecava broj pregleda za jedan
	public void pogledaj() {
		this.brPregleda = this.brPregleda + 1;
	}
}
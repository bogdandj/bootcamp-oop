package vezbanje;

public class YTplayer {
//	svi atributi su private
//	objekat video
//	kvalitet videa (moze da bude 144, 240, 360, 480, 720, 1080)
//	rezim koji moze da bude - mini player , bioskopski rezim , preko celog ekrana
//	jacinu zvuka
//	trenutno vreme videa u reprodukciji

	private int kvalitet;
	private String rezim;
	private int jacinaZvuka;
	private int trenutnoVreme;
	private Video videos;

//	gettere za sve atribute

	public int getKvalitet() {
		return kvalitet;
	}

	public String getRezim() {
		return rezim;
	}

	public int getJacinaZvuka() {
		return jacinaZvuka;
	}

	public int getTrenutnoVreme() {
		return trenutnoVreme;
	}
	public Video getVideos() {
		return videos;
	}

	public YTplayer(Video v) {
		this.videos = v;
	}

	// metodu ucitajVideo kojoj se prosledjuje referenca do videa koji se pusta.
	// Trenutno vreme kada se ucita video se postavlja na nulu.
	public void ucitajVideo(Video videos) {
		this.trenutnoVreme = 0;
		System.out.println("Vreme ucitavanja je: " + this.trenutnoVreme);
	}

//	samo difoltni konstuktor, i njemu se svuk postavlja na 75 i kvalitet po difoltu na 144
	public YTplayer() {
		this.jacinaZvuka = 75;
		this.kvalitet = 144;
	}

	// metodu pojacaj- koja povecava jacinu zvuka za 10. Znate da morate da vodite
	// racuna da ne predje 100.
	public void pojacaj() {
		this.jacinaZvuka = this.jacinaZvuka + 10;
		if (this.jacinaZvuka >= 100) {
			this.jacinaZvuka = 100;
		}
		System.out.println("Trenutna jacina zvuka je " + this.jacinaZvuka);
	}

//metodu smanji - koja smanjuje jacinu zvuka za 10 (da ne padne ispod nule)
	public void smanji() {
		this.jacinaZvuka = this.jacinaZvuka - 10;
		if (this.jacinaZvuka <= 0) {
			this.jacinaZvuka = 0;
		}
		System.out.println("Trenutna jacina zvuka je " + this.jacinaZvuka);
	}
//		metodu postaviKvalitet - metoda kao parametar prima brzinu interneta u megbajtima.
//		Ako je brzina interneta ispod 2Mb -> kvalitet je 144
//		Ako je brzina interneta do 4Mb -> kvalitet je 240
//		Ako je brzina interneta do 6Mb -> kvalitet je 360
//		Ako je brzina interneta do 8Mb -> kvalitet je 720
//		Ako je brzina interneta preko 8Mb -> kvalitet je 1080

	public void postaviKvalitet(int mb) {

		if (mb <= 2) {
			this.kvalitet = 144;
		}
		if (mb <= 4) {
			this.kvalitet = 240;
		}
		if (mb <= 6) {
			this.kvalitet = 360;
		}
		if (mb <= 8) {
			this.kvalitet = 720;
		}
		if (mb > 8) {
			this.kvalitet = 1060;
		}
		System.out.println("Kvalitet videa je: " + this.kvalitet);
	}

//metodu aktivirajMiniPlayerMod - koja postavlja rezim na mini player
	public void aktivirajMiniplayer() {
		this.rezim = "mini player";
		System.out.println("Rezim je " + this.rezim);
	}

//metodu aktivirajBioskopskiMod -  koja postavlja bioskopski rezim
	public void aktivirajBioskopskiMod() {
		this.rezim = "bioskopski rezim";
		System.out.println("Rezim je " + this.rezim);
	}

//metodu aktivirajPrekoCelogEkranaMod -  koja postavlja rezim preko celog ekrana
	public void aktivirajPrekoCelogEkranaMod() {
		this.rezim = "preko celog ekrana";
		System.out.println("Rezim je " + this.rezim);
	}

//metodu premotajUnapred - metoda koja premotava trenutno vreme videa za 10s.
	//Vodite racuna da ne predjete duzinu videa.
	
	public void premotajUnapred() {
		this.trenutnoVreme = this.trenutnoVreme + 10;
		if(this.trenutnoVreme > this.videos.getDuzina()) {
			this.trenutnoVreme = this.videos.getDuzina();
		} 
		System.out.println(this.trenutnoVreme);
	}

//metodu premotajUnazad - metoda vraca trenutno vreme videa za 10s. Vodite racuna da ne padnete ispod nule
	public void premotajUnazad() {
		this.trenutnoVreme = this.trenutnoVreme - 10;
		if (this.trenutnoVreme < 0) {
			this.trenutnoVreme = 0;
		}
		System.out.println(this.trenutnoVreme);
	}
//	iscrtajZvuk - metoda koja ispisuje tekst koji simulira jacinu zvuka. Svaka crtica predstavlja jecinu od 10.
//	Pa ako je jacina zvuka 75 - crtamo 7 crtica
//	Primer stampe je:   <: |||||||
//	Ako je jecina zvuka 32
//	Primer stampe je: <: |||
//	Ako je jacina nula
//	Onda stampamo </
//	[HELP] Broj crtica mozete da dobijete kao brCrtica = jacina zvuka / 10;

	public void iscrtajZvuk() {
		String slikaZvuka = "</";

		if (this.jacinaZvuka > 0 && this.jacinaZvuka < 20) {
			slikaZvuka = "<|";
		}
		if (this.jacinaZvuka >= 20 && this.jacinaZvuka < 30) {
			slikaZvuka = "<||";
		}
		if (this.jacinaZvuka >= 30 && this.jacinaZvuka < 40) {
			slikaZvuka = "<|||";
		}
		if (this.jacinaZvuka >= 40 && this.jacinaZvuka < 50) {
			slikaZvuka = "<||||";
		}
		if (this.jacinaZvuka >= 50 && this.jacinaZvuka < 60) {
			slikaZvuka = "<|||||";
		}
		if (this.jacinaZvuka >= 60 && this.jacinaZvuka < 70) {
			slikaZvuka = "<||||||";
		}
		if (this.jacinaZvuka >= 70 && this.jacinaZvuka < 80) {
			slikaZvuka = "<|||||||";
		}
		if (this.jacinaZvuka >= 80 && this.jacinaZvuka < 90) {
			slikaZvuka = "<||||||||";
		}
		if (this.jacinaZvuka >= 90 && this.jacinaZvuka <= 100) {
			slikaZvuka = "<|||||||||";
		}
		System.out.println("Jacina zvuka " + slikaZvuka);
	}

//	Metodu iscrtaj rezim koja iscrtava rezim po izgledu:
//		Ako je mini player stampa [ ]
//		Ako je bioskopski stampa se  [ ..]
//		Ako je preko celog ekrana  se [||||]
	public void iscrtajRezim() {
		String crtez = " ";
		if (this.rezim.equals("mini player")) {
			crtez = "[ ]";
		}
		if (this.rezim.equals("bioskopski rezim")) {
			crtez = "[..]";
		}
		if (this.rezim.equals("preko celog ekrana")) {
			crtez = "[||||]";
		}
		System.out.println("JRezim po izgledu: " + crtez);
	}

//	Metodu iscrtajTrenutnoVreme - metoda ispisuje vreme video u formatu
//	minut:sekund / minutUkupnogVideo:sekundUkupnogVidea
//	minut - se racuna kao trenutno vreme / 60
//	sekund - se racuna kao trenutno vreme % 60
//	minutUkupnogVideo - racuna se kao ukupna duzina video u sekundama / 60
//	sekundUkupnogVidea - racuna se kao ukupna duzina video u sekundama % 60
/*	public void iscrtajTrenutnoVreme() {
		int min = 0;
		int sec = 0;
		min = this.trenutnoVreme / 60;
		sec = this.trenutnoVreme % 60;
		System.out.println(min + ":" + sec);
	}
//	metodu iscrtaj timeline - metoda simulira iscrtavanje timelin-a.
*///	Koristicemo zvezdice i tackice. idu 100 zvezdice/tackica. Zvezdice za ono sto je pogledano.
//	******************************......................................................................
//	broj zvezdica = trenutno vreme * 100 / ukupno vreme videa
//	A stackice su 100 - broj zvezdica 

	public void iscrtajTimeline() {
		String zvezdice = "*";
		String tack = ".";
		int brZv = 0;
		int brTack = 0;
		brZv = this.trenutnoVreme * 100 / this.videos.getDuzina();
		brTack = 100 - brZv;
		for (int i = 0; i <= brZv; i++) {
			System.out.println(zvezdice);
		}
		for (int i = 0; i <= brTack; i++) {
			System.out.println(tack);
		}
	}
//	metodu iscitaj - metoda simulira iscrtavanje celog playera
//	  1:03 / 2:05  Zvuk <: |||||| 
//	 Timeline: ******************************.....................................................................  
//	Kvalitet: 720p  
//	Rezim: [||||]
//	 Ariana Grande - positions (official video)
//	Likes  23 | Dislikes 32
//	34893483 Pregleda 

}
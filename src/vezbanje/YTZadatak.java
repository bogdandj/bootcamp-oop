package vezbanje;

public class YTZadatak {
	public static void main(String[] args) {
		Video videos = new Video("https://www.youtube.com/watch?v=-NyC6mrutj0", "People are strange", 400, 1000, 2,
				1500);
		videos.lajkuj();
		videos.lajkuj();
		videos.dislajkuj();
		videos.pogledaj();
		
		YTplayer yt = new YTplayer();
		yt.ucitajVideo(videos);
		yt.pojacaj();
		yt.pojacaj();
		yt.smanji();
		yt.postaviKvalitet(7);
		yt.aktivirajMiniplayer();
		yt.aktivirajBioskopskiMod();
		yt.aktivirajPrekoCelogEkranaMod();
		yt.iscrtajZvuk();
		yt.iscrtajRezim();
		yt.premotajUnapred();
		yt.premotajUnapred(); 
		yt.premotajUnazad(); 

		//yt.iscrtajTrenutnoVreme();
	}
}
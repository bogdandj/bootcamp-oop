/*1.Kreirati klasu FacebookPost koja ima:
   Od atributa:
ime i prezime korisnika koji je objavio post
ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
tekst objave
broj lajkova
broj deljenja
  Od gettera i settera:
korisnik moze da procita bilo koji atribut 
ali ne moze da menja broj lajkova i broj deljenja
 Konstruktore:
	konstruktori koji su potrebni i logicni
  Od metoda:
like(), koja povecava broj lajkova za 1.
dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
share(), koja povecava broj deljenja za 1
print(), koja stampa objavu u formatu:
(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
(tekst objave)
Likes (broj lajkova) | Shares (broj deljenja)

U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.


Primer stampanja:
Milan Jovanovic >>> Pera Peric
Ovo je tekst objave
Likes 3 | Shares 1
*/


package domaci_13_05;

public class FacebookPost {

	private String imeKorisnika;
	private String postKorisniku;
	private String tekstPoruke;
	private int brojLajkova;
	private int brojDeljenja;

	public String getImeKorisnika() {
		return this.imeKorisnika;
	}

	public void setImeKorisnika(String imeKorisnika) {
		this.imeKorisnika = imeKorisnika;
	}

	public String getPostKorisniku() {
		return this.postKorisniku;
	}

	public void setPostKaKorisniku(String postKorisniku) {
		this.postKorisniku = this.postKorisniku;
	}

	public String getTekstPoruke() {
		return this.tekstPoruke;
	}

	public void setTekstPoruke(String tekstPoruke) {
		this.tekstPoruke = tekstPoruke;
	}

	public int getBrojLajkova() {
		return this.brojLajkova;
	}

	public int getBrojDeljenja() {
		return this.brojDeljenja;
	}

	public FacebookPost(String imeKorisnika, String postKorisniku, String tekstPoruke) {
		this.imeKorisnika = imeKorisnika;
		this.postKorisniku = postKorisniku;
		this.tekstPoruke = tekstPoruke;
		this.brojLajkova = 0;
		this.brojDeljenja = 0;
	}

	public FacebookPost(String imeKorisnika, String tekstPoruke) {
		this.imeKorisnika = imeKorisnika;
		this.tekstPoruke = tekstPoruke;
		this.brojLajkova = 0;
		this.brojDeljenja = 0;
	}

	public void like() {
		this.brojLajkova = this.brojLajkova + 1;
	}

	public void dislike() {

		if (this.brojLajkova > 0) {
			this.brojLajkova = this.brojLajkova - 1;
		} else {
			this.brojLajkova = 0;
		}

	}

	public void share() {
		this.brojDeljenja = this.brojDeljenja + 1;

	}

	public void print() {

		if (this.postKorisniku != null) {
			System.out.println(this.imeKorisnika + " >>> " + this.postKorisniku);
		} else {
			System.out.println(this.imeKorisnika);
		}
		System.out.println(this.tekstPoruke);
		System.out.println("Likes " + this.brojLajkova + " | " + "Shares " + this.brojDeljenja);

	}

}
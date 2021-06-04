package projekat17_05;

public class zad1 {

	public static void main(String[] args) {
		Korisnik host = new Korisnik("Bogdan Djuric", "basic");
		
		host.pretplatiSe(100);
		host.ponistiPreplatu();
		host.duzinaVidea();
		host.print();
		Korisnik gost = new Korisnik("Pera Peric");
		
		
		ZoomCall call = new ZoomCall("zoomLinksmdIOSDJN", "sifra", host, gost);
		call.stampaj();
	}
	

}

package domaci_11_05;

import projekat_11_5.Auto;

public class zad1 {

	public static void main(String[] args) {
		Proizvod telefon = new Proizvod();
		telefon.nazivProizvoda = "Samsung A52";
		telefon.cena = 38200;
		telefon.tezina = 210;
		
		
		telefon.stampaj();
		telefon.povecajCenu(4000);
		telefon.vratiCenuSaPopustom(30);
		telefon.racunajPostarinu();
		
		
		Proizvod tv = new Proizvod();
		tv.nazivProizvoda = "Sony Bravia";
		tv.cena = 47000;
		tv.tezina = 3400;
		
		
		tv.stampaj();
		tv.povecajCenu(4000);
		tv.vratiCenuSaPopustom(30);
		tv.racunajPostarinu();

	}
	
	
	
}

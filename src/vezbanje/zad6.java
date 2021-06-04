package vezbanje;

import java.util.Scanner;

public class zad6 {

	public static void main(String[] args) {

		System.out.println(racun("Adidas duks", 6000, 2, "DRUGI_ZA_DINAR"));
	}

	public static double racun(String proizvod, int cena, int kolicina, String kupon) {
		double ukupnaCena = cena * kolicina;
		switch (kupon) {
		case "30%POPUST":
			ukupnaCena = ukupnaCena - (ukupnaCena * 30 / 100);
			break;
		case "DRUGI_ZA_DINAR":
			if (kolicina >= 2) {
				ukupnaCena = cena + 1;
				break;
			}
		case "500VAUCER":
			ukupnaCena = ukupnaCena - 500;
			break;
		}
		return ukupnaCena;
	}

}

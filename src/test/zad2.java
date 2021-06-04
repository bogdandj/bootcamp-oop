/*2. Napisati program koji simulira korigovanje jacine zvuka na jutjubu.Podrazumevana vrednost za jacinu zvuka,
u trenutku kada se ucita video, je 75%. Korisnik unosi akcije koje uticu na jacinu zvuka sve dok ne unese PLAY.
Dozvoljene akcije su:
up - akcija povecava jacinu zvuka za 10%
down - akcija smanjuje jacinu zvuka za 10%
mute - akcije postavlja jacinu zvuka na 0%
Jacina zvuka u bilo kom trenutku maksimalno moze biti 100% i minimalno 0%.Na kraju programa ispisati jacinu zvuka.*/


package test;

import java.util.Scanner;

public class zad2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double zvuk = 75;
		double akcija = 10;
		String komanda = "dummy";

		while (!komanda.equals("play")) {
			System.out.println("Unesite komand up, down, mute ili play");
			komanda = s.next();
			if (komanda.equals("up")) {
				zvuk = zvuk + akcija;
			} else if (komanda.equals("down")) {
				zvuk = zvuk - akcija;
			} else if (komanda.equals("mute")) {
				zvuk = 0;
			}
			if (zvuk + akcija> 100) {
				zvuk = 100;
			} else if (zvuk + akcija < 0) {
				zvuk = 0;
			}

		}
		System.out.println(zvuk);

	}
}

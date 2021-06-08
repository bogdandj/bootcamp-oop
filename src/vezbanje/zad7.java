package vezbanje;

import java.util.Scanner;

public class zad7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 0;
		System.out.println("Unesite duzina intervala");
		int interval = s.nextInt();

		System.out.println("Unesite duzinu videa");
		int video = s.nextInt();

		int minut = 0;
		int sekund = 0;

		while (x + interval < video) {
			x += interval;
			minut = x / 60;
			sekund = x - 60*minut;
			System.out.println(minut + ":" + sekund);
		}
	}

}

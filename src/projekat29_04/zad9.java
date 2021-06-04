package projekat29_04;

import java.util.Scanner;

public class zad9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] brojevi = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int a;

		for (int i = 1; i < brojevi.length; i++) {

			System.out.println("Unesite broj");
			a = s.nextInt();
			brojevi[i] = a;
			}
		
		for (int i = 1; i < brojevi.length; i++) {
			System.out.println(brojevi[i]);
	
		}
	}
}

		

package projekat27_04;

import java.util.Scanner;

public class zad10 {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite N");
		int n = s.nextInt();
		int suma = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Unesite broj");
			int broj = s.nextInt();
			suma = suma + broj;

		}
		
		System.out.println("Suma je " + suma);

	}

}

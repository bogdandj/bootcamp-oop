package vezbanje;

import java.util.Scanner;

public class zad3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] niz = new int[10];
		
		System.out.println("Unesite duzinu niza");
		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
		System.out.println("Unesite broj");
		int k = s.nextInt();
		niz[k] = niz[k] + 1;
		}
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
		
	}

}

package projekat27_04;

import java.util.Scanner;

public class zad9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite N");
		int n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Unesite broj");
			int broj = s.nextInt();
			System.out.println("Uneti broj je " + broj);

		}

	}

}

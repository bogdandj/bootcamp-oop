package vezbanje;

import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {
		
		int max = 0;
		Scanner s = new Scanner(System.in);

		System.out.println("Unesite N");
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite broj");
			int x = s.nextInt();
			if (x > max) {
				max = x;
			} else if (x < 0 && max == 0) {
				max = x;
			}
		}
		System.out.println(max);
	}

}

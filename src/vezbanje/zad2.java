package vezbanje;

import java.util.Scanner;

public class zad2 {

	public static void main(String[] args) {

		int max = 0;
		int min = 0;
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		while (x != 0) {
			System.out.println("Unesite broj");
			x = s.nextInt();
			if (x > max) {
				max = x;
			} else if (x < 0 && max == 0) {
				max = x;
			}

			if (x < min) {
				min = x;
			} else if (x > 0 && min == 0) {
				min = x;
			}
		}
		System.out.println(min + " " + max);
	}

}

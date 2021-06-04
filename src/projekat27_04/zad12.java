package projekat27_04;

import java.util.Scanner;

public class zad12 {

	public static void main(String[] args) {
		
		int min = 1000000;
		Scanner s = new Scanner(System.in);
		System.out.println("Unesi N");
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Unesi broj");
			int broj = s.nextInt();

			if (broj < min) {
				min = broj;
			}
		}
	
		System.out.println(min);
		
		
		
		
	}

}

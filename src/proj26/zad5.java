package proj26;

import java.util.Scanner;

public class zad5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite mesec rodjenja");
		int a = s.nextInt();
		
		if (a > 12 || a < 1) {
			System.out.println("Mesec je nevalidan");
		}

		System.out.println("Kraj");
	}

}

package proj26;

import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Unesite A");
		int a = s.nextInt();

		System.out.println("Unesite B");
		int b = s.nextInt();
		
		System.out.println("Unesite C");
		int c = s.nextInt();

		if ( a*a + b*b == c*c) {
			System.out.println("Trougao je pravougli");
		}

		System.out.println("Kraj");

	}

}

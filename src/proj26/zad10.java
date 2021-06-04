//10.Napisati program koji za dva uneta broj a i b proverava da li je a deljiv sa b.


package proj26;

import java.util.Scanner;

public class zad10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesti A");
		int a = s.nextInt();
		
		System.out.println("Unesti B");
		int b = s.nextInt();
		
		if (a % b == 0) {
			System.out.println("Brojevi su deljivi");
		}
		else {
			System.out.println("Brojevi su nedeljivi");
		}

	}

}

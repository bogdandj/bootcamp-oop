package proj26;

import java.util.Scanner;

public class zad7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Uneti mesec");
		int a = s.nextInt();

		if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
			System.out.println("Mesec ima 31 dan");
		} else if (a == 4 || a == 6 || a == 9 || a == 11) {
			System.out.println("Mesec ima 30 dana");
		} else {
			System.out.println("Mesec ima 28 dana");
		}

	}

}

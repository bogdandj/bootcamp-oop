package proj26;

import java.util.Scanner;

public class zad8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		if (a % 2 == 0 && a % 3 == 0) {
			System.out.println("Deljiv sa 2 i 3");
		}
		
	}

}

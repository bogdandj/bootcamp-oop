package projekat27_04;

import java.util.Scanner;

public class zad7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesti A");
		int a = s.nextInt();
		
		System.out.println("Unesite B");
		int b = s.nextInt();
		
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}


	}

}

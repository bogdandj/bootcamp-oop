package projekat_28_04;

import java.util.Scanner;

public class zad2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unestite broj");
		int broj = s.nextInt();
		
		while (broj != 0) {
			System.out.println("Unestite broj");
			broj = s.nextInt();
			
		}
		
		System.out.println("Kraj");
	}

}
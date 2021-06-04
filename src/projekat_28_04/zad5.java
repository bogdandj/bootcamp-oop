package projekat_28_04;

import java.util.Scanner;

public class zad5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = 1;
		int n = 0;

		while (n != 2) {
			
			System.out.println("Unesite broj");
			a = s.nextInt();
			
			
			if(a == 0) {
				n++;
			}
			
		}
	}

}

package projekat_28_04;

import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite N");
		int n = s.nextInt();
		int par = 0;
		int e = 0;
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Unesite broj");
			int broj = s.nextInt();
			
			if (broj%2==0) {
				par++;
			}
			else {
				e++;
			}
			
		}
		
		System.out.println(par);
		System.out.println(e);

	}

}

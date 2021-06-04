package proj26;

import java.util.Scanner;

public class zad3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite ime");
		String ime = s.next();
		
		System.out.println("Unesite godinu rodjenja");
		int rodj = s.nextInt();
		
		int c = 2021 - rodj;
	
		
		System.out.println(ime + ", " + c);

	}

}

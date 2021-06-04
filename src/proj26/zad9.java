/*9.Zadatak (Za vezbanje)
Napisati program koji pomaze kupovini. Program ucitava vrednosti:
pol (M ili Z)
da li je proizvod prirodan (true/false)
popust
da li je proizvod neophodan (true/false)
Ukoliko je muskarac i proizvod je neophodan, proizvod se kupuje.
Ukoliko je cura i proizvod je na popustu(veci od 0) i prirodan je, nezavisno da li je neophodan proizvod se kupuje.

Unesite pol: M
Da li je prirodan: true
Da li je neophodan: true
Popust: 10
Proizvod se kupuje

Unesite pol: Z
Da li je prirodan: true
Da li je neophodan: false
Popust: 10
Proizvod se kupuje*/




package proj26;

import java.util.Scanner;

public class zad9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite pol");
		String pol = s.next();
		
		System.out.println("Da li je proizvod prirodan");
		boolean natural = s.nextBoolean();
		
		System.out.println("Da li je proizvod neophodan");
		boolean necessary = s.nextBoolean();
		
		System.out.println("Popust");
		int discount = s.nextInt();
		
		if (pol.equals("M") && necessary == true) {
			System.out.println("Proizvod se kupuje");
		}
		
		else if (pol.equals("Z") && natural == true && discount > 0) {
			System.out.println("Proizvod se kupuje");
		}
		
		
		

	}

}

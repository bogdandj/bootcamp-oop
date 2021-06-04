/*Napisati program za potrebe agencije za nekretnine. Potrebno je sracunati mesecnu zaradu radnika
tako sto za svaki:
prodati stan, radnik ima 3%
prodati lokal, radnik ima 2%
prodato zemljiste, radnik ima 1%
Korisnik unosi ime radnika kao i broj prodaja koje je izvrsio prethodnog meseca.
Za svaku prodaju unosi se cifra koja je ostvarena pri prodaji kao i tip.Na kraju programa
odstampati platu radnika.
*/

package projekat_28_04;

import java.util.Scanner;

public class zad6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite ime");
		String ime = s.next();
		
		System.out.println("Unesite broj prodaja");
		int brojProdaja = s.nextInt();
		
		double zarada = 0;
		double ukupnaZarada = 0;
		
	
		for (int i = 0; i<brojProdaja; i++) {
			System.out.println("Unesite cenu");
			int cenaProdaje = s.nextInt();
			
			System.out.println("Unesite tip nekretnine");
			String tipProdaje = s.next();
			
			switch(tipProdaje) {
			  case "stan":
			    zarada = cenaProdaje * 0.03;
			    break;
			    
			  case "lokal":
				  zarada = cenaProdaje * 0.02;
			    break;
			    
			  case "zemljiste":
				  zarada = cenaProdaje * 0.01;
				  break;
				  
				  
			}
			ukupnaZarada = ukupnaZarada + zarada;
			
		}
		
		System.out.println(ukupnaZarada);

	}

}

/*1. Napisati program koji za unetu visinu i težinu osobe računa indeks telesne 

mase (BMI) i na osnovu tog rezultata osobu raspoređuje u jednu od četiri kategorije. BMI se računa po formuli 
BMI = tezina u kg(visina u m)2
dok se kategorija određuje prema tabeli 1.1. 

Tabela 1.1 Određivanje kategorije na osnovu indeksa telesne mase 

Primer izvrsenja: Unesite tezinu osobe (kg): 110 
Unesite visinu osobe (m): 1.9 
Kategorija je Gojaznost 
*/

package test;

import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {
		String kategorija = "dummy";
		double bmi = 0;
		Scanner s = new Scanner(System.in);

		System.out.println("Unesite visinu osobe (m)");
		double visina = s.nextDouble();

		System.out.println("Unesite tezinu osobe (kg)");
		double tezina = s.nextDouble();

		bmi = tezina / (visina * visina);

		if (bmi < 18.5) {
			kategorija = "Neuhranjenost";
		} else if (bmi >= 18.5 && bmi <= 24.99) {
			kategorija = "Normalna tezina";
		} else if (bmi >= 25 && bmi <= 29.99) {
			kategorija = "Prekomerna tezina";
		} else if (bmi > 30) {
			kategorija = "Gojaznost";
		}
		
		System.out.println("Vasa kategorija je: " + kategorija);
	}

}

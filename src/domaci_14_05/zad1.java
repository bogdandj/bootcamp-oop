/*Kreirati klasu Autor koja ima
-ime i prezime
-konstuktore koje mislite da su vam potrebni
-gettere i settere za atribute
-metodu print koja stampa u formatu:
(ime autora) (prezime autora)

Kreirati klasu Knjiga koji ima:
-ISBN
-naziv
-godina izdanja
-autor
-konstuktore koje mislite da su vam potrebni
-gettere i settere za atribute
-metodu print koja stampa u formatu (izbegavati dupliranje koda):
(ISBN)
(naziv) - (godina izdanja)
autor: (ime autora) (prezime autora) 

	U glavnom programu napraviti vise autora sa vise knjiga.*/



package domaci_14_05;

public class zad1 {

	public static void main(String[] args) {
		Autor autor1 = new Autor("Umberto Eko");
		Autor autor2 = new Autor("Vilijam Sekspir");

		Knjiga knjiga1 = new Knjiga("7293-12670-41613", "Ime ruze", 1980, autor1);
		Knjiga knjiga2 = new Knjiga("1110-1850-99015", "Nulti broj", 2015, autor1);
		knjiga1.print();
		System.out.println("\n");
		knjiga2.print();

		Knjiga knjiga3 = new Knjiga("5513-9990-48134", "Hamlet", 1602, autor2);
		Knjiga knjiga4 = new Knjiga("1512-0005-45101", "Otelo", 1604, autor2);
		Knjiga knjiga5 = new Knjiga("9600-5148-14510", "Magbet", 1605, autor2);
		System.out.println("\n");
		knjiga3.print();
		System.out.println("\n");
		knjiga4.print();
		System.out.println("\n");
		knjiga5.print();

	}

}
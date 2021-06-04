/*(Za vezbanje) 
2. Zadatak
Kreirati klasu Karton koja ima:
tip kartona (crveni, zuti)
konstuktore za koje mislite da ce vam trebati
gettere i settere za karton
	
Kreirati klasu Osoba koja ima:
ime i prezime
jmbg
godinu rodjenja
default-ni konstuktor
konstuktor sa parametrima
gettere i settere 
metodu stampaj koja stampa u formatu:
(ime i prezime), (jmbg), (godina rodjenja)

Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
broj (broj koji igrac nosi)
poziciju koju igra (odbrambeni, napadac, … )
niz kartona
kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
default-ni konstuktor
konstuktor sa parametrima
gettere i settere za broj, kapiten i poziciju
metodu dodaj karton, gde se dodaje karton u niz
metodu koja vraca broj zutih kartona
metodu koja vraca broj crvenih kartona
metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu


U glavnom programu kreirati igraca i dodati mu nekoliko kartona.
*/


package domaci_20_05;

public class zad2 {

	public static void main(String[] args) {
		
		Player2 player = new Player2("Bogdan Djuric", "3215315616", 1995, 7, "CB", true);
		
		Card card1 = new Card("red");
		Card card2 = new Card("yellow");
		Card card3 = new Card("yellow");
		Card card4 = new Card("yellow");
		Card card5 = new Card("yellow");
		Card card6 = new Card("red");
		
		
		player.addCard(card1);
		player.addCard(card2);
		player.addCard(card3);
		player.addCard(card4);
		player.addCard(card5);
		player.addCard(card6);
		
		

		player.print();

	}

}

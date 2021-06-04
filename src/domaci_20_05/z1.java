/*1.Zadatak
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
kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
default-ni konstuktor
konstuktor sa parametrima
gettere i settere za broj, kapiten i poziciju
metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
godine iskustva
tip trenera (kondicioni, za igru, pomocni, personalni)
metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.*/


package domaci_20_05;

public class z1 {

	public static void main(String[] args) {
		
		Player player = new Player("Bogdan Djuric", "481851818", 1995, 7, "CB", true);
		Player player2 = new Player("Pera Peric", "25912296092", 1997, 5, "MF", false);
		
		Coach coach = new Coach("Jirgen Klop", "59199121652", 1970, 15, "Game Coach");
		Coach coach2 = new Coach("Dejan Stankovic", "9591291852", 1977, 2, "Game Coach");
		
		player.print();
		player2.print();
		
		coach.print();
		coach2.print();

	}

}

package domaci_20_05;

import java.util.ArrayList;
import java.util.Scanner;

import domaci_17_05.GreenCard;

public class z2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<Player> players = new ArrayList<Player>();
		
		System.out.println("Unesite: 'Ime igraca', 'JMBG', 'Godiste', 'Broj na dresu', 'Poziciju', 'Da li je kapiten'");
		
		Player player = new Player(s.next(), s.next(), s.nextInt(), s.nextInt(), s.next(), s.nextBoolean());
		Player player2 = new Player(s.next(), s.next(), s.nextInt(), s.nextInt(), s.next(), s.nextBoolean());
		Player player3 = new Player(s.next(), s.next(), s.nextInt(), s.nextInt(), s.next(), s.nextBoolean());


		
		players.add(player);
		players.add(player2);
		players.add(player3);
		
		for (int i = 0; i < players.size(); i++) {
			players.get(i).print();
		}

		
		ArrayList<Coach> coaches = new ArrayList<Coach>();
		
		System.out.println("Unesite: 'Ime trenera', 'JMBG', 'Godiste', 'Godine iskustva', 'Tip trenera'");
		
		Coach coach = new Coach(s.next(), s.next(), s.nextInt(), s.nextInt(), s.next());
		Coach coach2 = new Coach(s.next(), s.next(), s.nextInt(), s.nextInt(), s.next());
		Coach coach3 = new Coach(s.next(), s.next(), s.nextInt(), s.nextInt(), s.next());

		coaches.add(coach);
		coaches.add(coach2);
		coaches.add(coach3);
		
		for (int i = 0; i < coaches.size(); i++) {
			coaches.get(i).print();
		}
	}

}

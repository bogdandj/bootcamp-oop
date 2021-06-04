package domaci_17_05;

import java.util.ArrayList;

public class z1 {

	public static void main(String[] args) {

		ArrayList<GreenCard> cards = new ArrayList<GreenCard>();

		GreenCard card1 = new GreenCard("Bogdan Djuric", "159/10", "Java", "Milan Jovanovic", 6);
		GreenCard card2 = new GreenCard("Pera Peric", "122/10", "JavaScript", "Jovan Markovic", 10);
		GreenCard card3 = new GreenCard("Mita Mitic", "255/10", "C", "Darko Saric", 7);
		GreenCard card4 = new GreenCard("Milos Milosevic", "420/10", "C#", "Dejan Dragic", 6);
		GreenCard card5 = new GreenCard("Milic Milic", "11/10", "PHP", "Dragan Milosevic", 9);
		GreenCard card6 = new GreenCard("Stefan Stefanovic", "301/10", "HTML", "Milomir Jankovic", 5);
		GreenCard card7 = new GreenCard("Uros Urosevic", "222/10", "CSS", "Branislav Ristic", 8);
		GreenCard card8 = new GreenCard("Janko Jankovic", "84/10", "React", "Bojan Bojanic", 5);
		GreenCard card9 = new GreenCard("Ivan Ivanic", "73/10", "Angular", "Vladimir Minic", 8);
		GreenCard card10 = new GreenCard("Jovan Jovanovic", "55/10", "Flutter", "Uros Ilic", 10);

		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);
		cards.add(card6);
		cards.add(card7);
		cards.add(card8);
		cards.add(card9);
		cards.add(card10);

		for (int i = 0; i < cards.size(); i++) {
			cards.get(i).print();
		}

		System.out.println(average(cards));
		System.out.println(avgPass(cards));

	}

	public static double average(ArrayList<GreenCard> cards) {
		int sum = 0;
		for (int i = 0; i < cards.size(); i++) {
			sum = sum + cards.get(i).getMark();
		}
		return sum / cards.size();

	}

	public static double avgPass(ArrayList<GreenCard> cards) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < cards.size(); i++) {
			if (cards.get(i).getMark() > 5) {
				sum = sum + cards.get(i).getMark();
				count++;
			}

		}
		return sum / count;
	}
}

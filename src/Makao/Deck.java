package Makao;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	protected Random randomGenerator;
	ArrayList<Card> cards = new ArrayList<Card>();

	public Deck() {
		cards.add(new Card("1", "herc"));
		cards.add(new Card("1", "pik"));
		cards.add(new Card("1", "karo"));
		cards.add(new Card("1", "tref"));

		cards.add(new Card("2", "herc"));
		cards.add(new Card("2", "pik"));
		cards.add(new Card("2", "karo"));
		cards.add(new Card("2", "tref"));
		cards.add(new Card("3", "herc"));
		cards.add(new Card("3", "pik"));
		cards.add(new Card("3", "karo"));
		cards.add(new Card("3", "tref"));
		cards.add(new Card("4", "herc"));
		cards.add(new Card("4", "pik"));
		cards.add(new Card("4", "karo"));
		cards.add(new Card("4", "tref"));
		cards.add(new Card("5", "herc"));
		cards.add(new Card("5", "pik"));
		cards.add(new Card("5", "karo"));
		cards.add(new Card("5", "tref"));
		cards.add(new Card("6", "herc"));
		cards.add(new Card("6", "pik"));
		cards.add(new Card("6", "karo"));
		cards.add(new Card("6", "tref"));
		cards.add(new Card("7", "herc"));
		cards.add(new Card("7", "pik"));
		cards.add(new Card("7", "karo"));
		cards.add(new Card("7", "tref"));
		cards.add(new Card("8", "herc"));
		cards.add(new Card("8", "pik"));
		cards.add(new Card("8", "karo"));
		cards.add(new Card("8", "tref"));
		cards.add(new Card("9", "herc"));
		cards.add(new Card("9", "pik"));
		cards.add(new Card("9", "karo"));
		cards.add(new Card("9", "tref"));
		cards.add(new Card("10", "herc"));
		cards.add(new Card("10", "pik"));
		cards.add(new Card("10", "karo"));
		cards.add(new Card("10", "tref"));
		cards.add(new Card("A", "herc"));
		cards.add(new Card("A", "pik"));
		cards.add(new Card("A", "karo"));
		cards.add(new Card("A", "tref"));
		cards.add(new Card("J", "herc"));
		cards.add(new Card("J", "pik"));
		cards.add(new Card("J", "karo"));
		cards.add(new Card("J", "tref"));
		cards.add(new Card("Q", "herc"));
		cards.add(new Card("Q", "pik"));
		cards.add(new Card("Q", "karo"));
		cards.add(new Card("Q", "tref"));
		cards.add(new Card("K", "herc"));
		cards.add(new Card("K", "pik"));
		cards.add(new Card("K", "karo"));
		cards.add(new Card("K", "tref"));
		
		cards = new ArrayList<Card>();
        randomGenerator = new Random();
	}


	public Card takeRandomCard() {
		int index = randomGenerator.nextInt(cards.size());
		Card card = cards.get(index);
		System.out.println("Managers choice this week" + card + "our recommendation to you");
		return card;
	}
	
	

}

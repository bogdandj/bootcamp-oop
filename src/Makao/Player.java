package Makao;

import java.util.ArrayList;

public class Player {

	protected String name;
	ArrayList<Card> cards = new ArrayList<Card>();

	public Player(String name) {
		super();
		this.name = name;
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public boolean doesCardExist(String number, String symbol) {
		for (int i = 0; i < cards.size(); i++) {
			if (this.cards.get(i).getNumber().equals(number) && this.cards.get(i).getSymbol().equals(symbol)) {
				return true;
			}
		}

		return false;

	}

	public Card playCard(String number, String symbol) {
		for (int i = 0; i < cards.size(); i++) {
			if (this.cards.get(i).getNumber().equals(number) && this.cards.get(i).getSymbol().equals(symbol)) {
				this.cards.remove(i);
				return this.cards.get(i);
			}

		}
		return null;

	}
	
	public void print() {
		System.out.println("[ " + this.name + " ]");
		System.out.println("[ " + this.cards);
	}
}

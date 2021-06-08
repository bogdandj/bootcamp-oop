package Makao;

import java.util.ArrayList;
import java.util.Random;

public class Makao {

	protected Random randomGenerator;
	ArrayList<Deck> decks = new ArrayList<Deck>();
	ArrayList<Player> players = new ArrayList<Player>();
	ArrayList<Card> playedCards = new ArrayList<Card>();
	protected int index;

	public void setIndex(int index) {
		this.index = index;
	}

	public Makao(ArrayList<Deck> decks) {
		super();
		this.decks = decks;
		randomGenerator = new Random();
	}

	public void joinGame(Player player1) {
		players.add(player1);
	}

/*	public void giveCards() {

		int index = randomGenerator.nextInt(decks.size());
		Deck deck = decks.get(index);

		return card;

	}*/

	public void nextPlayer() {
		this.setIndex(index + 1);
	}

	public boolean endGame() {
		for (int i = 0; i < players.size(); i++) {
			if (this.players.get(i).getCards() == null) {
				return true;
			}

		}
		return false;
	}

	public Player winner() {
		for (int i = 0; i < players.size(); i++) {
			if (this.players.get(i).getCards() == null) {
				return players.get(i);
			}
		}
		return null;

	}
	
/*	public Player takeACard() {
		
	}*/
	
	public void playMakao(String number, String symbol) {
	}
}

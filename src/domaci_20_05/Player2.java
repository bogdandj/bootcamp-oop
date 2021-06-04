package domaci_20_05;

import java.util.ArrayList;

public class Player2 extends Person2{
	
	private int number;
	private String position;
	private ArrayList<Card> cards = new ArrayList<Card>();
	private boolean captain;
	
	public Player2() {
	}

	public Player2(String fullName, String jmbg, int birthYear, int number, String position,
			boolean captain) {
		super(fullName, jmbg, birthYear);
		this.number = number;
		this.position = position;
		this.captain = captain;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public boolean isCaptain() {
		return captain;
	}

	public void setCaptain(boolean captain) {
		this.captain = captain;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public int yellowCards() {
		int count = 0;
		for (int i = 0; i < cards.size(); i++) {
			if(cards.get(i).getType().equals("yellow")) {
				count++;
			}
		}
		return count;
	}
	
	public int redCards() {
		int count = 0;
		for (int i = 0; i < cards.size(); i++) {
			if(cards.get(i).getType().equals("red")) {
				count++;
			}
		}
		return count;
	}
	
	@Override
	public void print() {
		System.out.println(this.fullName + " " + this.jmbg + " " + this.birthYear);
		System.out.println(this.number + " " + this.position + " " + yellowCards() + " " + redCards() + " " + this.captain);
	}
	
	

}

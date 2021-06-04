package Makao;

public class Card {
	
	protected String number;
	protected String symbol;
	
	public Card(String number, String symbol) {
		super();
		this.number = number;
		this.symbol = symbol;
	}
	public String getNumber() {
		return number;
	}
	public String getSymbol() {
		return symbol;
	}
	
	public void print() {
		System.out.println("[ " + this.symbol + " " + this.number + " ]");
	}
	
	public boolean isPossibleToPutCard(String number, String symbol) {
		if(this.number.equals(number)|| this.symbol.equals(symbol)) {
			return true;
		} else {
			return false;
		}
	}
	
	

}

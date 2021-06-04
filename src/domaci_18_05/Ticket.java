
package domaci_18_05;

import java.util.ArrayList;

public class Ticket {
	
	ArrayList<Combination> combinations = new ArrayList<Combination>();
	
	public void addCombination(Combination combination) {
		combinations.add(combination);
	}
	
	public boolean winningCombination(Combination winningCombination) {
		
		for (int j = 0; j < combinations.size(); j++) {
			if(combinations.get(j).match(winningCombination));
			return true;
		}
		return false;
	}
	
	public void print() {
		for (int j = 0; j < combinations.size(); j++) {
		System.out.println("ID: " + this.combinations.get(j).getId());
		System.out.print("Numbers: " + this.combinations.get(j).getNumbers());
		}
		
	}

}
package domaci_18_05;

import java.util.ArrayList;

public class Combination {

	protected String id;
	protected ArrayList<Integer> numbers = new ArrayList<Integer>();

	public Combination(String id) {
		super();
		this.id = id;
		numbers.add(5);
		numbers.add(7);
		numbers.add(12);
		numbers.add(22);
		numbers.add(26);
		numbers.add(30);
		numbers.add(35);
	}

	public String getId() {
		return id;
	}

	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public boolean match(Combination x) {
		int count = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (x.numbers.get(i) == this.numbers.get(i)) {
				count++;
			}

		}
		if (count == 7)
			return true;
		else {
			return false;
		}
	}

	public void print() {
		System.out.println("ID: " + this.id);
		for (int j = 0; j < numbers.size(); j++) {
			System.out.print(numbers.get(j) + ", ");

		}

	}

}

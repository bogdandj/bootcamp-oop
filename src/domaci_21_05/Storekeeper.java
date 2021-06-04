package domaci_21_05;

import java.util.ArrayList;

public class Storekeeper extends Worker {
	
	


	
	public Storekeeper(String fullName) {
		super(fullName);
		// TODO Auto-generated constructor stub
	}

	private double avgSalary() {
		double sum = 0;
		for (int i = 0; i < this.sectors.size(); i++) {
			sum = sum + sectors.get(i).getSalary();
		}
		return sum/sectors.size() * 0.5;
	}
	
	@Override
	public double salary() {
		return avgSalary() * sectors.size();
	}

}

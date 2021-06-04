package domaci_21_05;

import java.util.ArrayList;

public class Menager extends Worker{
	
	


	public Menager(String fullName) {
		super(fullName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double salary() {
		double sum = 0;
		for (int i = 0; i < sectors.size(); i++) {
			sum = sum + sectors.get(i).getSalary();
		}
			return sum;
		}
		}
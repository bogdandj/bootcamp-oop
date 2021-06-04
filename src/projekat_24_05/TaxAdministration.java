package projekat_24_05;

import java.util.ArrayList;

public class TaxAdministration {
	
	protected String city;
	ArrayList<Objekat> objects = new ArrayList<Objekat>();
	
	
	public void addObject(Objekat object) {
		objects.add(object);
	}
	
	public Objekat highestTax() {
		Objekat highest = objects.get(0);
		for (int i = 0; i < objects.size(); i++) {
			if (objects.get(i).tax() > highest.tax()) {
				return objects.get(i);
			}
		}
		return highest;
	}
	
	public Objekat lowestTax() {
		Objekat lowest = objects.get(0);
		for (int i = 0; i < objects.size(); i++) {
			if (objects.get(i).tax() < lowest.tax()) {
				return objects.get(i);
			}
		}
		return lowest;
	}
	
	public void sumTax() {
		double sum = 0;
		for (int i = 0; i < objects.size(); i++) {
			sum = sum + objects.get(i).tax();
		}
	}
	
	public void print() {
		for (int i = 0; i < objects.size(); i++) {
			System.out.println(objects.get(i).getClass());
			
		}
	}

	public TaxAdministration(String city) {
		super();
		this.city = city;
	}
	
	

}

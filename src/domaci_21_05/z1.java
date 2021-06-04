package domaci_21_05;

import java.util.ArrayList;


public class z1 {

	public static void main(String[] args) {
		ArrayList<Sector> sec = new ArrayList<Sector>();
		Sector sector1 = new Sector("Sector A", 50000);
		Sector sector2 = new Sector("Sector B", 80000);
		

		Worker menager1 = new Menager("Bogdan Djuric");
		Worker store1 = new Storekeeper("Bogdan Peric");
		
		sec.add(sector1);
		sec.add(sector2);
		
		System.out.println(menager1.salary());
		System.out.println(store1.salary());
	}

}

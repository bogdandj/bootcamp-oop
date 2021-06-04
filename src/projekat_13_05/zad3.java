package projekat_13_05;

public class zad3 {

	public static void main(String[] args) {
		Radnik radnik1 = new Radnik(5423201);

		
		Radnik radnik2 = new Radnik(24105151, "Bogdan", 0, 5, 2);
		radnik2.setBrojDece(5);
		System.out.println(radnik2.getBrojDece());
	}

}

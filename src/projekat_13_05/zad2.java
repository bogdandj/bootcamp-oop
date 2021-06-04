package projekat_13_05;

public class zad2 {

	public static void main(String[] args) {
		Spomenik spomenik1 = new Spomenik();
		spomenik1.imeSpomenika = "V3";
		spomenik1.otvoreno = true;
		spomenik1.grad = "Kragujevac";

		spomenik1.stampaj();

		Spomenik spomenik2 = new Spomenik("Pobednik", true, "Beograd");
		spomenik2.stampaj();
	}

}

package projekat06_05;

public class zad6 {

	public static void main(String[] args) {

		transakcija("8451-819-230", "548-310-7863", 5300, 3700);

	}

	public static void transakcija(String salje, String prima, int stanje, int iznos) {
		if (iznos + iznos * 0.05 <= stanje) {
			System.out.println("Transakcija je moguca");
		} else {
			System.out.println("Transakcija nije moguca");
		}

	}
}

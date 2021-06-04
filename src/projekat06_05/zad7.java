package projekat06_05;

public class zad7 {

	public static void main(String[] args) {
		double ke = kurs("EUR");
		double ka = kurs("AUD");
		
		System.out.println(ke);
		System.out.println(ka);
	}
	
	
	public static double kurs(String valuta) {
		double k = 0;
		if (valuta.equals("EUR")) {
			k = 118.5;
		} else if (valuta.equals("AUD")) {
			k = 76.12;
		}
		
		return k;	
	}

}
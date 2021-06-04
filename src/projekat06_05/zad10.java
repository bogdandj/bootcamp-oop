package projekat06_05;

public class zad10 {

	public static void main(String[] args) {

		String x = podaci("Bogdan", "Vladimir", "Djuric");
		System.out.println(x);
		

	}

	public static String podaci (String ime, String imeOca, String prezime) 
	{
		String a = ime + ", " + imeOca + ", " + prezime;
		return a;
	}
}

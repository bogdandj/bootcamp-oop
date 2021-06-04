package projekat06_05;

public class zad11 {

	public static void main(String[] args) {

		double x = konverzija (10, "cm");
		System.out.println(x);
		

	}

	public static double konverzija (double mera, String jedinica) 
	{
		double z = 0;
		if (jedinica.equals("cm")) {
			z = mera * 100;
		} else if (jedinica.equals("dm")) {
			z = mera * 10;
		} else if (jedinica.equals("km")) {
			z = mera * 0.001;
		}
		
		return z;
		
		
		
	}
}

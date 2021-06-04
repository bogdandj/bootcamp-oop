package vezbanje;

import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {

		System.out.println(provizija("MasterCard"));
	}
		public static double provizija(String kartica) {
			double x = 0;
			if (kartica.equals("MasterCard")) {
				x = 1;
			}
			else if (kartica.equals("VisaCard")) {
				x = 1.2;
			}
			else if (kartica.equals("AmericanExpress")) {
				x = 0.02;
			}
			return x;
		}
	

}

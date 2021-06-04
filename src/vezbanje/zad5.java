package vezbanje;

import java.util.Scanner;

public class zad5 {

	public static void main(String[] args) {

		System.out.println(popust(250, 40));
	}
		public static double popust(double c, double p) {
			return c - (c * p/100);
		}
	

}

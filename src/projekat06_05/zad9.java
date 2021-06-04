package projekat06_05;

public class zad9 {

	public static void main(String[] args) {

		int x = brojevi("VIII");
		System.out.println(x);
		

	}

	public static int brojevi (String rimski) {
		int arapski = 0;
		if (rimski.equals("I")) {
			arapski = 1;
		} else if (rimski.equals("I")) {
			arapski = 1;
		} else if (rimski.equals("II")) {
			arapski = 2;
		} else if (rimski.equals("III")) {
			arapski = 3;
		} else if (rimski.equals("IV")) {
			arapski = 4;
		} else if (rimski.equals("V")) {
			arapski = 5;
		} else if (rimski.equals("VI")) {
			arapski = 6;
		} else if (rimski.equals("VII")) {
			arapski = 7;
		} else if (rimski.equals("VIII")) {
			arapski = 8;
		} else if (rimski.equals("IX")) {
			arapski = 9;
		} else if (rimski.equals("X")) {
			arapski = 10;
		}
		return arapski;

	}
}

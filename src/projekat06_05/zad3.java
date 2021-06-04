package projekat06_05;

public class zad3 {

	public static void main(String[] args) {
		
		stampajApsolutnuVrednost(5);
		stampajApsolutnuVrednost(10);
		stampajApsolutnuVrednost(-3);
		stampajApsolutnuVrednost(100);
		stampajApsolutnuVrednost(0);
		
		

	}
	
	public static void stampajApsolutnuVrednost(int a) {
		if (a < 0) {
			a = a * (-1);
		}
		System.out.println(a);
	}

}

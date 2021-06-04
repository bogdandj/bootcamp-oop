package projekat06_05;

public class zad5 {

	public static void main(String[] args) {
		
		stampajBrojeve(4, 15);
		

	}
	
	public static void stampajBrojeve(int start, int kraj) {
		for (int i = start; i <= kraj; i++) {
			System.out.print(i + ", ");
		}
	}
}

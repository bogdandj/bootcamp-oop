package projekat29_04;

public class zad3 {

	public static void main(String[] args) {
		int[] brojevi = {1, 2, 3, 4, 5};
		int a = brojevi[4];
		brojevi[4] = brojevi[0];
		brojevi[0] = a;
		
		System.out.println(brojevi[0]);
		System.out.println(brojevi[4]);

	}

}

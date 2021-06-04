package projekat07_05;

public class zad8 {

	public static void main(String[] args) {
		String[] reakcije = { "lol", "heart", "lol", "like", "heart", "lol", "sunglasses" };

		int x = broj(reakcije, "lol");
		System.out.println(x);
	}

	public static int broj(String[]niz, String emoji) {
		int count = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i].equals(emoji)) {
				count++;
			}
		}
		return count;
	}

}
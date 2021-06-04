package projekat_14_05;

public class zad2 {

	public static void main(String[] args) {
		Korisnik kreator = new Korisnik("Bogdan", "Djuric");
		
		FacebookPost post = new FacebookPost("Blabla");

		post.setKreator(kreator);
		post.stampaj();
	}

}

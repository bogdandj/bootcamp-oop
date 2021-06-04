package projekat07_05;

public class zad7 {

	public static void main(String[] args) {
		String[] korisnici = { "Milos Milosevic", "Ivan Ivanic", "Marko Markovic", "Uros Urosevic" };

		boolean pregled = story(korisnici, "Petar");
		System.out.println(pregled);
		
	}

	public static boolean story(String[] niz1, String ime) {
		boolean video = false;
		for(int i = 0; i < niz1.length; i++) {
			if(niz1[i].equals(ime)) {
				video = true;
			
			}
		}
		
		
		return video;
	}

}

package projekat_14_05;

public class zad1 {

	public static void main(String[] args) {
		Film film1 = new Film("Avatar", 2009);
			

			
			Reziser reziser1 = new Reziser("Srdan Golubovic", 1975);
			reziser1.stampaj();
			
			film1.setRezija(reziser1);
			film1.stampaj();
	}

}

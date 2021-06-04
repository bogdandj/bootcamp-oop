package projekat17_05;

public class zad2 {

	public static void main(String[] args) {
		FizickoLice prodavac = new FizickoLice("Bogdan Djuric", 952692, "20312051510");
		FizickoLice kupac = new FizickoLice("Pera Peric", 69548414, "87878151689", true);
		
		
		Ugovor ugovor = new Ugovor("17.05.2021.", prodavac, kupac, 58000, "Makedonska 3");
		ugovor.print();

	}

}

package projekat_24_05;

public class z1 {

	public static void main(String[] args) {
		Discipline disc1 = new Discipline("Long jump", "jumper");
		Discipline disc2 = new Discipline("110m hurdles", "runner");
		
		Athlete ath1 = new Runner("Bogdan Djuric", 12.32);
		Athlete ath2 = new Runner("Bogdan Djuric", 13.55);
		Athlete ath6 = new Runner("dsa", 6);
		
		Athlete ath3 = new Jumper("Pera Peric", 8.32);
		Athlete ath4 = new Jumper("Pera Peric", 9.55);
		Athlete ath5 = new Jumper("Pera Peric", 20.12);
		
		disc2.addAthlete(ath1);
		disc2.addAthlete(ath2);
		disc2.addAthlete(ath6);
		
		disc1.addAthlete(ath3);
		disc1.addAthlete(ath4);
		disc1.addAthlete(ath5);
		
		disc1.results();
		disc2.results();
		
	}

}

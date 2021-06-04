/*U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova
i istestirati sve metode i ispisati ukupnu cenu sa popustom.*/

package domaci_24_05;

public class z1 {

	public static void main(String[] args) {

		Cart packages = new Cart();

		Package tetra1 = new TetraPak("9591-1526", "Coffee", 100, 105, true, 100);
		Package tetra2 = new TetraPak("1110-8459", "Milk", 950, 980, true, 90);
		Package tetra3 = new TetraPak("5159-7760", "Cookies", 300, 310, false, 230);

		Package glass1 = new GlassPackaging("1501-0994", "Coke", 500, 510, 10, false, 65);
		Package glass2 = new GlassPackaging("9954-4216", "Beer", 330, 340, 30, true, 80);
		Package glass3 = new GlassPackaging("2021-7884", "Wine", 1000, 1050, 50, true, 700);

		SuperCard card1 = new SuperCard("4829-4981991", "Bogdan Djuric", 500);

		packages.addPackage(tetra1);
		packages.addPackage(tetra2);
		packages.addPackage(tetra3);

		packages.addPackage(glass1);
		packages.addPackage(glass2);
		packages.addPackage(glass3);

		packages.removePackage("1110-8459");

		card1.print();

		System.out.println("\n");

		tetra1.print();

		System.out.println("\n");

		glass1.print();

		System.out.println("\n");

		System.out.println("Vas ukupan racun sa Super Kartica popustom iznosi: " + packages.totalPriceWithCard(card1)
				+ " dinara.");
	}

}

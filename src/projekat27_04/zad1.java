package projekat27_04;

import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite dan");
		String dan = s.next();
		
		switch (dan) {
		case "Ponedeljak":
			System.out.println("Plati racune");
			System.out.println("Idi u nabavku");
			break;
		case "Utorak":
			System.out.println("Za ovaj dan nemate obaveza.");
			break;
		case "Sreda":
			System.out.println("Za ovaj dan nemate obaveza.");
			break;
		case "Cetvrtak":
			System.out.println("Za ovaj dan nemate obaveza.");
			break;
		case "Petak":
			System.out.println("Za ovaj dan nemate obaveza.");
			break;
		case "Subota":
			System.out.println("Za ovaj dan nemate obaveza.");
			break;
		case "Nedelja":
			System.out.println("Za ovaj dan nemate obaveza.");
			break;
	}

}
}
package projekat27_04;

import java.util.Scanner;

public class zad2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite mesec");
		int mesec = s.nextInt();
		
		switch (mesec) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		System.out.println("Mesec " + mesec + " ima 31 dan");
		break;
		
		case 4:
		case 6:
		case 9:
		case 11:
		System.out.println("Mesec " + mesec + " ima 30 dana");
		break;
		
		case 2:
		System.out.println("Mesec " + mesec + " ima 28 dana");
		break;
		
		}
	}

}

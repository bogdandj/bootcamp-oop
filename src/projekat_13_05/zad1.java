package projekat_13_05;

public class zad1 {

	public static void main(String[] args) {
		Tacka t1 = new Tacka();
		t1.x = 10;
		t1.y = 15;
		t1.f = "T1";
		t1.stampaj();
		
		Tacka t2 = new Tacka(10, 15);
		t2.stampaj();
		
		Tacka t3 = new Tacka("M", 11, 12);
		t3.stampaj();
		
	}

}
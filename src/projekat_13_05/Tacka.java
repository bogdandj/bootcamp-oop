package projekat_13_05;

public class Tacka {
	public String f;
	public int x;
	public int y;
	
	
	public int getx() {
		return this.x;
	}
	
	public int gety() {
		return this.y;
	}
	
	public String getf() {
		return this.f;
	}
	
	public void setx(int tackax) {
		this.x = tackax;
	}
	
	public void sety(int tackay) {
		this.y = tackay;
	}
	
	public void setx(String imeF) {
		this.f = imeF;
	}
	
	
	public void stampaj() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(f);
	}
	
	public Tacka() {
	}
	
	public Tacka(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Tacka(String f, int x, int y) {
		this.f = f;
		this.x = x;
		this.y = y;
	}
	
	
}

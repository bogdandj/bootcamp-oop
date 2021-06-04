package projekat_21_05;

public abstract class Shape {

	public abstract double surface();

	public abstract double volume();

	public void print() {
		System.out.println(surface());
		System.out.println(volume());
	}
}

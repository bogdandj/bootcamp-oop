package projekat_21_05;

public class Rectangle extends Shape {

	private double a;
	private double b;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double surface() {
		return a * b;
	}

	@Override
	public double volume() {
		return 2 * (a + b);
	}

}

package projekat_21_05;

public class EqualTriangle extends Shape{
	
	private double a;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	
	public EqualTriangle(double a) {
		super();
		this.a = a;
	}

	@Override
	public double surface() {
		return (a * a) * 1.73205 / 4;
	}

	@Override
	public double volume() {
		return 3*a;
	}
	
	

}

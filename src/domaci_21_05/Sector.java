package domaci_21_05;

public class Sector {
	
	private String name;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Sector(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	

}

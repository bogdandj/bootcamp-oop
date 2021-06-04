package projekat_20_05;

public class Professor extends Person {
	
	private String subjectName;
	private double salary;
	
	
	public String getSubjectName() {
		return subjectName;
	}


	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Professor(String name, String jmbg, String subjectName, double salary) {
		super(subjectName, jmbg);
		this.subjectName = subjectName;
		this.salary = salary;
	}
	
	public void salaryIncrease(double increasePercentage) {
		this.salary = this.salary + (this.salary*(increasePercentage/100));
	}
	
	@Override
	public void print() {
		System.out.println(this.name + ", " + this.jmbg);
		System.out.println(this.subjectName + ", " + this.salary);
		
	}

}

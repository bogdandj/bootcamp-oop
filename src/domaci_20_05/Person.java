package domaci_20_05;

public class Person {
	
	protected String fullName;
	protected String jmbg;
	protected int birthYear;
	
	public Person() {
		
	}

	public Person(String fullName, String jmbg, int birthYear) {
		super();
		this.fullName = fullName;
		this.jmbg = jmbg;
		this.birthYear = birthYear;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public void print() {
		System.out.println(this.fullName + " " + this.jmbg + " " + this.birthYear);
	}

}

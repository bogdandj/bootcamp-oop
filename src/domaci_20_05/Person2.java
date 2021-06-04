package domaci_20_05;

import java.util.concurrent.SynchronousQueue;

public class Person2 {

	protected String fullName;
	protected String jmbg;
	protected int birthYear;

	public Person2(String fullName, String jmbg, int birthYear) {
		super();
		this.fullName = fullName;
		this.jmbg = jmbg;
		this.birthYear = birthYear;
	}

	public Person2() {

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

package projekat_20_05;

public class Person {
	
	protected String name;
	protected String jmbg;
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJmbg() {
		return jmbg;
	}


	public Person() {
		
	}
	
	
	public Person(String name, String jmbg) {
		super();
		this.name = name;
		this.jmbg = jmbg;
	}
	
	public void print() {
		System.out.println(this.name + ", " + this.jmbg);
	}
	

}

package domaci_20_05;

public class Coach extends Person {
	
	private int yearExperience;
	private String type;
	public int getYearExperience() {
		return yearExperience;
	}
	public void setYearExperience(int yearExperience) {
		this.yearExperience = yearExperience;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Coach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coach(String fullName, String jmbg, int birthYear, int yearExperience, String type) {
		super(fullName, jmbg, birthYear);
		this.yearExperience = yearExperience;
		this.type = type;
	}
	
	@Override
	public void print() {
		System.out.println(this.fullName + " " + this.jmbg + " " + this.birthYear);
		System.out.println(this.yearExperience + " " + this.type);
	}
	
	
	

}

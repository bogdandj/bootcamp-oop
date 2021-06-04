package projekat_18_05;

public class Reaction {
	
	private String type;
	private String fullName;

	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getFullName() {
		return this.fullName;
	}
	
	public Reaction (String type, String fullName) {
		this.type = type;
		this.fullName = fullName;
	}
	
	
}

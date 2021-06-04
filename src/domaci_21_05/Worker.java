package domaci_21_05;

import java.util.ArrayList;

public abstract class Worker {
	
	private String fullName;
	protected ArrayList<Sector> sectors = new ArrayList<Sector>();
	
	
	
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public ArrayList<Sector> getSectors() {
		return sectors;
	}

	public void setSectors(ArrayList<Sector> sectors) {
		this.sectors = sectors;
	}
	


	public abstract double salary();
	
	public void getAJob(Sector sector) {
		this.setSectors(sectors);
	}

	public Worker(String fullName) {
		super();
		this.fullName = fullName;
	}
	
	

}

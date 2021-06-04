package projekat_24_05;

import java.util.ArrayList;

public class Discipline {

	private String name;
	private String type;
	private ArrayList<Athlete> athletes = new ArrayList<Athlete>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Athlete> getAthletes() {
		return athletes;
	}

	public void setAthletes(ArrayList<Athlete> athletes) {
		this.athletes = athletes;
	}

	
	public Discipline(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public void addAthlete(Athlete athlete) {
		athletes.add(athlete);
	}
	
	public void disqualification(String athleteName) {
		for (int i = 0; i < athletes.size(); i++) {
			if(athletes.get(i).getFullName().equals(athleteName)) {
				athletes.remove(i);
			}
		}
		
	}
	
	private Athlete bestAthlete() {
		Athlete best = athletes.get(0);
		for (int i = 1; i < athletes.size(); i++) {
			if (athletes.get(i).compareResults(best)) {
				best = this.athletes.get(i);
			}
		}
		return best;
	}
	
	public void results() {
		Athlete bestAthlete = bestAthlete();
		System.out.println(bestAthlete.getFullName() + " " + bestAthlete.getResult());
	}

}

package test_java;

import java.util.ArrayList;

public class MountainLodge {

	private String name;
	private int yearOfEstablishment;
	ArrayList<Mountaineer> mountaineers = new ArrayList<Mountaineer>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Mountaineer> getMountaineers() {
		return mountaineers;
	}

	public MountainLodge(String name, int yearOfEstablishment) {
		super();
		this.name = name;
		this.yearOfEstablishment = yearOfEstablishment;
	}

	public MountainLodge() {
	}
	
	public void addMountaineer(Mountaineer mountaineer) {
		mountaineers.add(mountaineer);
	}
	
	public int numberOfMountaineersThatReachTop(Mountain mountain) {
		int count = 0;
		for (int i = 0; i < mountaineers.size(); i++) {
			if(mountaineers.get(i).successfulAscent(mountain) == true) {
				count++;
			}
		}
		return count;
	}
	
	public void removeMountaineer(String id) {
		for (int i = 0; i < mountaineers.size(); i++) {
			if(mountaineers.get(i).id.equals(id)) {
				mountaineers.remove(i);
			}
		}
	}
	
	public void print() {
		System.out.println("Ime doma: " + this.name);
		System.out.println("Godina osnivanja: " + this.yearOfEstablishment);
		for (int i = 0; i < mountaineers.size(); i++) {
		System.out.println(mountaineers.get(i).getFullName() + " " + mountaineers.get(i).getId());
		}
		
	}
	
	public double monthlyIncome() {
		double totalIncome = 0;
		for (int i = 0; i < mountaineers.size(); i++) {
			totalIncome = totalIncome + mountaineers.get(i).monthlyPrice();
		}
		return totalIncome;
	}

}

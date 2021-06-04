package projekat_14_05;

public class ClanskaKarta {
	
	private double popust;
	private int clanskaKarta;

	
	public void setPopust(double popust) {
		this.popust = popust;
	}
	
	public double getPopust() {
		return this.popust;
	}
	
	public void setClanskaKarta(int clanskaKarta) {
		this.clanskaKarta = clanskaKarta;
	}
	
	public int getClanskaKarta() {
		return this.clanskaKarta;
	}
	
	public ClanskaKarta(double popust, int clanskaKarta) {
		this.popust = popust;
		this.clanskaKarta = clanskaKarta;
		
	}
}

package projekat_24_05;

public class Jumper extends Athlete {

	public Jumper(String fullName, double result) {
		super(fullName, result);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean compareResults(Athlete ath1) {
		if(this.result > ath1.result) {
			return true;
	}
			return false;
}
}

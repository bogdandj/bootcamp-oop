package projekat_24_05;

public class Runner extends Athlete {

	public Runner(String fullName, double result) {
		super(fullName, result);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean compareResults(Athlete ath1) {
			if(this.result > ath1.result) {
				return false;
		}
				return true;
	}
	
	
}

package projekat_20_05;

public class BachelorStudent extends Student3 {

	public BachelorStudent(String fullName, String indexNumber, int studyYear) {
		super(fullName, indexNumber, studyYear);
	}
	
	
	@Override
	public double tuition() {
		return 90000;
	}
	
	@Override
	public boolean budget() {
		if(this.studyYear < 5) {
			return true;
		}
		return false;
	}

	@Override
	public void print() {
		System.out.println(this.fullName + " " + this.indexNumber + " " + this.studyYear);
		System.out.println("Finansiranje: " + budget());
		System.out.println("Cena skolarine: " + tuition());
	}
	
}

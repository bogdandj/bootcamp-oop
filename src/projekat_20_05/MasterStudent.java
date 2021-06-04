package projekat_20_05;

public class MasterStudent extends Student3 {

	
	
	public MasterStudent(String fullName, String indexNumber, int studyYear) {
		super(fullName, indexNumber, studyYear);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tuition() {
		return 100000;
	}
	
	@Override
	public boolean budget() {
		if(this.studyYear < 2) {
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

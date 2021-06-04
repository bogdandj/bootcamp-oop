package projekat_20_05;

public class Student3 {

	protected String fullName;
	protected String indexNumber;
	protected int studyYear;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;
	}

	public int getStudyYear() {
		return studyYear;
	}

	public void setStudyYear(int studyYear) {
		this.studyYear = studyYear;
	}

	public Student3(String fullName, String indexNumber, int studyYear) {
		super();
		this.fullName = fullName;
		this.indexNumber = indexNumber;
		this.studyYear = studyYear;
	}
	
	public double tuition() {
		return 0;
	}
	
	public boolean budget() {
		return true;
	}
	
	public void print() {
		System.out.println(this.fullName + " " + this.indexNumber + " " + this.studyYear);
		System.out.println("Finansiranje: " + budget());
		System.out.println("Cena skolarine: " + tuition());
	}

}

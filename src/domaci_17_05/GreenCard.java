package domaci_17_05;

public class GreenCard {
	private String fullName;
	private String indexNumber;
	private String subjectName;
	private String professorName;
	private int mark;
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
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getProfessorName() {
		return professorName;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	public GreenCard(String fullName, String indexNumber, String subjectName, String professorName, int mark) {
		this.fullName = fullName;
		this.indexNumber = indexNumber;
		this.subjectName = subjectName;
		this.professorName = professorName;
		this.mark = mark;
	}
	
	public boolean pass() {
		if (this.mark > 5) {
			return true;
		} else{
			return false;
		}
	}
	
	public void print() {
		System.out.println(this.subjectName + " - " + this.mark);
		System.out.println("Student: " + this.fullName + ", " + this.indexNumber);
		System.out.println("Professor: " + this.professorName);
	}
	


}

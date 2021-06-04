package domaci_18_05;

public class Exam {

	private String name;
	private int mark;
	private String professorName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public Exam(String name, int mark, String professorName) {
		this.name = name;
		this.mark = mark;
		this.professorName = professorName;
	}
	
	public boolean pass() {
		if(this.mark > 5) {
			return true;
		} else {
			return false;
		}
	}
	
	public void print() {
		System.out.println(this.name + " - " + this.professorName + " - " + this.mark);
	}

}

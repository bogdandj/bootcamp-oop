package domaci_18_05;

import java.util.ArrayList;

import projekat_18_05.Ingredients;

public class Student {
	
	private String indexNumber;
	private String fullName;
	private String type;
	private ArrayList<Exam> exams = new ArrayList<Exam>();
	
	public String getIndexNumber() {
		return indexNumber;
	}
	public void setIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<Exam> getExams() {
		return exams;
	}
	
	
	
	public Student(String indexNumber, String fullName, String type) {

		this.indexNumber = indexNumber;
		this.fullName = fullName;
		this.type = type;
	}
	public void add(Exam exam) {
		this.exams.add(exam);
	}
	
	public double avg() {
		double avg = 0;
		int count = 0;
		for (int i = 0; i < exams.size(); i++) {
			if(this.exams.get(i).getMark() > 5) {
				avg = avg + this.exams.get(i).getMark();
				count++;
			}
		}
		return avg/count;
	}
	
	public void print() {
		System.out.println(this.indexNumber + " - " + this.fullName + " - " + this.type);
		for (int i = 0; i < exams.size(); i++) {
			this.exams.get(i).print();
		}
		System.out.println(avg());
	}


}

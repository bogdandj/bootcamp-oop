package domaci_18_05;

public class z1 {

	public static void main(String[] args) {
		Student st1 = new Student("942/11", "Bogdan Djuric", "master");
		
		Exam exam1 = new Exam ("CSS", 6, "Milan");
		Exam exam2 = new Exam ("Flutter", 10, "Janko");
		st1.add(exam1);
		st1.add(exam2);
		
		
		st1.print();

	}

}

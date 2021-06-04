package projekat_20_05;

public class z1 {

	public static void main(String[] args) {
		Student st1 = new Student("Bogdan Djuric","1805261680572", "155/10", 41000);
		Student st2 = new Student("Pera Peric", "4959125226260", "71/14", 17000);
		
		Professor pro1 = new Professor("Milan Jovanovic", "9848162536", "Java", 67000);
		Professor pro2 = new Professor("Vladimir Minic", "94196220", "Flutter", 94000);

		
		st1.payTuition(10000);
		st2.payTuition(4000);
		st1.print();
		
		
		pro1.salaryIncrease(3);
		pro2.salaryIncrease(5);
		pro1.print();
	}

}

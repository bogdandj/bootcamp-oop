package projekat_20_05;

public class z3 {

	public static void main(String[] args) {

		Student3 st1 = new Student3("Bogdan Djuric", "151/11", 3);
		
		BachelorStudent bst1 = new BachelorStudent("Pera Peric", "111/09", 4);
		
		MasterStudent mst1 = new MasterStudent("Mita Mitic", "250/19", 2);
		
		st1.print();
		bst1.print();
		mst1.print();
	}

}

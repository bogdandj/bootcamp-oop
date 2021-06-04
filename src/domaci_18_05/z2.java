package domaci_18_05;

public class z2 {

	public static void main(String[] args) {
		
		Combination comb1 = new Combination("DSJIWNAP");
		Combination comb2 = new Combination("OPQNQOMOQ");
		
		Ticket ticket1 = new Ticket();
		Ticket ticket2 = new Ticket();
		
		comb2.print();
		ticket1.addCombination(comb2);
		ticket1.winningCombination(comb2);
		ticket1.print();

	}

}

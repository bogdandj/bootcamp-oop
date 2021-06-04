package projekat_18_05;

public class zad2 {

	public static void main(String[] args) {
		Reaction react1 = new Reaction("like", "Bogdan Djuric");
		Reaction react2 = new Reaction("heart", "Pera Peric");
		Reaction react3 = new Reaction("smiley", "Mita Mitic");
		Reaction react4 = new Reaction("heart", "Mita Mitic");
		
		FacebookPost post1 = new FacebookPost();
		post1.setFullName("Bogdan Djuric");
		post1.setText("Prvi facebook post");
		post1.newReaction(react1);
		post1.newReaction(react2);
		post1.newReaction(react3);
		post1.newReaction(react4);
	
		post1.print();
		
	}

}

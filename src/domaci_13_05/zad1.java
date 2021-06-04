package domaci_13_05;

public class zad1 {

	public static void main(String[] args) {
		FacebookPost post1 = new FacebookPost("Bogdan Djuric", "Janko Djuric", "Prvi facebook post");
		
		FacebookPost post2 = new FacebookPost("Bogdan Djuric", "Drugi facebook post");
		
		post1.like();
		post1.like();
		post1.dislike();
		post1.share();
		post1.print();
		
		System.out.println("\n");
		
		post2.like();
		post2.like();
		post2.like();
		post2.dislike();
		post2.share();
		post2.share();
		post2.print();
		

	}

}

package projekat_18_05;

import java.util.ArrayList;

public class FacebookPost {

	private String fullName;
	private String text;
	private ArrayList<Reaction> reactions = new ArrayList<Reaction>();

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setText(String text) {
		this.text = text;
	}

	public FacebookPost() {

	}
//	public void react(Reaction react) {
//		this.reactions.add(react);
//	}

	public void newReaction(Reaction react) {

		for (int i = 0; i < reactions.size(); i++) {
			if (this.reactions.get(i).getFullName().equals(react.getFullName())) {
				this.reactions.remove(i);
			}

		}
		this.reactions.add(react);
	}

	private int count(String type) {
		int count = 0;
		for (int i = 0; i < reactions.size(); i++) {
			if (reactions.get(i).getType().equals(type))
				count++;
		}
		return count;
	}

	public void print() {
		System.out.println(this.fullName);
		System.out.println(this.text);
		System.out.println(
				"Smiley: " + count("smiley") + " | " + "Like: " + count("like") + " | " + "Heart: " + count("heart"));
	}

}

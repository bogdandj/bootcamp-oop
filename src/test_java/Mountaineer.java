package test_java;

public abstract class Mountaineer {

	protected String id;
	protected String fullName;

	public String getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public Mountaineer(String id, String fullName) {
		super();
		this.id = id;
		this.fullName = fullName;
	}

	public abstract void print();

	public abstract double monthlyPrice();

	public abstract boolean successfulAscent(Mountain mountain);

}

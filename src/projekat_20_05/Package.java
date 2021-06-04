package projekat_20_05;

public class Package {

	protected String name;
	protected String userName;
	protected double monthlyPrice;
	protected double contact;
	protected double downloadSpeed;
	protected double uploadSpeed;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getMonthlyPrice() {
		return monthlyPrice;
	}
	public void setMonthlyPrice(double monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}
	public double getContact() {
		return contact;
	}
	public void setContact(double contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public double getDownloadSpeed() {
		return downloadSpeed;
	}
	public double getUploadSpeed() {
		return uploadSpeed;
	}
	
	public void extendContract() {
		this.contact = this.contact + 12;
	}
	
	public int monthsForCent() {
		return 0;
	}
	
	
	
	public Package(String name, String userName, double monthlyPrice, double contact, double downloadSpeed,
			double uploadSpeed) {
		super();
		this.name = name;
		this.userName = userName;
		this.monthlyPrice = monthlyPrice;
		this.contact = contact;
		this.downloadSpeed = downloadSpeed;
		this.uploadSpeed = uploadSpeed;
	}
	public void print() {
		System.out.println(this.userName);
		System.out.println(this.name + " - " + this.downloadSpeed+"/"+this.uploadSpeed + " - " + this.contact + " meseca");
		System.out.println(this.monthlyPrice + " " + this.monthsForCent() + " meseca za dinar");
	}
}

package projekat_20_05;

public class DuoPackage extends Package {

	private String additionalDevice;
	
	public DuoPackage(String userName, double monthlyPrice, double contact, String additionalDevice) {
		super("EON FULL DUO", userName, monthlyPrice, contact, 250, 100);
		this.additionalDevice = additionalDevice;
	}

	@Override
	public int monthsForCent() {
		return 6;
	}

	public void internetSpeedIncrease(double speed) {
		this.downloadSpeed = this.downloadSpeed + speed;
		this.uploadSpeed = this.uploadSpeed + speed;
	}
	
	@Override
	public void print() {
		System.out.println(this.userName);
		System.out.println(this.name + " - " + this.downloadSpeed+"/"+this.uploadSpeed + " - " + this.contact + " meseca");
		System.out.println(this.monthlyPrice + " " + this.monthsForCent() + " meseca za dinar");
	}
	
	
	

}

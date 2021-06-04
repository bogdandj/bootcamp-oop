package projekat_20_05;

public class EONPackage extends Package{
	
	@Override
	public int monthsForCent() {
		return 3;
	}



	public EONPackage(String userName, double monthlyPrice, double contact) {
		super("EON LIGHT DUO", userName, monthlyPrice, contact, 150, 75);
		
	}



	@Override
	public void print() {
		System.out.println(this.userName);
		System.out.println(this.name + " - " + this.downloadSpeed+"/"+this.uploadSpeed + " - " + this.contact + " meseca");
		System.out.println(this.monthlyPrice + " " + this.monthsForCent() + " meseca za dinar");
	}
	

	
	
}

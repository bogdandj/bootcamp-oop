package projekat_18_05;

public class HistoryPage {

	private String name;
	private String link;
	private String hour;
	private String minute;
	private String username;
	private String password;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public String getLink() {
		return this.link;
	}
	
	public void setHour(String hour) {
		this.hour = hour;
	}
	
	public String getHour() {
		return this.hour;
	}
	
	public void setMinute(String minute) {
		this.minute = minute;
	}
	
	public String getMinute() {
		return this.minute;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public HistoryPage(String name, String link, String hour, String minute) {
		this.name = name;
		this.link = link;
		this.hour = hour;
		this.minute = minute;
	}
	
	public void saveCookies(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public void removeCookies() {
		this.username = null;
		this.password = null;
	}
	
	public void print() {
		System.out.println(this.hour + ":" + this.minute + " - " + this.name + " - " + this.link +
		this.username != null ? "*****" : "" + " " + this.password != null ? "****" : "");
	}
	
	
}

package projekat_18_05;

import java.util.ArrayList;

public class History {
	
	private ArrayList<HistoryPage> pages = new ArrayList<HistoryPage>();
	
	
	public void openPage(HistoryPage page) {
		this.pages.add(page);
	}
	
	public void removeByLink(String link) {
		for (int i = 0; i < pages.size(); i++) {

		if (link.equals(pages.get(i).getLink())){
			this.pages.remove(i);
		}
	}}
	
	public void removeCookiesForLink(String link) {
		for (int i = 0; i < pages.size(); i++) {

			if (link.equals(pages.get(i).getLink())){
				this.pages.get(i).removeCookies();;
			}
		}
	}
	

	public void removeHistory() {
		pages.removeAll(pages);
	}
	
	public void saveCredentials(String link, String password, String username) {
		for (int i = 0; i < pages.size(); i++) {

			if (link.equals(pages.get(i).getLink())){
				this.pages.get(i).saveCookies(password, username);
			}
		}
	}


}

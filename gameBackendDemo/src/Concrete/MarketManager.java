package Concrete;

import Abstract.IMarketManager;
import Entities.User;

public class MarketManager extends IMarketManager{
	
	//Constructor'a kampanyay� ekle sat�� ve �demeyi kampanyaya g�re yap
	public void MarketManager(CampaignManager campaignManager) {
		System.out.println("Kam");
		
	}
	public void MarketManager() {
		
		
	}

	public void sell(User user1, User user2) {
		System.out.println("Oyun sat�ld�!");
		System.out.println("Kimden: "+user1.getName()+" Kime: "+user2.getName());
		
	}

	public void payment(User user1, User user2) {
		System.out.println("�deme Yap�ld�");
		System.out.println("Kimden: "+user2.getName()+" Kime: "+user1.getName());
		
		
	}

}

package Concrete;

import Abstract.IMarketManager;
import Entities.User;

public class MarketManager extends IMarketManager{
	
	//Constructor'a kampanyayı ekle satış ve ödemeyi kampanyaya göre yap
	public void MarketManager(CampaignManager campaignManager) {
		System.out.println("Kam");
		
	}
	public void MarketManager() {
		
		
	}

	public void sell(User user1, User user2) {
		System.out.println("Oyun satıldı!");
		System.out.println("Kimden: "+user1.getName()+" Kime: "+user2.getName());
		
	}

	public void payment(User user1, User user2) {
		System.out.println("Ödeme Yapıldı");
		System.out.println("Kimden: "+user2.getName()+" Kime: "+user1.getName());
		
		
	}

}

package Concrete;

import Abstract.ICampaign;
import Abstract.ICampaignManager;

public class CampaignManager implements ICampaignManager{

	@Override
	public void add(ICampaign campaign) {
		System.out.println("Kampanya eklendi: ");
		
	}

	
}

package gameBackendDemo;

import java.time.LocalDate;

import Concrete.CampaignManager;
import Concrete.GamerManager;
import Concrete.MarketManager;
import Concrete.UserCheckManager;
import Entities.GameSeller;
import Entities.Gamer;
import Entities.SummerCampaign;
import Entities.User;
import Abstract.BaseUserManager;
import Abstract.ICampaignManager;
import Abstract.IUser;

public class Main {

	public static void main(String[] args) {
		BaseUserManager gamerManager = new GamerManager(new UserCheckManager());
		User gamer1 = new Gamer();
		User seller1 = new GameSeller();
		
		
		gamer1.setId(1);
		gamer1.setName("Ali");
		gamer1.setSurname("Köroðlu");
		gamer1.setBirthDate(LocalDate.of(1990, 01, 03));
		gamer1.setNationalityId("32589536513");
		
		gamerManager.add(gamer1);
		
		seller1.setId(2);
		seller1.setName("Veli");
		seller1.setSurname("Köroðlu");
		seller1.setBirthDate(LocalDate.of(1990, 01, 03));
		seller1.setNationalityId("32589536513");
		
		gamerManager.add(gamer1);
		
		MarketManager marketManager = new MarketManager();
		
		marketManager.sell(seller1, gamer1);
		marketManager.payment(seller1, gamer1);
		
		SummerCampaign summerCampaign = new SummerCampaign();
		
		ICampaignManager campaignManager = new CampaignManager();
		
		campaignManager.add(summerCampaign);
		

	}
	
	

}

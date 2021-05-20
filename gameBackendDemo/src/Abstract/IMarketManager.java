package Abstract;

import Entities.User;

public abstract class IMarketManager {
	
	public abstract void sell(User user1,User user2);
	
	public abstract void payment(User user1,User user2);
	
	
}

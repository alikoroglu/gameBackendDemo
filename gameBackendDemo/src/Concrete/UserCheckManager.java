package Concrete;


import Abstract.IUserCheckService;
import Entities.User;

public class UserCheckManager implements IUserCheckService{

	@Override
	public boolean ifRealPerson(User user) {
		// TODO Auto-generated method stub
		return true;
	}
	
}

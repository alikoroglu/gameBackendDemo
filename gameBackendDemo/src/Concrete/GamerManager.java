package Concrete;

import Abstract.BaseUserManager;
import Abstract.IUser;
import Abstract.IUserCheckService;
import Entities.Gamer;
import Entities.User;

public class GamerManager extends BaseUserManager{
	
	private IUserCheckService userCheckService;
	
	public GamerManager(IUserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}
	
	@Override
	public void add(User user) {
		if(userCheckService.ifRealPerson(user) ) {
			System.out.println("Oyuncu eklendi: "+user.getName());
			}else {
				System.out.println("Ge�ersiz ki�i ");
			}
		
		
	}
	@Override
	public void update(User user) {
		if(userCheckService.ifRealPerson(user) ) {
			System.out.println("Oyuncu g�ncellendi: "+user.getName());
			}else {
				System.out.println("Ge�ersiz ki�i ");
			}
		
	}
	@Override
	public void delete(User user) {
		if(userCheckService.ifRealPerson(user) ) {
			System.out.println("Oyuncu : "+user.getName());
			}else {
				System.out.println("Ge�ersiz ki�i ");
			}
		
	}

	@Override
	public void add(IUser user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(IUser user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(IUser user) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

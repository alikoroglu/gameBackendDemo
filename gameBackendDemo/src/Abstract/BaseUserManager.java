package Abstract;

import Entities.User;

public abstract class BaseUserManager implements IUserManager{
	
	public abstract void add(User user);
	public abstract void update(User user);
	public abstract void delete(User user);
}

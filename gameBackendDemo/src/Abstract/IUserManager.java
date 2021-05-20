package Abstract;

import Entities.User;

public interface IUserManager {
	public void add(IUser user);
	public void update(IUser user);
	public void delete(IUser user);
}

package eCommerceSimulation.dataAccess.concretes;
import java.util.ArrayList;
import java.util.List;

import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entities.cocretes.User;

public class InLocaleUserDao implements UserDao {
	List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println( user.getFirstName() + " You registered to system succesfully");
	}

	@Override
	public void update(User user) {
		System.out.println("Updated: " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("Deleted: " + user.getFirstName());
		
	}

	@Override
	public User get(int id) {
		for(User user : users) {
			if(user.getId() == id)
				return user;
		}
		return null;
	}

	@Override
	public User getByEmail(String eMail) {
		for(User user : users) {
			if(user.geteMail() == eMail)
				return user;
		}
		return null;
	}

	@Override
	public User getByEmailAndPassword(String eMail, String password) {
		for(User user : users) {
			if(user.geteMail() == eMail && user.getPassword() == password)
				return user;
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}

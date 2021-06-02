package eCommerceSimulation.dataAccess.abstracts;

import java.util.List;

import eCommerceSimulation.entities.cocretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	User getByEmail(String eMail);
	User getByEmailAndPassword(String eMail, String password);
	List<User> getAll();

}

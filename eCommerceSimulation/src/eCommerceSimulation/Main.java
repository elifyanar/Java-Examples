package eCommerceSimulation;

import eCommerceSimulation.business.concretes.UserManager;
import eCommerceSimulation.dataAccess.concretes.InLocaleUserDao;
import eCommerceSimulation.entities.cocretes.User;
import eCommerceSimulation.googleAuth.GoogleRegister;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager(new InLocaleUserDao(), new GoogleRegister());

        User user1 = new User(1, "Elif", "Yanar", "elifyanar@gmail.com", "123456");
        userManager.register(user1);
        userManager.login(user1.getEmail(), user1.getPassword());
        System.out.println();
        User user2 = new User(1, "Elif", "Yanar", "elifyanar@gmail.com", "123456");
        userManager.register(user2);
        userManager.login(user2.getEmail(), user2.getPassword());
        System.out.println();
        User user3 = new User(1, "Elif", "Yanar", "elif.yanar@gmail.com", "12");
        userManager.register(user3);
        userManager.login(user3.getEmail(), user3.getPassword());
	}

}

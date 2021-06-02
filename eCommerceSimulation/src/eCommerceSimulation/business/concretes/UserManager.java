package eCommerceSimulation.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceSimulation.business.abstracts.UserService;
import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entities.cocretes.User;
import eCommerceSimulation.googleAuth.GoogleService;

public class UserManager implements UserService {
	private UserDao userDao;
	 private GoogleService googleService;

	private List<String> emailList = new ArrayList<String>();
	private List<String> passwordList = new ArrayList<String>();
	
	public UserManager(UserDao userDao, GoogleService googleService) {
        this.userDao = userDao;
        this.googleService = googleService;
    }

	public static boolean isEmailValid(String email) {
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public static boolean EmailValidation(String email) {
		return true;
	}

	@Override
	public void register(User user) {
		if (user.getPassword().length() < 6 || user.getPassword() == null){
            System.out.println("Your password must be at least 6 characters!");
            return;
        }

        //EmailCheck
        if (emailList.contains(user.getEmail())){
            System.out.println("This email address is already registered!");
            return;
        }
        if (user.getFirstName().length() <=2 || user.getLastName().length() <=2){
            System.out.println("First and last name must be at least 2 characters!");
            return;
        }else{
            System.out.println("Your information is correct, please check your e-mail address and confirmation message. ");
        }
        if (EmailValidation(user.getEmail())){
            System.out.println("Successfully registered.");

            emailList.add(user.getEmail());
            passwordList.add(user.getPassword());
            this.userDao.add(user);
            this.googleService.registerToSystem(null);

        }else{
            System.out.println("Error! Please check your e-mail address.");
        }
	}

	@Override
	public void login(String email, String password) {
		if (emailList.contains(email) && passwordList.contains(password)){
            System.out.println("Login successful.");
        }else{
            System.out.println("Please check your e-mail address or password!");
        }
	}

}

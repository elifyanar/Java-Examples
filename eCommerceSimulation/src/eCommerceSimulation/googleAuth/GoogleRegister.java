package eCommerceSimulation.googleAuth;

public class GoogleRegister implements GoogleService {
	 public void send(String message){
	        System.out.println("You have registered to the system with your google account.");
	    }

	@Override
	public void registerToSystem(String message) {
		GoogleRegister googleRegister = new GoogleRegister();
        googleRegister.send(message);
	}
}

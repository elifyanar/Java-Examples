package Concrete;
import Adapters.PersonCheckService;
import Entities.Player;

public class FakePersonCheckManager implements PersonCheckService {

	@Override
	public boolean Validation(Player player) {
		// TODO Auto-generated method stub
		if(player.getNationalityId().length()==11) {
			System.out.println("The player named "+player.FirstName+" "+player.LastName+" has been verified.");
			return true;
		}
		else {
			System.out.println("The player named "+player.FirstName+" "+player.LastName+" could not be verified.");
			return false;
		}
		
	}

}

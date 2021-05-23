package Concrete;

import Abstract.PlayerService;
import Adapters.PersonCheckService;
import Entities.Player;

public class PlayerManager implements PlayerService {
	PersonCheckService eDevlet;
	public PlayerManager(PersonCheckService personCheckService) {
		this.eDevlet=personCheckService;
	}
	@Override
	public void Add(Player player) {
		if(eDevlet.Validation(player)) { 
			System.out.println("The player named "+player.getFirstName()+" "+player.getLastName()+"  has been added. ");
			
		}
		
	}
	@Override
	public void Update(Player player) {
		if(eDevlet.Validation(player)) { 
			System.out.println("The player named "+player.getFirstName()+" "+player.getLastName()+" has been updated. ");
			
		}
		
	}
	@Override
	public void Delete(Player player) {
		if(eDevlet.Validation(player)) { 
			System.out.println("The player named "+player.getFirstName()+" "+player.getLastName()+" has been deleted. ");
			
		}
		
	}
	

}

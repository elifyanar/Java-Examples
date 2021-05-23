import Concrete.CampaignManager;
import Concrete.FakePersonCheckManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Player player=new Player();
 player.setId(1);
 player.setFirstName("Elif");
 player.setLastName("Yanar");
 player.setDateOfBirth("1589");
 player.setNationalityId("48776145674");
 
 PlayerManager playermanager=new PlayerManager(new FakePersonCheckManager());
 playermanager.Add(player);
 //playermanager.Update(player);
 //playermanager.Delete(player);
 Campaign campaign=new Campaign();
 campaign.setId(1);
 campaign.setName("New Year");
 campaign.setDiscount(10);
 
 Game game=new Game();
 game.setId(1);
 game.setCategory("Painting");
 game.setName("Bubble");
 game.setPrice(380);
 game.setCampaign(campaign);
 GameManager gamemanager=new GameManager();
 gamemanager.Add(game);
 
 
 CampaignManager campaignmanager=new CampaignManager();
 campaignmanager.Add(campaign);
 
 
 SaleManager salemanager=new SaleManager();
 salemanager.SaleGame(player, campaign,game);

	}

}

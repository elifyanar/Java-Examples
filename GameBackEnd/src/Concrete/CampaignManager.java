package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void Add(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("The campaign named "+campaign.getName()+"  has been added.");
	}

	@Override
	public void Update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("The campaign named "+campaign.getName()+" has been updated.");
	}

	@Override
	public void Delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("The campaign named "+campaign.getName()+" has been deleted.");
	}

}

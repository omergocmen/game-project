package Business;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" adl? kampanya ba?ar?yla eklendi");
	}

	@Override
	public void removeCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" adl? kampanya ba?ar?yla silindi");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" adl? kampanya ba?ar?yla g?ncellendi");
	}

}

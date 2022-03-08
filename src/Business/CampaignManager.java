package Business;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" adlý kampanya baþarýyla eklendi");
	}

	@Override
	public void removeCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" adlý kampanya baþarýyla silindi");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" adlý kampanya baþarýyla güncellendi");
	}

}

package Business;

import Abstract.GameSalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSalesManager implements GameSalesService{

	@Override
	public void sellGame(Game game, Player player, Campaign[] campaings) {
		System.out.println(game.getName()+" oyunu "+player.getFirstName()+" "
	+player.getLastName()+" kullan�c�s� taraf�ndan sat�n al�nd�");
		System.out.println("Kampanyalar");
		for (Campaign campaign : campaings) {
			System.out.println(campaign.getName());
		}
		
	}

}

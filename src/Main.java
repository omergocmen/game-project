import java.sql.Date;

import Abstract.GameService;
import Abstract.PlayerService;
import Adapters.CheckServiceAdapter;
import Business.GameManager;
import Business.GameSalesManager;
import Business.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {
	public static void main(String[] args) {
		Game game1=new Game(1,"SoulCalibur",8.8,15);
		Player player1=new Player(1,"omer","gocmen",
				new Date(System.currentTimeMillis()),
				"253652156",new Date(System.currentTimeMillis()));
		Campaign campaign1=new Campaign(1,"traditional game days",new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),25);
		Campaign campaign2=new Campaign(2,"legendary friday",new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),20);
		
		PlayerService playerService=new PlayerManager(new CheckServiceAdapter());
		playerService.addPlayer(player1);
		
		
		
		Campaign[] campaings=new Campaign[] {campaign1,campaign2};
		GameSalesManager gameSalesManages=new GameSalesManager();
		gameSalesManages.sellGame(game1, player1, campaings);
		
	}

}

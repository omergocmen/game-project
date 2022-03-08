package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface GameSalesService {
	void sellGame(Game game,Player player,Campaign[] campaings);
}

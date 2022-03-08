package Business;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements  GameService{

	@Override
	public void addGame(Game game) {
		System.out.println(game.getName()+" adl� oyun ba�ar�yla eklendi");
	}

	@Override
	public void removeGame(Game game) {
		System.out.println(game.getName()+" adl� oyun ba�ar�yla silindi");
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getName()+" adl� oyun ba�ar�yla g�ncellendi");
	}

}

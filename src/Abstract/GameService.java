package Abstract;

import Entities.Game;

public interface GameService{
	void addGame(Game game);
	void removeGame(Game game);
	void updateGame(Game game);//void yerine boolean yapılabilir işlemlerden sonra true ya da false dönebiliriz

}

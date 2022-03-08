package Business;

import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService{

	private PlayerCheckService playerCheckService;
	
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void addPlayer(Player player) {
		if(playerCheckService.CheckPlayer()) {
			System.out.println(player.getFirstName()+" "+player.getLastName()+" ba�ar�yla eklendi");
		}else {
			System.out.println("L�tfen ge�erli kullan�c� bilgileri giriniz.");
		}

	}

	@Override
	public void removePlayer(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" ba�ar�yla silindi");
	}

	@Override
	public void updatePlayer(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" ba�ar�yla g�ncellendi");
	}

}

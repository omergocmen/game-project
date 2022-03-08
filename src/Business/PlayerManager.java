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
			System.out.println(player.getFirstName()+" "+player.getLastName()+" baþarýyla eklendi");
		}else {
			System.out.println("Lütfen geçerli kullanýcý bilgileri giriniz.");
		}

	}

	@Override
	public void removePlayer(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" baþarýyla silindi");
	}

	@Override
	public void updatePlayer(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" baþarýyla güncellendi");
	}

}

package Adapters;

import Abstract.PlayerCheckService;

public class CheckServiceAdapter implements PlayerCheckService {

	@Override
	public boolean CheckPlayer() {
		System.out.println("Kullanýcý baþarýyla doðrulandý");
		return true;
	}

}

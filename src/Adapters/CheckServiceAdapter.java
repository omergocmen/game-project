package Adapters;

import Abstract.PlayerCheckService;

public class CheckServiceAdapter implements PlayerCheckService {

	@Override
	public boolean CheckPlayer() {
		System.out.println("Kullanıcı başarıyla doğrulandı");
		return true;
	}

}

package Adapters;

import Abstract.PlayerCheckService;

public class CheckServiceAdapter implements PlayerCheckService {

	@Override
	public boolean CheckPlayer() {
		System.out.println("Kullan�c� ba�ar�yla do�ruland�");
		return true;
	}

}

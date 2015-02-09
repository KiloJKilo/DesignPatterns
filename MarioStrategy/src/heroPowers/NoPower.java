package heroPowers;

import heros.PowerBehavior;

public class NoPower implements PowerBehavior {

	@Override
	//removes power from player
	public void changePower() {
		System.out.println( "Removed all power" );
	}

	@Override
	public String getPowerStatus() {
		return "No Power";
	}


}

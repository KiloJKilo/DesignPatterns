package heroPowers;

import heros.PowerBehavior;

public class FireFlower implements PowerBehavior {

	@Override
	public void changePower() {
		System.out.println( "Gave fire power" );
		
	}

	@Override
	public String getPowerStatus() {
		// TODO Auto-generated method stub
		return "Fire Power";
	}

}

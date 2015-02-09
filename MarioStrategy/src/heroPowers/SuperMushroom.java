package heroPowers;

import heros.PowerBehavior;


public class SuperMushroom implements PowerBehavior{

	@Override
	// makes player 'super size'	
	public void changePower() {
		System.out.println( "Made Super Size" );
		
	}

	@Override
	public String getPowerStatus() {
		return "Super Size";
	}

}

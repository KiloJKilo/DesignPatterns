package game;

import heroPowers.NoPower;
import heros.Human;

public class DamageManager {

	// takes
	public String DecideFate( Human player ) {
		String code = player.getPowerStatus();
        System.out.println( "Took Damage" );
		if ( code == "No Power" ) {
			return "death";
		} else {
			player.setPowerBehavior( new NoPower() );
			return "Shrink to small";
		}

	}

}

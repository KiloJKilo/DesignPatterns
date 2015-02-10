package game;

import heroPowers.NoPower;
import heros.Human;

public class DamageManager {

	// takes
	public String DecideFate( Human player ) {
		String status = player.getPowerStatus();

		System.out.println( "Took Damage" );
		// if ( code == "No Power" ) {
		// return "death";
		// } else {
		// player.setPowerBehavior( new NoPower() );
		// return "Shrink to small";
		// }

		switch ( status ) {

		case "No Power":
			return "Death";
		case "Super Star Power":
			return "Nothing happens because you are invincible";
		default:
			player.setPowerBehavior( new NoPower() );
			return "Shrink to small";
		}

	}

}

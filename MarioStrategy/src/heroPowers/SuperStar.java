package heroPowers;

import heros.Human;
import heros.PowerBehavior;

public class SuperStar implements PowerBehavior {

	// Constructor that passes in player. Calls the increase speed method to make character faster.
	public SuperStar( Human player ) {

		increaseSpeed( player );

	}

	// No arguments SuperStar pattern gets called without an active player - this should not happen
	public SuperStar() {
		System.out.println( "Abort! Abort!" );
	}

	private void increaseSpeed( Human player ) {
		int newSpeed = player.getSpeed() + 3;
		player.setSpeed( newSpeed );
	}

	@Override
	public void changePower() {
		System.out.println( "Gave Invinicibility" );

	}

	@Override
	public String getPowerStatus() {
		// TODO Auto-generated method stub
		return "Super Star Power";
	}

}
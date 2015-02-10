package game;

import heroPowers.SuperMushroom;
import heroPowers.SuperStar;
import heros.Mario;

public class Game {

	public static void main( String[] args ) {
		// create a new damage manager to determine what happens when hero takes damage
		DamageManager dm = new DamageManager();
		// create a new character of type mario named myMario
		Mario myMario = new Mario();
		// would create sprite, but for now it just gives a text message
		myMario.display();

		// Message stating what was created
		System.out.println( "Created myMario with a jump value of " + myMario.getJump() + ". A Speed value of " + 
				myMario.getSpeed() + ". An accelration value of " + myMario.getAcceleration() + ". A strength value of " + myMario.getStrength());

		// calling a move method passing in myMario's speed and acceleration attributes
		myMario.move( myMario.getSpeed(), myMario.getAcceleration() );

		// lets see what myMario's power is right now
		System.out.println( myMario.getPowerStatus() );

		// let's say myMario gets the first power up
		System.out.println( "Mario gets a mushroom!" );
		myMario.setPowerBehavior( new SuperMushroom() );

		// what's his status now?
		System.out.println( myMario.getPowerStatus() );

		// mario takes damage

		System.out.println( dm.DecideFate( myMario ) );

		// what's his status now?
		System.out.println( myMario.getPowerStatus() );

		// mario gets a SuperStar
		myMario.setPowerBehavior( new SuperStar( myMario ) );

		// what's his status now?
		System.out.println( myMario.getPowerStatus() );

		// check mario's speed
		System.out.println( "My speed = " + myMario.getSpeed() );

		// Mario takes damage again
		System.out.println( dm.DecideFate( myMario ) );

	}

}

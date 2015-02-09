package heros;

import heroPowers.NoPower;

public abstract class Human {

	PowerBehavior powerBehavior;
	public int speed;
	public int acceleration;
	public int jump;
	public int strength;

	// always create a human with no power behavior
	public Human() {
		this.powerBehavior = new NoPower();
	}

	// set the power behavior
	public void setPowerBehavior( PowerBehavior pb ) {
		powerBehavior = pb;
	}

	// get the power status
	public String getPowerStatus() {
		// return powerBehavior.getPowerCode();
		return powerBehavior.getPowerStatus();
	}

	// method to display character
	abstract void display();

	// move method
	public void move( int speed, int acceleration ) {
		System.out.println( "I accelerated at " + acceleration + " with a top speed of " + speed );
	}

	// jump method
	public void jump( int jump ) {
		System.out.println( "i'm jumping " + jump + " high" );
	}

//	// change power
//	public void changePower() {
//		powerBehavior.changePower();
//	}


	public int getSpeed() {
		return speed;
	}

	public void setSpeed( int speed ) {
		this.speed = speed;
	}

	public int getAcceleration() {
		return acceleration;
	}

	public void setAcceleration( int acceleration ) {
		this.acceleration = acceleration;
	}

	public int getJump() {
		return jump;
	}

	public void setJump( int jump ) {
		this.jump = jump;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength( int strength ) {
		this.strength = strength;
	}

}

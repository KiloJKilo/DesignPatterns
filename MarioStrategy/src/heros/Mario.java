package heros;

public class Mario extends Human {

	public Mario() {
		this.speed = 6;
		this.acceleration = 3;
		this.jump = 5;
		this.strength = 8;
	}

	@Override
	public void display() {
		System.out.println( "It's me, Mario" );

	}
	
	
}


public class Samurai extends Human {

// --------------------------------------------------//
//	The Samurai class should have a default health of 200;
//	a method called deathBlow that attacks an object and 
//	decreases its health to 0, but also halves the Samurai's
//	health; a method called meditate which heals the Samurai
//	back to full health; and a method called howMany that 
//	returns the current number of Samurai.
// --------------------------------------------------//
	
	private static int count = 0;
	
	public Samurai() {
		this.health = 200;
		this.count += 1;
	}
	
	public Samurai(String name) {
		this.name = name;
		this.health = 200;
		this.count += 1;
	}
	
	public Samurai(String name, int health, int strength, int intelligence, int stealth) {
		this.health = health;
		this.strength = strength;
		this.intelligence = intelligence;
		this.stealth = stealth;
		this.count += 1;
	}
	
	public void howMany() {
		System.out.println("Samurai are around ...");
		System.out.println("There are " + this.count + " Samurai");
	}
	
	public void meditate() {
		this.health = 200;
		System.out.println("Do not disturb a man while meditating ... ");
	}
	
	public void dealthBlow(Human foe) {
		foe.health = 0;
		System.out.println("Samurai Attacks with Dealth Blow!");
		this.health -= (this.health / 2);
	}
}

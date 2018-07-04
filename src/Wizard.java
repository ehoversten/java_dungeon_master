import java.lang.Math;

public class Wizard extends Human {
//-------------------------------------------------------//
//	The Wizard class should have a default health of 50 and 
//	intelligence of 8; a method called heal that heals 
//	whomever it was cast on for an amount equal to the 
//	wizard's intelligence; and a method called fireball
//	that decreases the health of whichever object it 
//	attacked by 3 * the wizard's intelligence.
//-------------------------------------------------------//
	
	
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	public Wizard(String name) {
		this.name = name;
		this.health = 50;
		this.intelligence = 8;
	}
	
	public Wizard(int health, int intelligence) {
		this.health = health;
		this.intelligence = intelligence;
	}
	
	public Wizard(String name, int health, int strength, int intelligence, int stealth) {
		this.health = health;
		this.strength = strength;
		this.intelligence = intelligence;
		this.stealth = stealth;
		this.name = name;
	}
	
	public void heal(Human friend) {
		friend.health += this.intelligence;
		System.out.println("Healing ..." + friend.name);
	}
	
	public void fireball(Human foe) {
		foe.health -= this.intelligence * 3;
		System.out.println("Wizard casts Fireball on " + foe.name);
	}
}

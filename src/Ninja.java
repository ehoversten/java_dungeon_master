
public class Ninja extends Human{
	
// --------------------------------------------------//
//	The Ninja class should have a default stealth of 10;
//	a method, steal, that takes health from another human 
//	by their stealth level, and a way to run away that
//	decreases their health by 10.	
// --------------------------------------------------//
	
	
	public Ninja() {
		this.stealth = 10;
		
	}
	
	public Ninja(String name) {
		this.name = name;
		this.stealth = 10;
	}

	public Ninja(String name, int health, int strength, int intelligence, int stealth) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.intelligence = intelligence;
		this.stealth = stealth;
	}
	
	public void steal(Human foe) {
		System.out.println("Stealing from " + foe.name);
		foe.health -= this.stealth;
		System.out.println("increasing health ...");
		this.health += this.stealth;
	}
	
}

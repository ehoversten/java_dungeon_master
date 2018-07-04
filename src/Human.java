public class Human {
//-------------------------------------------//
// four properties: strength, intelligence,
//  stealth, and health. The starting value
//  for each of the properties should be 3,
//  except for health - that should be 100.
//-------------------------------------------//
  public int health;
  public int strength;
  public int intelligence;
  public int stealth;
  public String name;

  public Human() { 
	this.stealth = 3;
	this.strength = 3;
	this.intelligence = 3;
	this.health = 100;
  }
  
  public Human(String name) {
	this.name = name;
	this.stealth = 3;
	this.strength = 3;
	this.intelligence = 3;
	this.health = 100;
  }

  public Human(String name, int health, int strength, int intelligence, int stealth) {
    this.health = health;
    this.strength = strength;
    this.intelligence = intelligence;
    this.stealth = stealth;
  }

// ---- GETTERS ----- //
  public int getHealth() {
//    System.out.println("Health: " + health);
    return health;
  }

  public int getStrength() {
//    System.out.println("Strength: " + strength);
    return strength;
  }

  public int getIntelligence() {
//    System.out.println("Intelligence: " + intelligence);
    return intelligence;
  }

  public int getStealth() {
//    System.out.println("Stealth: " + stealth);
    return stealth;
  }

// ---- SETTERS ----- //
  public void setHealth(int health) {
    this.health = health;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }

  public void setStealth(int stealth) {
    this.stealth = stealth;
  }


// ---- METHODS ----- //


  public void attacks(Human foe) {
    foe.health -= this.strength;
    System.out.println("Attacks foe!");
  }
  
  
}
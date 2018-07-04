
public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human bill = new Human("Bill");
		System.out.println(bill.name + ", Health: " + bill.getHealth());
		System.out.println(bill.name + ", Strength: " + bill.getStrength());
		System.out.println(bill.name + ", Stealth: " + bill.getStealth());
		System.out.println(bill.name + ", Intelligence: " + bill.getIntelligence());
		
		Human donna = new Human("Donna");
		System.out.println(donna.name + ", Health: " + donna.getHealth());
		System.out.println(donna.name + ", Strength: " + donna.getStrength());
		System.out.println(donna.name);
		donna.attacks(bill);
		System.out.println(bill.name + ", Health: " + bill.getHealth());
		donna.setStrength(10);
		System.out.println("Dont make " + donna.name + " angry!");
		System.out.println(donna.name + ", Strength: " + donna.getStrength());
		donna.attacks(bill);
		donna.attacks(bill);
		System.out.println(bill.name + ", Health: " + bill.getHealth());
		
		// create Wizard class instance
		Wizard gandalf = new Wizard("Gandalf");
		System.out.println(gandalf.name + ", Health: " + gandalf.getHealth());
		System.out.println(gandalf.name + ", Intelligence: " + gandalf.getIntelligence());
		System.out.println(gandalf.name + ", Strength: " + gandalf.getStrength());
		System.out.println(gandalf.name + ", Stealth: " + gandalf.getStealth());
		
		// cast fireball()
		gandalf.fireball(bill);
		System.out.println(bill.name + ", Health: " + bill.getHealth());
		// cast heal()
		gandalf.heal(bill);
		System.out.println(bill.name + ", Health: " + bill.getHealth());
		
		Ninja bob = new Ninja("Bob");
		System.out.println(bob.name + ", Health: " + bob.getHealth());
		System.out.println(bob.name + ", Stealth: " + bob.getStealth());
		
		// create Wizard class instance
		Samurai tal = new Samurai("Tal");
		System.out.println(tal.name + ", Health: " + tal.getHealth());
		System.out.println(tal.name + ", Intelligence: " + tal.getIntelligence());
		System.out.println(tal.name + ", Strength: " + tal.getStrength());
		System.out.println(tal.name + ", Stealth: " + tal.getStealth());
		
		tal.howMany();
		Samurai nun = new Samurai("Nun");
		Samurai seth = new Samurai("Seth");
		tal.howMany();
		
		tal.dealthBlow(nun);
		System.out.println(tal.name + ", Health: " + tal.getHealth());
		System.out.println(nun.name + ", Health: " + nun.getHealth());
		
		tal.meditate();
		System.out.println(tal.name + ", Health: " + tal.getHealth());
		
	}

}

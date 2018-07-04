
public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human bill = new Human("Bill");
		bill.getHealth();
		bill.getIntelligence();
		bill.getStealth();
		bill.getStrength();
		
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
		
	}

}

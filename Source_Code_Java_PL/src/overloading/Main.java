package overloading;

public class Main {
	public static void main(String[] args) {
		enemyPower ePower = new enemyPower();
		monster Monster = new monster();
		
		ePower.attack(10, 11);
		Monster.attack(12.4, 11.4);
	}
}

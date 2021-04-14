package overloading;

public class enemyPower {
	void attack(int a, int b) {
		System.out.println("damage yang di hasilkan adalah dari sekali attack enemy adalah " + (a + b));
	}
}

class monster extends enemyPower {
	void attack(double a, double b) {
		System.out.println("damage yang di hasilkan dari sekali attack monster adalah " + (a + b));
	}
}
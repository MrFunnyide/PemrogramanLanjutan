package overidding;

public class musuh {
	void attack() {
		System.out.println("Musuh bisa attack");
	}
	
	void skill() {
		System.out.println("Skill di keluarkan ");
	}
}

class monster extends musuh {
	void attack() {
		System.out.println("Monster bisa attack");
	}
}

package overidding;

public class main {
	public static void main(String[] args) {
		musuh Musuh = new musuh();
		monster Monster = new monster();
		musuh monsterMusuh = new monster();
		
		Musuh.attack();
		Musuh.skill();
		Monster.attack();
		
		monsterMusuh.attack();
		monsterMusuh.skill();
	}
}
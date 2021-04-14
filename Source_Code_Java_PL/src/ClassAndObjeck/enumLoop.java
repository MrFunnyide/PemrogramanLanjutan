package ClassAndObjeck;

public class enumLoop {
	enum game {
		veryEasy,
		easy,
		normal,
		hard
	}
	public static void main(String[] args) {
		for ( game gm : game.values()) {
			System.out.println(gm);
		}
	}
}

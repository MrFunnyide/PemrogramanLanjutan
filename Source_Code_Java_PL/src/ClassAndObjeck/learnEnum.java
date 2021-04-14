package ClassAndObjeck;

public class learnEnum {
	enum gameLevel {
		hard,
		normal,
		easy
	}
	public static void main(String[] args) {
		
		gameLevel gLevel = gameLevel.easy;	// akses enum
		
		System.out.println(gLevel);
	}
}

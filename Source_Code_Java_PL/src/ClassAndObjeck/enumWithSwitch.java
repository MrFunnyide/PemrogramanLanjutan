package ClassAndObjeck;

public class enumWithSwitch {
	enum difficult {
		easy,
		normal,
		hard
	}
	public static void main(String[] args) {
		// akses enum dulu
		difficult diff = difficult.hard;
		
		// masukkan enum ke switch
		
		switch (diff) {
		case easy:
			System.out.println("level easy");
			break;
		case normal:
			System.out.println("level normal");
			break;
		case hard:
			System.out.println("level hard");
			break;
		}
	}
}
// output = level hard
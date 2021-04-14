package ClassAndObjeck;

public class demoInnerClass {
	public static void main(String[] args) {
		outerClass oClass = new outerClass();
		outerClass.innerClass iClass = oClass.new innerClass();
		System.out.println(oClass.x + iClass.y);
	}
}

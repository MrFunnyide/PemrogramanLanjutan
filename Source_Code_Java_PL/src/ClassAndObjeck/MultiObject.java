package ClassAndObjeck;

public class MultiObject {
	int x = 3;
	
	public static void main(String[] args) {
		MultiObject multiObject =  new MultiObject();	// object pertama
		MultiObject multiObject2 = new MultiObject();	// object kedua
		
		multiObject2.x = 40;
		System.out.println(multiObject.x);
		System.out.println(multiObject2.x);
		
	}
}

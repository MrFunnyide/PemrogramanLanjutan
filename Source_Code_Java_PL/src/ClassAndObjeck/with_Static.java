package ClassAndObjeck;

public class with_Static {
	 static String name = null;
	 
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public static void main(String[] args) {
		with_Static wStatic = new with_Static();
		with_Static wStatic2 = new with_Static();
		
		wStatic.setName("Aji Bayu");
		System.out.println("Nama : " + wStatic.getName());
		System.out.println("Nama : " + wStatic2.getName());
	}
}

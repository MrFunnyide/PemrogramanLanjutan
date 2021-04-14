package ClassAndObjeck;

public class non_Static {
	String nama = null;
	
	public String getName() {
		return nama;
	}
	
	public void setName(String nama) {
		this.nama = nama;
	}
	
	public static void main(String[] args) {
		non_Static nStatic = new non_Static();
		non_Static nStatic2 = new non_Static();
		
		nStatic.setName("Aji Bayu");
		
		System.out.println("Nama " + nStatic.getName());
		System.out.println("Nama " + nStatic2.getName());
	}
}

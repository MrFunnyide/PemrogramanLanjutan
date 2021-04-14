package ClassAndObjeck;

public class callConsWithThis {
	String nama;
	String alamat;
	
	// construktor
	public callConsWithThis() {
		// TODO Auto-generated constructor stub
		System.out.println("construktor di panggil");
		
	}
	
	callConsWithThis(String nama, String alamat) {
		this();
		this.nama = nama;
		this.alamat = alamat;
		
	}
	
	void tampilkan() {
		System.out.println("Nama : " + nama + "\nAlamat : " + alamat);
	}
	
	public static void main(String[] args) {
		callConsWithThis cThis = new callConsWithThis("aji Bayu", "suak rengas");
		
//		cThis.tampilkan();
		
		
	}
}

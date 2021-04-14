package ClassAndObjeck;

public class Main {
	// TODO write your code here
	// This is field data
	String nama;	// tipe_data nama_field
	int umur;
	String alamat;
	
	// This is Method
		void printMain(String nama, String alamat, int umur) {
			// TODO code to be executed
			// use this
			this.nama = nama;
			this.alamat = alamat;
			this.umur = umur;
		
			
		}
	
	// this is Method non void
	void cetakMain() {
		System.out.println("Nama saya adalah " + nama + " alamat saya di " + alamat + " umur saya " + umur);
	}
	
	// this  is construktor
	Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		//this is Object
		Main mn = new Main();
		mn.printMain("Aji", "Suak Rengas", 18);
		// print 
		mn.cetakMain();
	}

}

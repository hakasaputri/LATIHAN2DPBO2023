/* Saya Hakasa Putri mengerjakan Latihan 2 DPBO 2023 C2 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

public class Mahasiswa{

    //atribut private kelas Mahasiswa
    private String NIM = "" ;
    private String Nama = "";
	private String Gender = "";
	private String Fakultas = "";
	private String Prodi = "";

    
    public Mahasiswa(){ //konstruktor kosong

    }

    //metode getter dan setter
	

	public String getNIM() {
		return this.NIM;
	}

	public void setNIM(String NIM) {
		this.NIM = NIM;
	}

	public String getNama() {
		return this.Nama;
	}

	public void setNama(String Nama) {
		this.Nama = Nama;
	}

	public String getGender() {
		return this.Gender;
	}

	public void setGender(String Gender) {
		this.Gender = Gender;
	}

	public String getFakultas() {
		return this.Fakultas;
	}

	public void setFakultas(String Fakultas) {
		this.Fakultas = Fakultas;
	}

	public String getProdi() {
		return this.Prodi;
	}

	public void setProdi(String Prodi) {
		this.Prodi = Prodi;
	}

    //untuk print atribut kelas Mahasiswa
    public void getInfoMahasiswa(){

        System.out.println("NIM    		 : " + getNIM());
        System.out.println("Nama         : " + getNama());
		System.out.println("Gender       : " + getGender());
		System.out.println("Fakultas     : " + getFakultas());
		System.out.println("Prodi        : " + getProdi());
        
    } 

}
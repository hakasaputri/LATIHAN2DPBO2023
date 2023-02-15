/* Saya Hakasa Putri mengerjakan Latihan 2 DPBO 2023 C2 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

class Human extends Mahasiswa{ //class Human turunan dari class Product

    //atribut private kelas Human
    private String NIK = "";
    private String NamaHuman = "";
	private String GenderHuman = "";


    public Human(){ //kontruktor kosong

    }

    //metode getter dan setter

	public String getNIK() {
		return this.NIK;
	}

	public void setNIK(String NIK) {
		this.NIK = NIK;
	}

	public String getNamaHuman() {
		return this.NamaHuman;
	}

	public void setNamaHuman(String NamaHuman) {
		this.NamaHuman = NamaHuman;
	}

	public String getGenderHuman() {
		return this.GenderHuman;
	}

	public void setGenderHuman(String GenderHuman) {
		this.GenderHuman = GenderHuman;
	}

    //untuk print atribut kelas Human turunan kelas Product
    public void getInfoHuman(){

        System.out.println("NIK          : " + getNIK());
        System.out.println("Nama Human    : " + getNamaHuman());
		System.out.println("Gende rHuman  : " + getGenderHuman());

        
    } 


}
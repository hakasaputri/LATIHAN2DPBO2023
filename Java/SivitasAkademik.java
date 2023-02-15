/* Saya Hakasa Putri mengerjakan Latihan 2 DPBO 2023 C2 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

class SivitasAkademik extends Human{ //kelas SivitasAkademik turunan dari kelas Human

    //atribut private kelas Memory
    private String asal_univ = "";
    private String email_edu = "";


    public SivitasAkademik(){ //konstruktor kosong

    }

    //metode getter dan setter

    public String getasal_univ() {
		return this.asal_univ;
	}

	public void setasal_univ(String asal_univ) {
		this.asal_univ = asal_univ;
	}

	public String getemail_edu() {
		return this.email_edu;
	}

	public void setemail_edu(String email_edu) {
		this.email_edu = email_edu;
	}

	
    //untuk print atribut kelas Sivitaskademik turunan kelas Human
    public void getInfoSivitasAkademik(){
            
        System.out.println("Asal Universitas    : " + getasal_univ());
        System.out.println("Email UPI EDU       : " + getemail_edu());

    } 

    
}
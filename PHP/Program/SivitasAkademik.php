<?php

/* Saya Hakasa Putri mengerjakan Latihan 2 DPBO 2023 C2 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */


include "Human.php"; //import class Human

class SivitasAkademik extends Human{ //class Sivitas Akademik turunan dari class Human

    //atribut private class Sivitas Akademik

    private $asal_univ;
    private $email_edu;

    public function __construct(){ //constructor

    }

    //setter getter

	public function getasal_univ() {
		return $this->asal_univ;
	}

	public function setasal_univ($asal_univ) {
		$this->asal_univ = $asal_univ;
	}

	public function getemail_edu() {
		return $this->email_edu;
	}

	public function setemail_edu($email_edu){
		$this->email_edu = $email_edu;
	}

    //Tampilkan atribut class sivitas akademik
    public function getInfoSivitasAkademik(){

        echo "Asal Universitas  : ". $this->getasal_univ()."<br/>";
        echo "email_edu         : ". $this->getemail_edu()."<br/>";
        
    } 

	public function __destruct(){ //desctructor
		
	}
}
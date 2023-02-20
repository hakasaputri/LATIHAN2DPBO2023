<?php

/* Saya Hakasa Putri mengerjakan Latihan 2 DPBO 2023 C2 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */


class Human{

    //atribut private class Human

    private $nik;
    private $nama;
	private $gender;

    public function __construct(){ //constructor

    }

    //setter getter
	public function getnik() {
		return $this->nik;
	}

	public function setnik($nik) {
		$this->nik = $nik;
	}

	public function getnama() {
		return $this->nama;
	}

	public function setnama($nama) {
		$this->nama = $nama;
	}

	public function getgender() {
		return $this->gender;
	}

	public function setgender($gender) {
		$this->gender = $gender;
	}

    //Tampilkan atribut kelas Human
    public function getInfoHuman(){

        echo "NIK               : ". $this->getnik()."<br/>";
        echo "Nama              : ". $this->getnama()."<br/>";
		echo "Gender            : ". $this->getgender()."<br/>";
        
    } 

	public function __destruct(){ //desctructor
		
	}
}

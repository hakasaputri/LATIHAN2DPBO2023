<?php

/* Saya Hakasa Putri mengerjakan Latihan 2 DPBO 2023 C2 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

include "SivitasAkademik.php"; //import class Sivitas Akademik

class Mahasiswa extends SivitasAkademik{ //class Mahasiswa turunan dari class Sivitas Akademik

    //atribut private kelas mahasiswa

    private $fakultas;
    private $prodi;
    private $nim;

    public function __construct(){ //constructor

    }

    //setter getter

	public function getfakultas() {
		return $this->fakultas;
	}

	public function setfakultas($fakultas) {
		$this->fakultas = $fakultas;
	}

	public function getprodi() {
		return $this->prodi;
	}

	public function setprodi($prodi) {
		$this->prodi = $prodi;
	}

    public function getnim() {
		return $this->nim;
	}

	public function setnim($nim) {
		$this->nim = $nim;
	}

    //untuk print atribut kelas Mahasiswa
    public function getInfoMahasiswa(){

        echo "NIM               : ". $this->getnim()."<br/>";
		echo "Fakultas          : ". $this->getfakultas()."<br/>";
        echo "Prodi             : ". $this->getprodi()."<br/>";
    } 

	public function __destruct(){ //destructor

	}
}

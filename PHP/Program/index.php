<?php

/* Saya Hakasa Putri mengerjakan Latihan 2 DPBO 2023 C2 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */
 
include "Mahasiswa.php"; //include file class Mahasiswa 

$mahasiswa1 = new Mahasiswa(); //membuat objek untuk mahasiswa 1
$mahasiswa2 = new Mahasiswa(); //membuat objek untuk mahasiswa 2

//setter getter mahasiswa ke 1
$mahasiswa1->setnik("2007698");
$mahasiswa1->setnama("Hakasa");
$mahasiswa1->setgender("Perempuan");
$mahasiswa1->setasal_univ("UPI");
$mahasiswa1->setemail_edu("hakasa@upi.edu");
$mahasiswa1->setnim("2007698");
$mahasiswa1->setfakultas("FPMIPA");
$mahasiswa1->setprodi("Ilkom");

//setter getter mahasiswa ke 2
$mahasiswa2->setnik("2007688");
$mahasiswa2->setnama("Sunoo");
$mahasiswa2->setgender("Laki-laki");
$mahasiswa2->setasal_univ("UPI");
$mahasiswa2->setemail_edu("sunoo@upi.edu");
$mahasiswa2->setnim("2007688");
$mahasiswa2->setfakultas("FPMIPA");
$mahasiswa2->setprodi("Biologi");

//Tampilkan data mahasiswa ke 1
echo "============================". "<br/>";
echo "    Data mahasiswa ke 1     ". "<br/>";
echo "============================". "<br/>";
$mahasiswa1->getInfoHuman();
$mahasiswa1->getInfoSivitasAkademik();
$mahasiswa1->getInfoMahasiswa();

echo "<br/>";


//Tampilkan data mahasiswa ke 2
echo "============================". "<br/>";
echo "    Data mahasiswa ke 2     ". "<br/>";
echo "============================". "<br/>";
$mahasiswa2->getInfoHuman();
$mahasiswa2->getInfoSivitasAkademik();
$mahasiswa2->getInfoMahasiswa();
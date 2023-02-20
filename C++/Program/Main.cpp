/* Saya Hakasa Putri mengerjakan Latihan 2 DPBO 2023 C2 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */


#include <iostream>
#include <string>
#include <bits/stdc++.h>

using namespace std;


#include "Mahasiswa.cpp" //import file class Mahasiswa


int main(){

    int n =0, i = 0; //variabel untuk jumlah banyaknya mahasiswa dan iterasi

    cout << "Masukan banyaknya mahasiswa : "; 
    cin>>n; //meminta jumlah banyaknya mahasiswa

    cout << "\n";


    Mahasiswa mahasiswa[n]; //membuat array objek 


    for(i=0; i<n; i++){

        string nama;
        string nik;
        string gender;
        string asal_univ;
        string email_edu;
        string nim;
        string fakultas;
        string prodi;       

        //lakukan input data mahasiswa sebanyak n

        cout << "Input Mahasiswa ke " << i+1 << endl;

        cout << "NIK               : ";
        cin >> nik; 
        cout << "Nama              : ";
        cin >> nama; 
        cout << "Gender            : ";
        cin >> gender; 
        cout << "Asal Universitas  : ";
        cin >> asal_univ; 
        cout << "Email Edu         : ";
        cin >> email_edu; 
        cout << "NIM               : ";
        cin >> nim; 
        cout << "Fakultas          : ";
        cin >> fakultas; 
        cout << "Prodi             : ";
        cin >> prodi; 
        cout << "\n";

        //setter getter mengisi atribut
        mahasiswa[i].setnama(nama);
        mahasiswa[i].setnik(nik);
        mahasiswa[i].setgender(gender);
        mahasiswa[i].setasal_univ(asal_univ);
        mahasiswa[i].setemail_edu(email_edu);
        mahasiswa[i].setnim(nim);
        mahasiswa[i].setfakultas(fakultas);
        mahasiswa[i].setprodi(prodi);
    }

    //menampilkan data mahasiswa
    for(i=0; i<n; i++){

        cout << "============================" << endl;
        cout << "    Data mahasiswa ke " << i+1 << endl;
        cout << "============================" << endl;

        //memanggil  getinfo untuk menampilkan data mahasiswa
        mahasiswa[i].getInfoHuman();
        mahasiswa[i].getInfoSivitasAkademik();
        mahasiswa[i].getInfoMahasiswa();

        cout << "\n";
    }

    return 0;
}

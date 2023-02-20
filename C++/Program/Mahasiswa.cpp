/* Saya Hakasa Putri mengerjakan Latihan 2 DPBO 2023 C2 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

#include <iostream>
#include <string>
#include "SivitasAkademik.cpp"

using namespace std; 

class Mahasiswa : public SivitasAkademik{ //kelas Mahasiswa turunan dari kelas Sivitas Akademik

    private:
        // atribut class Mahasiswa
        string fakultas;
        string prodi;
        string nim;

    public:

        Mahasiswa(){ //constructor
        }

        //setter getter

        string getfakultas(){
            return this->fakultas;
        }

        void setfakultas(string fakultas){
            this->fakultas = fakultas;
        }

        string getprodi(){
            return this->prodi;
        }

        void setprodi(string prodi){
            this->prodi = prodi;
        }

        string getnim(){
            return this->nim;
        }

        void setnim(string nim){
            this->nim = nim;
        }

        // tampilkan kelas mahasiswa
        void getInfoMahasiswa(){
            cout << "NIM               : " << getnim() << endl;
            cout << "Fakultas          : " << getfakultas() << endl;
            cout << "Prodi             : " << getprodi() << endl;
            
        }

        ~Mahasiswa(){ //destructor
        }
};


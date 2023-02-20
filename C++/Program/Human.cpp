/* Saya Hakasa Putri mengerjakan Latihan 2 DPBO 2023 C2 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */


#include <iostream>
#include <string>

using namespace std;

class Human{ 

    private:

        // atribut class Human
        string nik;
        string nama;
        string gender;

    
    public:

        Human(){ //constructor
        }

        // setter dan getter

        string getnik(){
            return this->nik;
        }

        void setnik(string nik){
            this->nik = nik;
        }

        string getnama(){
            return this->nama;
        }

        void setnama(string nama){
            this->nama = nama;
        }

         string getgender(){
            return this->gender;
        }

        void setgender(string gender){
            this->gender = gender;
        }
        
        //Tampilkan atribut human
        void getInfoHuman(){
            cout << "NIK               : " << getnik() << endl;
            cout << "Nama              : " << getnama() << endl;
            cout << "Gender            : " << getgender() << endl;
        }

        ~Human(){ //destructor
        }
};


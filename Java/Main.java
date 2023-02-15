/* Saya Hakasa Putri mengerjakan Latihan 2 DPBO 2023 C2 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

import java.util.*;

public class Main{

    public static void main(String[] args){


        int n =0, i = 0; //inisialisasi variabel untuk jumlah input dan iterasi

        System.out.print("Masukan jumlah input : "); 
        
        Scanner sc = new Scanner(System.in); //untuk scanner

        //meminta jumlah input mahasiswa
        try{

            n = Integer.parseInt(sc.nextLine());

        }catch(Exception e){}

    
        SivitasAkademik[] mahasiswa = new SivitasAkademik[n]; //membuat array objek 

        for(i=0; i<n; i++){

            //melakukan input data mahasiswa sebanyak n

            String NIM = "";
            String NIK = "";
            String Nama = "";
            String NamaHuman = "";
            String GenderHuman = "";
            String Gender = "";
            String Fakultas = "";
            String Prodi = "";
            String asal_univ = "";
            String email_edu = "";

            System.out.println("INPUT MAHASISWA " + (i+1));

            System.out.print("NIM : ");
            try{

                NIM = sc.nextLine();
            }catch(Exception e){}

            System.out.print("Nama : ");
            try{

                Nama = sc.nextLine();

            }catch(Exception e){}

            System.out.print("Gender : ");
            try{

                Gender = sc.nextLine();

            }catch(Exception e){}

            System.out.print("Fakultas : ");
            try{

                Fakultas = sc.nextLine();

            }catch(Exception e){}

            System.out.print("Prodi : ");
            try{

                Prodi = sc.nextLine();

            }catch(Exception e){}

            System.out.print("NIK : ");
            try{

                NIK = sc.nextLine();

            }catch(Exception e){}

            System.out.print("Nama Human  : ");
            try{

                NamaHuman = sc.nextLine();

            }catch(Exception e){}

            System.out.print("Gender Human : ");
            try{

                GenderHuman = sc.nextLine();

            }catch(Exception e){}

            System.out.print("Asal Iniversitas : ");
            try{

                asal_univ = sc.nextLine();

            }catch(Exception e){}

            System.out.print("Email Edu : ");
            try{

                email_edu = sc.nextLine();

            }catch(Exception e){}

            System.out.println();
            
            mahasiswa[i] = new SivitasAkademik(); //instantiation

            //gunakan prosedur setter dari objek untuk mengisi atribut
            mahasiswa[i].setNama(Nama);
            mahasiswa[i].setNamaHuman(NamaHuman);
            mahasiswa[i].setNIM(NIM);
            mahasiswa[i].setNIK(NIK);
            mahasiswa[i].setGender(Gender);
            mahasiswa[i].setGenderHuman(GenderHuman);
            mahasiswa[i].setFakultas(Fakultas);
            mahasiswa[i].setProdi(Prodi);
            mahasiswa[i].setasal_univ(asal_univ);
            mahasiswa[i].setemail_edu(email_edu);

        }
        

        //menampilkan data mahasiswa
        for(i=0; i<n; i++){

            System.out.println("============================");
            System.out.println("       Data mahasiswa " + (i+1));
            System.out.println("============================");

            //memanggil prosedur get info untuk di print
            mahasiswa[i].getInfoMahasiswa();
            mahasiswa[i].getInfoHuman();
            mahasiswa[i].getInfoSivitasAkademik();

            System.out.println();
        }
        
    }
}
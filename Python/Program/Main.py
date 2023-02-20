# Saya Hakasa Putri mengerjakan Latihan 2 DPBO 2023 C2 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
# kecurangan seperti yang telah dispesifikasikan. Aamiin 

# import class
from Mahasiswa import Mahasiswa 

n = 0 # menyimpan jumlah input
i = 0 # iterasi

n = int(input("Masukan banyaknya mahasiswa : ")) # meminta banyaknya jumlah mahasiswa

print()

mahasiswa = [Mahasiswa() for i in range(n)] # membuat array objek 

for i in range(n):
    
    print("Input Mahasiswa ke " + str(i+1));
    # input data mahasiswa sebanyak n

    print("NIK               : ", end ="")
    nik = str(input())

    print("Nama              : ", end ="")
    nama = str(input())

    print("Gender            : ", end ="")
    gender = str(input())

    print("Asal Universitas  : ", end ="")
    asal_univ = str(input())

    print("Email EDU         : ", end ="")
    email_edu = str(input())

    print("NIM               : ", end ="")
    nim = str(input())

    print("Fakultas          : ", end ="")
    fakultas = str(input())

    print("Prodi             : ", end ="")
    prodi = str(input())
    print()

    # setter dan getter mengisi atribut
    mahasiswa[i].setnama(nama)
    mahasiswa[i].setnik(nik)
    mahasiswa[i].setnim(nim)
    mahasiswa[i].setgender(gender)
    mahasiswa[i].setfakultas(fakultas)
    mahasiswa[i].setprodi(prodi)
    mahasiswa[i].setasal_univ(asal_univ)
    mahasiswa[i].setemail_edu(email_edu)



for i in range(n):
    # menampilkan data mahasiswa
    print("============================")
    print("     Data mahasiswa ke " + str(i+1))
    print("============================")

    # memanggil getinfo untuk menampilkan data mahasiswa
    mahasiswa[i].getInfoHuman()
    mahasiswa[i].getInfoSivitasAkademik()
    mahasiswa[i].getInfoMahasiswa()

    print()


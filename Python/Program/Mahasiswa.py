# Saya Hakasa Putri mengerjakan Latihan 2 DPBO 2023 C2 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
# kecurangan seperti yang telah dispesifikasikan. Aamiin  

from SivitasAkademik import SivitasAkademik

class Mahasiswa(SivitasAkademik): # kelas Mahasiswa turunan dari kelas Sivitas Akademik

    def __init__(self): #Constructor

        # atribut
        self.fakultas = "";
        self.prodi = "";
        self.nim = "";


    # setter getter
      
    def getfakultas(self):
        return self.fakultas
        
    def setfakultas(self, fakultas):
        self.fakultas = fakultas

    def getprodi(self):
        return self.prodi
        
    def setprodi(self, prodi):
        self.prodi = prodi
       
    def getnim(self):
        return self.nim
        
    def setnim(self, nim):
        self.nim = nim
      

    # untuk print atribut kelas Mahasiswa
    def getInfoMahasiswa(self):
        print("NIM               : " + self.getnim())
        print("Fakultas          : " + self.getfakultas())
        print("Prodi             : " + self.getprodi())


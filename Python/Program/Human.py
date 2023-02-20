
# Saya Hakasa Putri mengerjakan Latihan 2 DPBO 2023 C2 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
# kecurangan seperti yang telah dispesifikasikan. Aamiin 

class Human:


    def __init__(self): #Constructor

        # atribut
        self.nik = ""
        self.nama = ""
        self.gender = ""


    # setter getter
    def getnik(self):
        return self.nik
    
    def setnik(self, nik):
        self.nik = nik
    
    def getnama(self):
        return self.nama
    
    def setnama(self, nama):
        self.nama = nama
    
    def getgender(self):
        return self.gender
    
    def setgender(self, gender):
        self.gender = gender
    

    # Tampilkan atribut kelas Human
    def getInfoHuman(self):
        print("NIK               : " + self.getnik())
        print("Nama              : " + self.getnama())
        print("Gender            : " + self.getgender())
    

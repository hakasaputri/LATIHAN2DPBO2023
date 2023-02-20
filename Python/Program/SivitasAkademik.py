# Saya Hakasa Putri mengerjakan Latihan 2 DPBO 2023 C2 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
# kecurangan seperti yang telah dispesifikasikan. Aamiin 

from Human import Human

class SivitasAkademik(Human): # class Sivitas Akademik turunan dari class Human

    def __init__(self): #Constructor

        # atribut
        self.asal_univ = "";
        self.email_edu = "";


    # setter getter

    def getasal_univ(self):
        return self.asal_univ
    
    def setasal_univ(self, asal_univ):
        self.asal_univ = asal_univ
    
    def getemail_edu(self):
        return self.email_edu
        
    def setemail_edu(self, email_edu):
        self.email_edu = email_edu
    

    # untuk print atribut kelas Sivitas Akademik
    def getInfoSivitasAkademik(self):
        print("Asal Universitas  : " + self.getasal_univ())
        print("Email Edu         : " + self.getemail_edu())

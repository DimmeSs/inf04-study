# ***********
# klasa: Notatka
# opis: Klasa reprezentuje notatnik , ma w sobie ,tytuł, treść, id (który się inkrementuje)  i licznik 
#       
# pola: __licznik - przyjmuje int który się inkrementuje
#         id - przyjmuje int który się inkrementuje
#       _tytul - przyjmuje string
#       _tresc - przyjmuje string
# autor:42343244
#********
class Notatka:
    __licznik = 0
    def __init__(self,tytul,tresc):
        Notatka.__licznik+=1
        self.id = Notatka.__licznik
        self._tytul = tytul
        self._tresc = tresc
        
    def wyswietlNotatke(self):
        print(f"\nTytuł: {self._tytul} \n Treść: {self._tresc}\n")
    def wyswietldiagnostyka(self):
        print(f"Tytuł: {self._tytul} ; Treść: {self._tresc} ; Id: {self.id} ; Licznik: {Notatka.__licznik}\n")
N1 = "Nazwa1"
T1 = "Pierwsza treść tekstu wygląda w taki sposób"
N2 = "Nazwa2"
T2 = "Druga treść tekstu wygląda w taki sposób"

object1 = Notatka(N1,T1)
object1.wyswietlNotatke()
object1.wyswietldiagnostyka()

object2 = Notatka(N2,T2)
object2.wyswietlNotatke()
object2.wyswietldiagnostyka()





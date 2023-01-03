import random
import time
import os

def gra(tryb):
    pc = ""
    Szansa = None# Czy można wygrać
    while True:
        
        while True:
            w = input("Wpisz swoją odpowiedź ( Kamien / Papier / Nozyce ) xX Bez Polskich Znaków Xx\n").upper()
            if len(w) == 6:break
            else:print("----------------------\nWpisz poprawną rzecz\n-----------------------------")
                
        if tryb == "1":Szansa = random.randint(1,7)
        elif tryb == "2": Szansa = random.randint(1,4)
        else:Szansa = random.randint(1,2)
            #np 4
        #ŚREDNI - Jeżeli 1 to remis | 2-3 Przegrałeś | 4 Wygrałeś
        #ŁATWY - Jeżeli 2 to remis | 1 Przegrałeś | 3-7 Wygrałeś
        #TRUDNY - Jeżeli 1 to remis | 0 Przegrałeś

        print("------------------------------------\nWpisałeś:",w,"\n=> Komputer Wpisuuje swoją odpowiedź <=\n# WYNIK #")#Za każdym razem się powtarza, więc wyciągam przed if'y

        time.sleep(2)#Tak samo jak if się powtarzał
        if Szansa == 1: 
            print("# REMIS #\nKomputer wybrał",w)
            break

        elif Szansa == 2 or Szansa == 3:
            
            if w == "KAMIEN":pc = "PAPIER"
            elif w == "PAPIER":pc = "NOZYCE"
            else:pc = "KAMIEN"
            
            print("# Przegrałeś #\nKomputer wybrał",pc)

        elif Szansa > 3:
            if w == "KAMIEN":pc = "NOZYCE"
            elif w == "PAPIER":pc = "KAMIEN"
            else:pc = "PAPIER"

            print("# Wygrałeś #\nKomputer wybrał",pc)

        while True:
            chc = input("-------------------\nTry Again ? y/n\n").lower()

            if chc == "n":return False
            elif chc == "y":
                os.system('cls')
                break
            else:print("Wpisz Ponownie")
        
print(" // Witaj W Grze papier kamień nożyce \\\ \nWpisz poniżej liczbe która definiuje jaki tryb gry chcesz grać :")
pc = ""
tryb = input("wprowadź tryb: \n[1] Łatwy\n [2] Trudny\n [3] Niemożliwy")
gra(tryb)


    
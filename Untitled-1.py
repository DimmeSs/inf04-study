'''import os
os.system('cls||clear')
print("Witamy w kawiarni :3 \n Jak masz na imie ?")
imie = input()
menu = "Frapp, Coffe, Latte, Capp"
zamowienie = input("Witaj "+ str(imie)+". Jaką kawę chcesz zamówić? \nOto nasze Menu :" + str(menu)+"\n")
cena = 8
if zamowienie == "Frapp":
    cena = 4
elif zamowienie == "Coffe":
    cena = 6
elif zamowienie == "Latte":
    dod = input("Czy chcesz do tego śmietane ? Tak / Nie\n")
    if dod == "Tak" or dod == "tak":
        cena = 18
    else:
        cena = 15
elif zamowienie == "Capp":
    cena = 8
print("Zamówiłeś: "+ zamowienie + ". Kosztować będzie Ciebie to "+str(cena)+"$")
exit()
'''
print("Hello, welcome to NetworkChuck Coffee! ! ! ! ! ! ! ! ! ! ! ! ! !")
name = input ("What is your name? \n")

if name == "Ben" or name == "Patricia" or name == "Loki" :
    evil_status = input("Are you evil?\n")
    Deeds = int(input("How many good deeds have you done today?\n"))
    if evil_status.upper() == "YES" and Deeds < 4:
        print("You're not welcome here " + name + ". GBenEt out of here! !")
        end = input("Press Enter to Exit") 
        exit( )
    else :
        print("Hello " + name + ", thank you so much for coming in today . \n\n\n")
else :
    print( "Hello " + name + ", thank you so much for coming in today . \n\n\n")
    end = input("Press Enter to exit")
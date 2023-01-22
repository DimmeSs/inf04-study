import os
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
        cena = 10
elif zamowienie == "Capp":
    cena = 8
print("Zamówiłeś: "+ zamowienie + ". Kosztować będzie Ciebie to "+str(cena)+"$")
exit()
while True:
    
    try:
        wiek = int(input("Ile masz lat ?"))
        if wiek >= 21: print("you can drink normally")
        elif wiek < 18:print("You are too young")
        elif wiek >= 18 and wiek <= 21:print("you got wristband")
        input("zakoncz program")
        break#I tak za każdym razem się wykona, jeżeli wszystko będzie dobrze, więc nie ma potrzeby redundancji danych
    except ValueError:
        print("Wpisz liczbe nie wyrazy ani pustke")
        
    
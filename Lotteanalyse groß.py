from random import randint

def durchschnitt_errechnen(liste):
    rechner = 0
    for value in liste:
        rechner += value
    rechner = rechner / len(liste)
    return rechner

wahrscheinlichkeit = [None, None]
for i in range(0, 999):
    werteliste = []
    for value in range(1, 100):
        ziehung = None
        zähler = 0
        while i != ziehung:
            ziehung = randint(0, 999)
            zähler += 1
        werteliste.append(zähler)
    ausgabe_durchschnitt = durchschnitt_errechnen(werteliste)
    try:
        if ausgabe_durchschnitt < wahrscheinlichkeit[0]:
            wahrscheinlichkeit[0] = ausgabe_durchschnitt
            wahrscheinlichkeit[1] = i
    except TypeError:
        wahrscheinlichkeit[0] = ausgabe_durchschnitt
        wahrscheinlichkeit[1] = i

print(f"Die Zahl {wahrscheinlichkeit[1]} ist mit durchschnittlich"
      f" {wahrscheinlichkeit[0]} Ziehungen die Zahl der Wahl.")

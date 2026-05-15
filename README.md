# SOFTWARE HOUSE TEAM MANAGER

## OPIS PROJEKTU
Projekt przedstawia prostą aplikację konsolową napisaną w języku Java, która symuluje zarządzanie zespołem projektowym w software house.

Aplikacja umożliwia tworzenie różnych typów pracowników, przechowywanie ich w jednej strukturze danych oraz obliczanie kosztów zespołu.

---

## FUNKCJONALNOŚCI
- tworzenie pracowników (Programista, Tester)
- przechowywanie pracowników w jednej liście (ArrayList)
- obliczanie miesięcznego kosztu zespołu
- wyświetlanie informacji o pracownikach
- wyszukiwanie pracownika po ID
- filtrowanie pracowników z użyciem instanceof
- porównywanie obiektów metodą equals()

---

## ZASTOSOWANE ELEMENTY PROGRAMOWANIA OBIEKTOWEGO
- dziedziczenie (extends)
- polimorfizm
- nadpisywanie metod (@Override)
- metoda final w klasie nadrzędnej
- klasa Object (toString, equals)
- rzutowanie z użyciem instanceof
- ArrayList

---

## STRUKTURA PROJEKTU
- Pracownik – klasa nadrzędna zawierająca wspólne pola
- Programista – klasa potomna z dodatkowymi danymi technicznymi
- Tester – klasa potomna z danymi testowymi
- ZespolProjektowy – zarządzanie listą pracowników
- Main – scenariusz działania aplikacji

---

## URUCHOMIENIE PROGRAMU

Kompilacja:
```bash
javac *.java
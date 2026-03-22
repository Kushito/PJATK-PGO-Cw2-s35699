Autor kodu: Kucyk Krzysztof | s35699
Nazwa projektu: PJATK-PGO-Cw2-s35699

Opis: Prosta struktura projekty wyporzyczenia książek w wymaginowanej Bibliotece

Opis kodu:

plik: Main.java

    Główny plik, inicjalizacja wszystkich obiektów i metod

plik: Ksiazka.java

zmienne:
    private String tytul - tytul ksiazek
    private String autor - imie i nazwisko autora
    private int liczbaStron - liczba stron ksiazki
    private boolean dostepna - status true\false czy jest ona aktualnie dostepna
metody:
    Konstruktor - inicjalizacja obiektu Ksiazka
    void setAutor/Tytul/LuiczbaStron/Dostepna - przypisanie pobranych informacji do zmiennych
    String getAutor/Tytul - pobranie informacji o tytule i autorze
    int getLiczbaStron - pobranie liczby stron
    boolean isDFostepna - pobranie informacji o dostepnosci
    void wypiszInfo - wypisanie informacji o ksiazce
    void wyporzycz - zmiana boolean dostepna z true na false
    void zwroc - zmiana boolean dostepna z false na true

plik: Czytelnik.java

zmienne:
    private String imie - imie czytelnika
    private String nazwisko - nazwisko czytelnika
    private int nrKarty - numer karty czytelnika
    private int liczbaWypozyczonych - liczba ksiazek wyporzyczonych przez czytelnika
metody:
    KonKonstruktor - inicjalizacja obiektu Czytelnik
    void wypiszDane - wypisanie informacji o czytelniku
    void wypozycz - zmiana int liczbaWyporzyczonych o 1 w gore
    void zwroc - zmiana int liczbaWyporzyczonych o 1 w dol

plik: Biblioteka.java

zmienne:
    private Ksiazka[] ksiazki - utworzenie tablicy ksiazek na podstawie obniektu Ksiazka
    private int liczbaKsiazek - liczba ksiazek w bibliotece
metody:
    KonKonstruktor - inicjalizacja obiektu Biblioteka
    void dodajKsiazke - dodanie do tabeli nowa ksiazke
    void wypiszKsiazki - wypisanie wyszystkich ksiazek dostepnych w bibliotece
    Ksiazka znajdzKsiazke - znajdowanie ksiazke po tytule 
    void policzDostepneKsiazki - policzenie wszytskich dostepnych aktualnie ksiazek w bibliotece
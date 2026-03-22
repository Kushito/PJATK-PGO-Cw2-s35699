public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int maxKsiazek) {
        this.ksiazki = new Ksiazka[maxKsiazek];
        this.liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        } else {
            System.out.println("Nie można dodać więcej książek. Biblioteka jest pełna.");
        }
    }

    public void wypiszKsiazki() {
        for (int i = 0; i < liczbaKsiazek; i++) {
            ksiazki[i].wypiszInfo();
            System.out.println("--------------------------------------------------");
        }
    }

    public Ksiazka znajdzKsiazke(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equalsIgnoreCase(tytul)) {
                return ksiazki[i];
            }
        }
        System.out.println("Nie znaleziono książki o tytule: " + tytul);
        return null;
    }

    public void policzDostepneKsiazki() {
        int count = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                count++;
            }
        }
        System.out.println("Liczba dostępnych książek: " + count);
    }
}

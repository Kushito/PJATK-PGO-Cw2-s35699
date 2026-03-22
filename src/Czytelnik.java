public class Czytelnik {
    
    private String imie;
    private String nazwisko;
    private int nrKarty;
    private int liczbaWypozyczonych;

    public Czytelnik(String imie, String nazwisko, int nrKarty, int liczbaWypozyczonych) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrKarty = nrKarty;
        this.liczbaWypozyczonych = liczbaWypozyczonych;
    }

    public void wypiszDane() {
        System.out.println("Imie: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Nr karty: " + this.nrKarty);
        System.out.println("Liczba wypozyczonych ksiazek: " + this.liczbaWypozyczonych);
    }

    public void wypozycz() {
        this.liczbaWypozyczonych++;
    }

    public void zwroc() {
        this.liczbaWypozyczonych--;
    }
}

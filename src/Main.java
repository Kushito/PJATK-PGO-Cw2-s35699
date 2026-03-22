public class Main {
    public static void main(String[] args) {
        Ksiazka ks1 = new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", 420, true);
        Ksiazka ks2 = new Ksiazka("lorem", "impsum", 20, false);
        Ksiazka ks3 = new Ksiazka("Dolor", "Sit", 10, false);
        Ksiazka ks4 = new Ksiazka("Amet", "Ano", 50, true);

        ks1.wypiszInfo();
        System.out.println("--------------------------------------------------");
        ks2.zwroc();
        ks3.wyporzycz();
        ks4.wyporzycz();
        ks2.wypiszInfo();
        System.out.println("--------------------------------------------------");
        ks4.wypiszInfo();
        System.out.println("--------------------------------------------------");
        Czytelnik cz1 = new Czytelnik("Jan", "Kowalski", 123, 0);
        Czytelnik cz2 = new Czytelnik("Adam", "Nowak", 456, 2);

        cz1.wypiszDane();
        System.out.println("--------------------------------------------------");
        cz2.wypozycz();
        cz2.wypiszDane();
        System.out.println("--------------------------------------------------");

        Biblioteka biblioteka = new Biblioteka(10);
        biblioteka.dodajKsiazke(ks1);
        biblioteka.dodajKsiazke(ks2);
        biblioteka.dodajKsiazke(ks3);
        biblioteka.dodajKsiazke(ks4);
        biblioteka.wypiszKsiazki();
        System.out.println("--------------------------------------------------");
        biblioteka.znajdzKsiazke("lorem").wypiszInfo();
        System.out.println("--------------------------------------------------");
        biblioteka.policzDostepneKsiazki();
        
    }    
}
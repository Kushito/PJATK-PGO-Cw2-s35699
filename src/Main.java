public class Main {
    public static void main(String[] args) {
        Ksiazka ks1 = new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", 420, true);
        Ksiazka ks2 = new Ksiazka("lorem", "impsum", 20, false);
        Ksiazka ks3 = new Ksiazka("Dolor", "Sit", 10, false);
        Ksiazka ks4 = new Ksiazka("Amet", "Ano", 50, true);

        ks1.wypiszInfo();
        ks2.zwroc();
        ks4.wyporzycz();
        ks2.wypiszInfo();
        ks4.wypiszInfo();
    }
}
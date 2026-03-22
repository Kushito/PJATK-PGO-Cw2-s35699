public class Ksiazka {

    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    Ksiazka(String tytul, String autor, int liczbaStron,  boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = false;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public boolean isDostepna() {
        return dostepna;
    }

    public void setDostepna(boolean dostepna) {
        this.dostepna = dostepna;
    }

    public void wypiszInfo() {
        System.out.println("tytul: " + this.tytul);
        System.out.println("autor: " + this.autor);
        System.out.println("Liczba stron: " + this.liczbaStron);
        if (dostepna == true) {
            System.out.println("Dostepna");
        }else  {
            System.out.println("Dostepna");
        }
    }

    public void wyporzycz(){
        this.dostepna = false;
    }

    public void zwroc(){
        this.dostepna = true;
    }
}

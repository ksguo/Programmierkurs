package VOB10_a1;

public class Book {

    private String titel;
    private String autor;
    private String isbnNummer;
    private int anzahlExemplare;

    public Book(String titel,String autor,String isbnNummer,int anzahlExemplare){
        this.titel = titel;
        this.autor = autor;
        this.isbnNummer = isbnNummer;
        this.anzahlExemplare = anzahlExemplare;

    }

    @Override
    public String toString() {
        return "Book{" +
                "titel='" + titel + '\'' +
                ", autor='" + autor + '\'' +
                ", isbnNummer='" + isbnNummer + '\'' +
                ", anzahlExemplare=" + anzahlExemplare +
                '}';
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbnNummer() {
        return isbnNummer;
    }

    public void setIsbnNummer(String isbnNummer) {
        this.isbnNummer = isbnNummer;
    }

    public int getAnzahlExemplare() {
        return anzahlExemplare;
    }

    public void setAnzahlExemplare(int anzahlExemplare) {
        this.anzahlExemplare = anzahlExemplare;
    }
}

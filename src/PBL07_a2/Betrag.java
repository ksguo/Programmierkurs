package PBL07_a2;

public class Betrag {

    private int euro,cent;

    public Betrag(int euro, int cent){
        this.setEuro(euro);
       this.setCent(cent);
    }

    public int getEuro() {
        return euro;
    }

    public void setEuro(int euro) {
        this.euro = euro;
    }

    public int getCent() {
        return cent;
    }

    public void setCent(int cent) {
        this.euro += cent / 100;
        this.cent = cent % 100;
    }
}

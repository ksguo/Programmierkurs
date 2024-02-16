package PBL07_a3;

public class Bruch {

    private  int nenner,zaehler;
    public Bruch(int n, int z){
        this.setZaehler(z);
        this.setNenner(n);

    }
    //method
    private int ggT(int x, int y){
        if(y==0)
            return x;
        return ggT(y, x%y);

    }

    public void reduce(){
        int ggT = ggT (nenner, zaehler);
        nenner = nenner/ggT;
        zaehler = zaehler/ggT;
    }

    public boolean hasSameValueAs(Bruch b) {

        this.reduce();
        b.reduce();

        if(b.getNenner() == this.getNenner() && b.getZaehler() == this.getZaehler()) {
            return true;
        }

        return false;




    }




    //getter settter

    public int getNenner() {
        return nenner;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }

    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }



}

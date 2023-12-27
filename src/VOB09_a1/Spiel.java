package VOB09_a1;

public class Spiel {

    private Dominostein[] vorrat ;
    private Dominostein[] tisch ;

    public int anzahlZuege = 0;


    public Spiel(Dominostein[] vorrat , Dominostein[] tisch) {

        this.tisch = tisch;
        this.vorrat = vorrat;
    }


    public void macheZug() {

        if(anzahlZuege == 0) {
            tisch[0] = vorrat[0];
            vorrat[0] = null;
            anzahlZuege ++;

        }else {

            for (int i = 0 ; i < vorrat.length ; i++) {
                if( vorrat[i] != null && tisch[anzahlZuege - 1].passRechts(vorrat[i])) {
                    tisch[anzahlZuege] = vorrat[i];
                    vorrat[i] = null ;
                    anzahlZuege ++;
                    break;
                }
            }


        }

    }

    // getter und setter

    public Dominostein[] getVorrat() {
        return vorrat;
    }


    public void setVorrat(Dominostein[] vorrat) {
        this.vorrat = vorrat;
    }


    public Dominostein[] getTisch() {
        return tisch;
    }


    public void setTisch(Dominostein[] tisch) {
        this.tisch = tisch;
    }


    public int getAnzahlZuege() {
        return anzahlZuege;
    }


    public void setAnzahlZuege(int anzahlZuege) {
        this.anzahlZuege = anzahlZuege;
    }


}

package PBL03_a1;

public class A1_main {

    /*
     * Start des Deklarationsbereichs. Achten Sie unbedingt darauf, dass vor jeder
     * Variablendeklaration das Schluesselwort static steht.
     */

    static double guthaben = -100;
    static double monEingang = 200;

    static int rating = -2;
    static boolean warnhinweis = false;
    static boolean negativ = false;


    /*
     * Ende des Deklarationsbereichs.
     */
    public static void main(String[] args) {
        /*
         * Start des algorithmischen Bereichs.
         */
        negativ = false;
        warnhinweis = false;


        if(guthaben < 0 ){
            negativ = true;
            if(Math.abs(monEingang) >= guthaben){
                rating = rating+1;
                warnhinweis = false;
            }else{
                rating = rating-1;
                if(rating < 0 ){
                    warnhinweis = true;
                }
            }

        }else if (guthaben == 0){
            rating = rating+2;
        }else{
            rating = rating+3;
        }






        /*
         * Hier endet der algorithmische Bereich. Dieser Kommentar und damit alles, was
         * darunter steht, darf verschoben werden (wenn Sie zum Beispiel mehr Zeilen
         * brauchen).
         *
         * Alles, was hinter diesem Kommentar steht, darf nicht veraendert werden!
         *
         */

        System.out.println("Guthaben: " + guthaben);
        System.out.println("Negativ? " + negativ);
        System.out.println("Monatlicher Eingang: " + monEingang);
        System.out.println("Neues Rating: " + rating);
        System.out.println("Warnhinweis: " + warnhinweis);

    }

}


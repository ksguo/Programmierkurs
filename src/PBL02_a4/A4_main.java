package PBL02_a4;

public class A4_main {

    /*
     * Start des Deklarationsbereichs. Achten Sie unbedingt darauf, dass vor jeder
     * Variablendeklaration das Schluesselwort static steht.
     */

    static int max  = 5;
    static int fix  =2;
    static int wartend = 2;
    static boolean istVoll =  false;


    /*
     * Ende des Deklarationsbereichs.
     */
    public static void main(String[] args) {
        /*
         * Start des algorithmischen Bereichs.
         */


        // Teil, in dem die freien Fixplätze zugewiesen werden


        int f = max -fix;

        if(wartend > f){
            fix = max;
            wartend = wartend - f;
            istVoll = true;
        }else{
            fix= fix + wartend;
            wartend = 0;
            istVoll = fix == max;
        }





        /*
         * Hier endet der algorithmische Bereich. Dieser Kommentar und damit alles, was
         * darunter steht, darf verschoben werden (wenn Sie zum Beispiel mehr Zeilen
         * brauchen).
         *
         * Alles, was hinter diesem Kommentar steht, darf nicht veraendert werden!
         *
         */

        System.out.println("Wert von fix: " + fix);
        System.out.println("Wert von wartend: " + wartend);
        System.out.println("Wert von istVoll: " + istVoll);

    }

}


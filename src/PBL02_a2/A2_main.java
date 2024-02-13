package PBL02_a2;

public class A2_main {

    /*
     * Start des Deklarationsbereichs. Achten Sie unbedingt darauf, dass vor jeder
     * Variablendeklaration das Schluesselwort static steht.
     */


    static int start = -42;
    static int rund = 1;



    /*
     * Ende des Deklarationsbereichs.
     */
    public static void main(String[] args) {
        /*
         * Start des algorithmischen Bereichs.
         */


        if(start % 10 == 0 ){
            rund = start;
        }
        else if(start > 0 && start%10 != 0){

          rund = start + (10-start%10);

        }
        else if (start < 0 && start%10 != 0) {

           rund = start - start%10;

        }






        /*
         * Hier endet der algorithmische Bereich. Dieser Kommentar und damit alles, was
         * darunter steht, darf verschoben werden (wenn Sie zum Beispiel mehr Zeilen
         * brauchen).
         *
         * Alles, was hinter diesem Kommentar steht, darf nicht veraendert werden!
         *
         */

        System.out.println("Wert von rund: " + rund);

    }

}


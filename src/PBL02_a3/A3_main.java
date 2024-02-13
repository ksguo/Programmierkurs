package PBL02_a3;

public class A3_main {
    /*
     * Start des Deklarationsbereichs. Achten Sie unbedingt darauf, dass vor jeder
     * Variablendeklaration das Schluesselwort static steht.
     */


    static int jahr = 2024;
    static boolean schalt = false;



    /*
     * Ende des Deklarationsbereichs.
     */
    public static void main(String[] args) {

        /*
         * Start des algorithmischen Bereichs.
         */

        if ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {

            schalt = true;
        }else {
            schalt = false;
        }






        /*
         * Hier endet der algorithmische Bereich. Dieser Kommentar und damit alles, was
         * darunter steht, darf verschoben werden (wenn Sie zum Beispiel mehr Zeilen
         * brauchen).
         *
         * Alles, was hinter diesem Kommentar steht, darf nicht veraendert werden!
         *
         */

        System.out.println("Wert von schalt: " + schalt);

    }

}


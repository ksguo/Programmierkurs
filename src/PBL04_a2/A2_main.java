package PBL04_a2;

public class A2_main {
    /*
     * Start des Deklarationsbereichs. Achten Sie unbedingt darauf, dass vor jeder
     * Variablendeklaration das Schluesselwort static steht.
     */

    static int[] numbers = new int[]{4, 7, 90, -120};
    static int d = 1;


    /*
     * Ende des Deklarationsbereichs.
     */

    public static void main(String[] args) {
        /*
         * Start des algorithmischen Bereichs.
         */

        int sum = 0; // Variable für die Summe der Elemente

        // Berechnung der Summe aller Elemente des Arrays
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        //注意sum是负数取整的情况
        d = Math.round((float)sum / numbers.length);




        /*
         * Hier endet der algorithmische Bereich. Dieser Kommentar und damit alles, was
         * darunter steht, darf verschoben werden (wenn Sie zum Beispiel mehr Zeilen
         * brauchen).
         *
         * Alles, was hinter diesem Kommentar steht, darf nicht veraendert werden!
         *
         */

        System.out.println("Durchschnittswert: " + d);
    }

}


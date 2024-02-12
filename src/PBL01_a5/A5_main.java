package PBL01_a5;

public class A5_main {

    /*
     * Start des Deklarationsbereichs. Achten Sie unbedingt darauf, dass vor jeder
     * Variablendeklaration das Schluesselwort static steht.
     */


    static int i =101,j=8,k=3;



    /*
     * Ende des Deklarationsbereichs.
     */

    public static void main(String[] args) {
        /*
         * Start des des algorithmischen Teils.
         */

        int k = 0;
        boolean A1 = i>j;
        boolean A2 = i>200;
        boolean A3 = j>100;

        if(A1 && !A2 && !A3) {
            k = 1;
        }else if (A1 && A2 && !A3) {
            k = 2;
        }else if(A1 && A2 && A3) {
            k = 3;
        }else if (!A1 && !A2 && !A3) {
            k = 4;
        }else {
            k = -10;
        }







        /*
         *
         * Hier endet der algorithmische Teil. Dieser Kommentar darf verschoben werden
         * (wenn Sie zum Beispiel mehr Zeilen brauchen).
         *
         * Alles, was hinter diesem Kommentar steht, darf nicht veraendert werden!
         *
         */

        System.out.println("Wert von i: " + i);
        System.out.println("Wert von j: " + j);
        System.out.println("Wert von k: " + k);

    }

}

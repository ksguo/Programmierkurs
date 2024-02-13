package PBL04_a1;

//Start Importbereich, nicht aendern, nicht loeschen
import java.util.Arrays;
//Ende Importbereich

public class A1_main {
    /*
     * Start des Deklarationsbereichs. Achten Sie unbedingt darauf, dass vor jeder
     * Variablendeklaration das Schluesselwort static steht.
     */


    static int[] myArray = new int[]{1,2,3,4,5};



    /*
     * Ende des Deklarationsbereichs.
     */

    public static void main(String[] args) {
        /*
         * Start des algorithmischen Bereichs.
         */


        int l = myArray.length;
        for(int i = 0;i < l/2; i++){
            int temp = myArray[i];
            myArray[i]=myArray[l-1-i];
            myArray[l-1-i]= temp;
        }



        /*
         * Hier endet der algorithmische Bereich. Dieser Kommentar und damit alles, was
         * darunter steht, darf verschoben werden (wenn Sie zum Beispiel mehr Zeilen
         * brauchen).
         *
         * Alles, was hinter diesem Kommentar steht, darf nicht veraendert werden!
         *
         */

        System.out.println("Umgekehrt: " + Arrays.toString(myArray));

    }

}


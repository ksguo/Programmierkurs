package PBL04_a3;

//Start Importbereich, nicht aendern, nicht loeschen
import java.util.Arrays;
//Ende Importbereich

public class A3_main {
    /*
     * Start des Deklarationsbereichs. Achten Sie unbedingt darauf, dass vor jeder
     * Variablendeklaration das Schluesselwort static steht.
     */

 static int[] numbers = new int[]{1};
 static int max=1;
 static int minIndex=2;

    /*
     * Ende des Deklarationsbereichs.
     */

    public static void main(String[] args) {
        /*
         * Start des algorithmischen Bereichs.
         */


        int l = numbers.length;

        if (l == 0) {
            max = numbers[0];
            minIndex = 0;
        }


        max = numbers[0];
        for (int i = 0; i < l; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                minIndex = i;
            } else if (numbers[i] == max) {
                minIndex = Math.min(minIndex, i);
            }
        }



        /*
         * Hier endet der algorithmische Bereich. Dieser Kommentar und damit alles, was
         * darunter steht, darf verschoben werden (wenn Sie zum Beispiel mehr Zeilen
         * brauchen).
         *
         * Alles, was hinter diesem Kommentar steht, darf nicht veraendert werden!
         *
         */

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Groesster Wert: " + max);
        System.out.println("Zugehoeriger Index: " + minIndex);
    }

}


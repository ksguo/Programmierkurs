package PBL04_a4;

//Start Importbereich, nicht aendern, nicht loeschen
import java.util.Arrays;
//Ende Importbereich

public class A4_main {
    /*
     * Start des Deklarationsbereichs. Achten Sie unbedingt darauf, dass vor jeder
     * Variablendeklaration das Schluesselwort static steht.
     */

    static double[][] einheiten = new double[][] {{500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};

    static double input = 2.08;

    /*
     * Ende des Deklarationsbereichs.
     */

    public static void main(String[] args) {
        /*
         * Start des algorithmischen Bereichs.
         */


        for(int i = 0;i <einheiten[0].length;i++){
            int count = 0;
            while(input - einheiten[0][i]*(count+1)>=0){
                count ++;
            }
            //首先遍历到能够使得input大于面值的地方 比如到10然后
            //然后下面更新input的值然后继续贱继续增加次数
            input = (input*1000000000 - (einheiten[0][i]*count)*1000000000)/1000000000;
            //把更新的次数更新在第二行中
            einheiten[1][i] = einheiten[1][i]+count;

        }




        /*
         * Hier endet der algorithmische Bereich. Dieser Kommentar und damit alles, was
         * darunter steht, darf verschoben werden (wenn Sie zum Beispiel mehr Zeilen
         * brauchen).
         *
         * Alles, was hinter diesem Kommentar steht, darf nicht veraendert werden!
         *
         */

        System.out.println("Betraege: " + Arrays.toString(einheiten[0]));
        System.out.println("Anzahl: " + Arrays.toString(einheiten[1]));

    }

}


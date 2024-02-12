package PBL01_a4;

public class A4_main {

    /*
     * Start des Deklarationsbereichs. Achten Sie unbedingt darauf, dass vor jeder
     * Variablendeklaration das Schluesselwort static steht.
     */


    static int i =10,j=2,k=1,min=4,max=5;



    /*
     * Ende des Deklarationsbereichs.
     */


    public static void main(String[] args) {
        /*
         * Start des des algorithmischen Teils.
         */

        //find max
       int max = i;
       if(j>max){
           max = j;
       }
       if(k >max){
           max = k;
       }
       //find min
        int min = i;
       if(j< min){
           min = j;
       }
       if(k< min){
           min =k;
       }





        /*
         *
         * Hier endet der algorithmische Teil. Dieser Kommentar darf verschoben werden
         * (wenn Sie zum Beispiel mehr Zeilen brauchen).
         *
         * Alles, was hinter diesem Kommentar steht, darf nicht veraendert werden!
         *
         */



        System.out.println("Wert von i, j und k: " + i + " " + j + " " + k);
        System.out.println("Wert von max: " + max);
        System.out.println("Wert von min: " + min);

    }
}


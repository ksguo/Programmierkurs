package PBL02_a1;

public class A1_main {

    /*
     * Start des Deklarationsbereichs. Achten Sie unbedingt darauf, dass vor jeder
     * Variablendeklaration das Schluesselwort static steht.
     */

    static int allSeconds = 1234;
    static int hours = 100;
    static int minutes = 100;
    static int seconds = 100;



    /*
     * Ende des Deklarationsbereichs.
     */
    public static void main(String[] args) {
        /*
         * Start des algorithmischen Bereichs.
         */

    if(allSeconds < 0){
        hours = -1;
        minutes = -1;
        seconds = -1;
    }else {


        hours = allSeconds / 3600;
        minutes = (allSeconds -hours*3600)/60;
        seconds = allSeconds-hours*3600-minutes*60;


    }

        /*
         * Hier endet der algorithmische Bereich. Dieser Kommentar und damit alles, was
         * darunter steht, darf verschoben werden (wenn Sie zum Beispiel mehr Zeilen
         * brauchen).
         *
         * Alles, was hinter diesem Kommentar steht, darf nicht veraendert werden!
         *
         */

        System.out.println("hours hat den Wert: " + hours);
        System.out.println("minutes hat den Wert: " + minutes);
        System.out.println("seconds hat den Wert: " + seconds);

    }

}


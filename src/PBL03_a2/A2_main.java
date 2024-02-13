package PBL03_a2;

public class A2_main {

    /*
     * Start des Deklarationsbereichs. Achten Sie unbedingt darauf, dass vor jeder
     * Variablendeklaration das Schluesselwort static steht.
     */

    static boolean x = false;
    static boolean y = false;
    static boolean a = false;
    static boolean b = false;
    static boolean c = true;
    static int input = 10;


    /*
     * Ende des Deklarationsbereichs.
     */
    public static void main(String[] args) {
        /*
         * Start des algorithmischen Bereichs.
         */

    if(input == 10 || input == 11){
        x = true;
    }
    if(input == 11 || input == 1){
        y =true;
    }

    boolean E1 = x;
    boolean E2 = y;
    boolean E3 =  x != y;

        if(E1 && E2) {
            a = true;
        }else {
            a =false;
        }
        if(E1 || E3) {
            b = true;
        }else {
            b = false;
        }

        if(E1 && E2) {
            c = false;
        }else if (E1 && !E2) {
            c = true;
        }else if(!E1 && E2){
            c = false;
        }else if(!E1 && !E2) {
            c = true;
        }else {
            c =false;
        }






        /*
         * Hier endet der algorithmische Bereich. Dieser Kommentar und damit alles, was
         * darunter steht, darf verschoben werden (wenn Sie zum Beispiel mehr Zeilen
         * brauchen).
         *
         * Alles, was hinter diesem Kommentar steht, darf nicht veraendert werden!
         *
         */

        System.out.println("Wert von x: " + x);
        System.out.println("Wert von y: " + y);
        System.out.println("Wert von a: " + a);
        System.out.println("Wert von b: " + b);
        System.out.println("Wert von c: " + c);

    }

}


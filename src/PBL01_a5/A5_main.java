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
        布尔变量的默认值是针对类的成员变量或实例变量的情况，
        确实，默认值为false。但在您的代码示例中，A1、A2和A3是基于特定条件动态计算得出的，
        而不是未经初始化的变量。这些变量的值取决于它们各自的比较表达式（i > j、i > 200、j > 100），
        而不是默认值。
         */

/*
if (i > j) { // Ausdruck 1
     if (!(i > 200) && !(j > 100)) { // Ausdruck 2 und Ausdruck 3 sind nicht wahr
                k = 1;
         } else if (i > 200 && !(j > 100)) { // Ausdruck 2 ist wahr und Ausdruck 3 ist nicht wahr
                k = 2;
        } else if (i > 200 && j > 100) { // Ausdruck 2 und Ausdruck 3 sind wahr
                k = 3;
        }
        } else if (!(i > j) && !(i > 200) && !(j > 100)) { // Alle drei Ausdrücke sind nicht wahr
            k = 4;
        } else {
            k = -10; // In allen anderen Fällen
        }

 */







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

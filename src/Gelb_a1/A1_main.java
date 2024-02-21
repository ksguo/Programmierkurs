package Gelb_a1;

public class A1_main {

    public static void main(String[] args) {

        // Test cases from the examples provided
        int[] result1 = compareMe(2, new int[]{8, 5, 8, 7, 3}, new int[]{4, 3, 3, 5, 8});
        int[] result2 = compareMe(2, new int[]{8, 5, 8, 7, 3}, new int[]{4, 3, 3, 5});

        // Printing out the results for verification
        System.out.println("Result 1:");
        for (int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println("\nResult 2:");
        for (int i : result2) {
            System.out.print(i + " ");
        }

        // Beispiele
        int x1 = 4;
        int[] y1 = {6,3,1,7,4,3,4};
        System.out.println(check(x1, y1)); // Erwarteter Output: true

        int x2 = 2;
        int[] y2 = {6,9,4,6};
        System.out.println(check(x2, y2)); // Erwarteter Output: false

    }
    public static int[] compareMe(int w, int[] x, int[] y){

        if (x==null) return new int[0];
        int[] z = new int[x.length];
               if(x.length <= y.length){
                   for(int i = 0;i<x.length;i++){
                       z[i] = x[x.length-1-i];
                   }
               }
               if(x.length > y.length){
                   for(int i =0;i<y.length ;i++){
                       z[i] = y[i];

                   }
                   for (int i = y.length; i < z.length; i++) {
                       z[i] = w;
                   }

               }
    return  z;
    }


    public static boolean check(int x, int[] y) {
        // Durchlaufen jedes Index i im Array y
        for (int i = 0; i < y.length; i++) {
            // Überprüfen, ob ein vergleichender Index (x+i) im Array existiert
            if (x + i < y.length) {
                // Ermitteln des Wertunterschieds zwischen den Werten an den Indizes i und x+i
                int diff = y[x + i] - y[i];

                // Wenn der Unterschied kleiner als -2 oder größer als 2 ist, wird false zurückgegeben
                if (diff < -2 || diff > 2) {
                    return false;
                }
            }
        }
        // Wenn alle Vergleiche die Bedingung erfüllen, wird true zurückgegeben
        return true;
    }


}

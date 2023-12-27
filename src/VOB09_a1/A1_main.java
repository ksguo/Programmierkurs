package VOB09_a1;

import java.util.Arrays;

public class A1_main {

    public static void main(String[] args) {

        Dominostein d1 = new Dominostein(1, 3);
        Dominostein d2 = new Dominostein(6, 10);
        Dominostein d3 = new Dominostein(4, 5);
        Dominostein d4 = new Dominostein(1, 1);
        Dominostein d5 = new Dominostein(2, 4);
        Dominostein d6 = new Dominostein(3, -3);
        Dominostein d7 = new Dominostein(5, 6);
        Dominostein d8 = new Dominostein(1, 4);
        Dominostein d9 = new Dominostein(1, 3);
        Dominostein d10 = new Dominostein(1, 3);

        Dominostein[] vorrat = {d1,d2,d3,d4,d5,d6,d7,d8,d9,d10};
        Dominostein[] tisch = new Dominostein[10];

        Spiel spiel = new Spiel(vorrat, tisch);

        System.out.println(Arrays.toString(spiel.getTisch()));
        System.out.println('\n');

        for(int i=0 ; i < 10 ; i++) {

            spiel.macheZug();

            System.out.println("Tisch:" + Arrays.toString(spiel.getTisch()));
            System.out.println("Vorrat:" + Arrays.toString(spiel.getVorrat()));
        }




    }
}

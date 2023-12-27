package VOB08_a2;

import java.util.Arrays;

public class A2_main {

    public static void main(String[] args) {

        LetterGame l = new LetterGame();
        int[] array1 = new int[]{6, 7, 23, 7};
        l.setWord(array1);
        System.out.println(l.word);

        int[] array2 = new int[]{14, 2, 0, 0, 19, 19};
        l.setWord(array2);
        System.out.println(l.word);

        String s = "UNI";
        l.findCode(s);
        System.out.println(Arrays.toString(l.a));

    }
}

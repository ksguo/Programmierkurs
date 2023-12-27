package VOB06_a3;

import java.util.Arrays;

public class A3_main {
    public static void main(String[] args){
        int[] arr = new int[]{ -1, 0, 1, 2};

        for (int i = 0 ; i < arr.length ; i++){
            if( arr[i] % 2 != 0){
                arr[i] = 2* arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));

    }

}

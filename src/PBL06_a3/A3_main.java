package PBL06_a3;

import java.util.Arrays;

public class A3_main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(change(new int[]{2, 7, 1, 9}, new int[]{5, 6, 7}, 2, 4)));
        System.out.println(Arrays.toString(change(new int[]{2, 7, 1, 9}, new int[]{2, 7, 1, 9}, 2, 4)));
        System.out.println(Arrays.toString(change(new int[]{2, 7, 1, 9}, new int[]{2, 7, 1, 9}, 3, 2)));


    }

    public static int[] change(int[] a, int[] b, int start, int end){

        if(end > start){
            if(Arrays.equals(a,b)){
                Arrays.sort(a);
                a = Arrays.copyOfRange(a,start,end);
                return a;
            }else {

                return Arrays.copyOf(a,a.length);
            }
        }else{
            int[] c = new int[]{};
            return c;
        }


    }

}

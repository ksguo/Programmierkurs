package PBL05_a3;

import java.util.Arrays;

public class A3_main {


    public static void main(String[] args) {

        String str = "Hallo";
        double[] arr = toDoubleArray(str);
      System.out.println(Arrays.toString(arr));

    }


    public static double[] toDoubleArray(String s){
        double[] arr = new double[s.length()];
        for(int i = 0 ; i< arr.length;i++){
            arr[i] = (double) s.charAt(i);
        }
        return arr;
    }
}

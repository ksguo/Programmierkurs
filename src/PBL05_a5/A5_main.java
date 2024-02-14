package PBL05_a5;

import java.util.Arrays;

public class A5_main {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{1,2,4};
        int[] arr3 = new int[]{1,3,2};
        int[] arr4 = new int[]{1,2};
        int[] arr5 = new int[]{1,2,3};
        int[] arr6 = new int[]{1,1,2};
        boolean b1 = compareArraysVal(arr1,arr4);
        boolean b2 = compareArraysVal(arr1,arr2);
        boolean b3 = compareArraysVal(arr1,arr5);
        System.out.println("arr1 compare to arr4 " + b1);
        System.out.println("arr1 compare to arr2 " + b2);
        System.out.println("arr1 compare to arr5 " + b3);

    }

    public static boolean compareArraysVal(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        if(a == null || b==null){
            return false;
        }
        if(a.length != b.length){
            return false;
        }
        for(int i = 0; i< a.length;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;

    }

}

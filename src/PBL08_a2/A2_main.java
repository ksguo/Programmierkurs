package PBL08_a2;

import java.util.Arrays;
public class A2_main {

    public static void main(String[] args){

        int[] a = new int[]{1,2,5};
        int[] b = new int[]{2,8,3};
        int[] c = new int[]{2,5,5,0,2};

        int[] arr = unionSimple(a,b,c);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = cutSimple(a,b,c);
        System.out.println(Arrays.toString(arr2));

    }

    public static int[] unionSimple(int[] a, int[] b, int[] c){

        int[] combina = concatenateArrays(a,b,c);//用concaten的方法合并数组


            for(int i = 0;i<combina.length;i++){
                for(int j = i+1 ; j<combina.length;j++){
                    if(combina[i] == combina[j]){
                        combina[j]=0;
                    }
                }

            }
            return combina;
    }


    public static int[] cutSimple(int[] a, int[] b, int[] c){
        int[] combina2 = concatenateArrays(a,b,c);



        for(int i =0;i<combina2.length;i++){
            boolean isInAll = existsInAll(combina2[i], a, b, c);
            if(!isInAll){
                combina2[i]=0;
            }

        }

            return combina2;
    }


    //hilfsmethod
    // 检查一个元素是否在所有给定的数组中出现
    private static boolean existsInAll(int element, int[] a, int[] b, int[] c) {
        return existsIn(element, a) && existsIn(element, b) && existsIn(element, c);
    }

    // 检查元素是否在一个数组中出现
    private static boolean existsIn(int element, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }







    public  static  int[] concatenateArrays(int[] x, int[] y, int[] z){
        int[] concat = new int[x.length + y.length + z.length];
        for(int i=0;i<x.length ;i++){
            concat[i] = x[i];
        }
        for(int i =0;i< y.length;i++){
            concat[i+x.length] = y[i];
        }
        for(int i = 0;i<z.length;i++){
            concat[i+x.length+y.length] = z[i];
        }
        return concat;
    }


}

package PBL08_a1;

public class A1_main {

    public static void main(String[] args){

    }

    public static int countLongestRow(int[][] a){


        int max = 0 ;
        for (int i =0; i< a.length ; i++){
            if(a[i].length > max)
                max = a[i].length;
        }
        return max;

    }
}

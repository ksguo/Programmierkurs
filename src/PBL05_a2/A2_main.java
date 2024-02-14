package PBL05_a2;

public class A2_main {


    public static void main(String[] args) {
    int[] test1 = new int[]{1,2,5,6};
    System.out.println(pairwiseDifferent(test1));

        int[] test2 = new int[]{7,3,4,3};
        System.out.println(pairwiseDifferent(test2));

    }



    public static boolean pairwiseDifferent(int[] someNumbers){


        for (int  i = 0;i < someNumbers.length;i++){
            for(int j = i+1;j< someNumbers.length;j++){
                if(someNumbers[i] == someNumbers[j]){
                   return false;
                }
            }
        }

        return true;

    }

}

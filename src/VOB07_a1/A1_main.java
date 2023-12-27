package VOB07_a1;

public class A1_main {

    public static void main(String[] args){
        int[] arr1= new int[]{1,-4,-5,5,-2};


        System.out.println("the secMax value is : " + method(arr1));

    }


    public static int method(int[] array){

        if (array == null || array.length < 2) {
            return -1;
        }

        int Max = -1;
        int secMax = -1;
        for(int i  = 0; i < array.length ; i++){
            if(Max < Math.abs(array[i])){
                Max = array[i];
            }
        }
        for(int j= 0; j<array.length; j++){
            if(secMax < Math.abs(array[j]) && Math.abs(array[j]) < Max){
                secMax = Math.abs(array[j]);
            }
        }
    return secMax;
    }
}

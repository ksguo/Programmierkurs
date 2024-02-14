package PBL05_a4;

public class A4_main {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{1,2,4};
        int[] arr3 = new int[]{1,3,2};
        int[] arr4 = new int[]{1,2};
        int[] arr5 = new int[]{1,2,3};
        boolean b1 = compareArrays(arr1,arr3);
        boolean b2 = compareArrays(arr1,arr2);
        boolean b3 = compareArrays(arr1,arr5);
        System.out.println("arr1 compare to arr3 " + b1);
        System.out.println("arr1 compare to arr2 " + b2);
        System.out.println("arr1 compare to arr5 " + b3);

    }

    public static boolean compareArrays(int[]a ,int[] b){
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

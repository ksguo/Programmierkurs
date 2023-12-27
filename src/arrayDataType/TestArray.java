package arrayDataType;

public class TestArray {

    public static void main(String[] args){

        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);


        double[] myList2 = new double[]{1.9, 2.9, 3.4, 3.5};

        //打印所有数组元素
        for(int i = 0 ; i< myList2.length; i++){
            System.out.println(myList2[i]);
        }

        //计算所有元素的和
        double sum = 0;
        for(int i = 0 ; i< myList2.length; i++){

            sum = sum + myList2[i];
        }
        System.out.println("sum is : " + sum);

        // 查找最大元素
        double max = 0 ;
        for(int i = 0 ; i< myList2.length; i++){
            if(max < myList2[i]){
                max = myList2[i];
            }
        }
        System.out.println("Max is " + max);


        //For-Each 循环

        double[] myList3 = new double[]{1.9, 2.9, 3.4, 3.5};
        for (double element : myList3) {
            System.out.println(element);
        }


        //数组可以作为参数传递给方法。
        int[] test_array = new int[]{1,2,3,4};
        printArray(test_array);

        // 数组作为函数的返回值

        // 创建一个测试数组
        int[] originalArray = {1, 2, 3, 4, 5};

        // 调用reverse方法
        int[] reversedArray = reverse(originalArray);

        // 打印原始数组
        System.out.println("Original Array:");
        for (int i : originalArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 打印反转后的数组
        System.out.println("Reversed Array:");
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
        System.out.println();

    //二维数组

        // 声明并初始化一个二维数组
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 使用嵌套循环打印二维数组
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // 换行打印下一行
        }


    }


    //数组可以作为参数传递给方法。
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // 数组作为函数的返回值
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

}

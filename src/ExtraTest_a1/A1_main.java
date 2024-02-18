package ExtraTest_a1;

import java.util.Arrays;

public class A1_main {

    public static void main(String[] args) {

        int[] a1 = {-1};
        int[] b1 = {1, 2};
        System.out.println(Arrays.toString(findSmall(a1, b1))); // 应该打印出 a1

        int[] a2 = {1};
        int[] b2 = {1, 2};
        System.out.println(Arrays.toString(findSmall(a2, b2))); // 应该打印出 b2

        int[] a3 = {1, 5, 6, 3, 7, 90};
        int[] b3 = {-8, 0};
        System.out.println(Arrays.toString(findSmall(a3, b3))); // 应该打印出 b3


        int[] myArray = {6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -20, -23, 5};

        System.out.println(pick(myArray, 0));  // 输出应为 -5
        System.out.println(pick(myArray, 12)); // 输出应为 -23
        System.out.println(pick(myArray, -5)); // 输出应为 6
        System.out.println(pick(myArray, 30)); // 输出应为 6

        System.out.println(iterate(601, -6));  // 输出应为 601
        System.out.println(iterate(60, 10));   // 输出应为 6000
        System.out.println(iterate(600, -6));  // 输出应为 21600
        System.out.println(iterate(-5, -25));  // 输出应为 71825
        System.out.println(iterate(577, 0));   // 输出应为 577
        System.out.println(iterate(-4, -1));   // 输出应为 -5
        System.out.println(iterate(-4, 70));   // 输出应为 66

    }


    public static int[] findSmall(int[] a, int[] b){
        int[] res;
        int minA = a[0];
        for(int i =0;i<a.length ;i++){

            if(a[i]< minA){
                minA = a[i];
            }

        }
        int minB = b[0];
        for(int i =0;i<b.length ;i++){

            if(b[i]< minB){
                minB = b[i];
            }

        }
        if(minA < minB ){

            return a;
        }

return  b;
    }



    public static int pick(int[] myArray, int start) {
        // 如果start不是有效的数组索引，则返回数组第一个元素的值
        if (start < 0 || start >= myArray.length) {
            return myArray[0];
        }

        int sum = 0;
        // 从start开始，每次递增4，直到数组结束
        for (int i = start; i < myArray.length; i += 4) {
            sum += myArray[i];
        }

        return sum;
    }


    public static int iterate(int start, int factor) {
        // (a) 如果start大于600，直接返回start
        if (start > 600) {
            return start;
        }

        // (b) 如果start小于等于600
        int result = start;

        // (1) 如果通过连续乘以factor可以使结果超过600
        while (Math.abs(result) <= 600) {
            result *= factor;
            // 一旦结果超过600，返回结果
            if (Math.abs(result) > 600) {
                return result;
            }
            // 如果factor是0或1或-1，则永远不会超过600，退出循环
            if (factor == 0 || factor == 1 || factor == -1) {
                break;
            }
        }

        // (2) 如果无法通过乘以factor使结果超过600
        // 返回start加上factor的和
        return start + factor;
    }
}

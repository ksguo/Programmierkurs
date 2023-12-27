package method;

public class methodDemo {

    public static void main(String[] args){

        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println( i + " 和 " + j + " 比较，最大值是：" + k);


        printGrade(78);
    }

    public static int max(int num1, int num2){
        int result;
        if(num1>num2){
            result = num1;
        }else{
            result = num2;
        }

        return result;
    }


    //void 关键字
    /*
    这里printGrade方法是一个void类型方法，它不返回值。

    一个void方法的调用一定是一个语句。 所以，它被在main方法第三行以语句形式调用。就像任何以分号结束的语句一样。
     */
    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        }
        else if (score >= 80.0) {
            System.out.println('B');
        }
        else if (score >= 70.0) {
            System.out.println('C');
        }
        else if (score >= 60.0) {
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }



    /*
    方法的重载
    上面使用的max方法仅仅适用于int型数据。但如果你想得到两个浮点类型数据的最大值呢？

     解决方法是创建另一个有相同名字但参数不同的方法，如下面代码所示：
     */

    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
}

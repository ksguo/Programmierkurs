package dataType;

public class PrimitiveTypeTest {
    //类型默认值
    static boolean bool;
    static byte by;
    static char ch;
    static double d;
    static float f;
    static int i;
    static long l;
    static short sh;
    static String str;

    public static void main(String[] args) {
        //byte
        System.out.println("the size of byte Type " + Byte.SIZE);
        System.out.println("the max value of the type of byte " + Byte.MAX_VALUE );
        System.out.println("the min value of the type of byte " + Byte.MIN_VALUE);

        //short
        System.out.println("the size of short Type " + Short.SIZE);
        System.out.println("the max value of the type of short " + Short.MAX_VALUE );
        System.out.println("the min value of the type of short " + Short.MIN_VALUE);

        // int
        System.out.println("the size of int Type " + Integer.SIZE);
        System.out.println("the max value of the type of int " + Integer.MAX_VALUE );
        System.out.println("the min value of the type of int " + Integer.MIN_VALUE);
        //long
        System.out.println("the size of long Type " + Long.SIZE);
        System.out.println("the max value of the type of long " + Long.MAX_VALUE );
        System.out.println("the min value of the type of long " + Long.MIN_VALUE);

        //float
        System.out.println("the size of float Type " + Float.SIZE);
        System.out.println("the max value of the type of float " + Float.MAX_VALUE );
        System.out.println("the min value of the type of float " + Float.MIN_VALUE);
        //double

        System.out.println("the size of double Type " + Double.SIZE);
        System.out.println("the max value of the type of float " + Double.MAX_VALUE );
        System.out.println("the min value of the type of float " + Double.MIN_VALUE);

        //char
        System.out.println("the size of char Type " + Character.SIZE);
        System.out.println("the max value of the type of char " +(int) Character.MAX_VALUE );
        System.out.println("the min value of the type of char " +(int) Character.MIN_VALUE);


        //每个类型的默认值
        System.out.println("Bool :" + bool);
        System.out.println("Byte :" + by);
        System.out.println("Character:" + ch);
        System.out.println("Double :" + d);
        System.out.println("Float :" + f);
        System.out.println("Integer :" + i);
        System.out.println("Long :" + l);
        System.out.println("Short :" + sh);
        System.out.println("String :" + str);

    }

    /*
    从小到大是自动转换的：
    byte,short,char—> int —> long—> float —> double
    数据类型转换必须满足如下规则：

        1. 不能对boolean类型进行类型转换。

        2. 不能把对象类型转换成不相关类的对象。

        3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。

        4. 转换过程中可能导致溢出或损失精度
     */
}

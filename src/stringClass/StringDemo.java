package stringClass;

public class StringDemo {
    public static void main(String[] args) {
        String site = "www.rootspike.com";

        int length = site.length();
        System.out.println("菜鸟教程网址长度 : " + length);


        String string1 = "菜鸟教程网址：";
        System.out.println("1、" + string1 + site);


        // 创建格式化字符串
        String formattedStr = String.format("Name: %s, Age: %d", "Alice", 30);

        // 使用格式化字符串
        System.out.println(formattedStr);
        // 可以重复使用相同的字符串
        System.out.println(formattedStr);


        //string类的一些方法

        String myStr1 = "Runoob";
        String myStr2 = "";        // 空字符串
        String myStr3 = "    ";    // 多个空格，length() 不为 0
        System.out.println("myStr1 是否为空：" + myStr1.isEmpty());
        System.out.println("myStr2 是否为空：" + myStr2.isEmpty());
        System.out.println("myStr3 长度：" + myStr3.length());
        System.out.println("myStr3 是否为空：" + myStr3.isEmpty());
    }
    }


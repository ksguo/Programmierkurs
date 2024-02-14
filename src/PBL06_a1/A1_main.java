package PBL06_a1;

public class A1_main {

    public static void main(String[] args) {

    String s= "2022010";
    int i = extractMonth(s);
    System.out.println(i);

    }

    public static int extractMonth(String s){
        if(s.length() != 8){
            return -1;
        }
        s = s.substring(4,6);//返回一个新的字符串，它是此字符串的一个子字符串，从指定的beginIndex开始，直到索引endIndex - 1处的字符
        //所以5和6处的字符index就是从4开始到6-1处
        int i = Integer.parseInt(s);
        if(i>= 1 && i <= 12){
            return i;
        }else{
            return -1;
        }

    }

}

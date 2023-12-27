package VOB04_a2;

public class A2_main {

    public static void main(String[] args){
        int a =-3;
        a = Math.abs(a);
        System.out.println(a);
        int qua;
        qua =  a*a;
        System.out.println(qua);

        if(a % 2 == 0){
            System.out.println("a ist gerade");
        }else {
            System.out.println("a ist ungerade");
        }
    }
}

package VOB04_a1;

public class A1_main {

    public static void main(String[] args){
        int a=3 ,b=4,c=20,d=4;
        boolean E1 = a==b;
        boolean E2 = a==b || a==c;
        boolean E3 = (a+b)>= c;
        boolean E4 = a+b+c >= 100;

        d =0;

        if(a==b){
            d++;
        }
        if(a==b || a==c){
            d++;
        }
        if((a+b)>= c){
            d++;
        }
        if(a+b+c >= 100){
            d++;
        }

        System.out.println(d);


    }
}

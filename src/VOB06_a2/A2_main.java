package VOB06_a2;

public class A2_main {

    public static void main(String[] args){

        int x=0;
        while ( x <= 10 ) {
            x = x + 1;
            System.out.println(x);

        }
        System.out.println("-----------");

        int y = 0;
        for(int i = 0; i < 11 ;i++){
            y = y+1;
            System.out.println(y);
        }

        System.out.println("-----------");

        int z = 0;
        do{
            z++;
            System.out.println(z);
        }while(z < 11);

    }
}

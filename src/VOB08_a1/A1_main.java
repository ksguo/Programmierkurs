package VOB08_a1;

public class A1_main {

    public static void main(String[] args) {

        multFrac(5,2,3,4);
        Bruch a =  new Bruch(5,2);
        Bruch b = new Bruch(4,4);



        multFrac2(a,b);
        System.out.println(multFrac2(a,b));



    }

    public static void multFrac(int z1, int n1, int z2, int n2){
        int z = z1*z2;
        int n = n1*n2;
        System.out.println(z +":" +n);
    }

    public static Bruch multFrac2(Bruch a,Bruch b){
        int z = a.z*b.z;
        int n = a.n*b.n;


        return new Bruch(z,n);
    }


}

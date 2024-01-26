package VOB13_a3;

public class A3_main {


    public  static void main(String[] args){

    }



    public static int rekursiverAbstand(Knoten x, Knoten y){
        if(x==y){
            return 0;
        }else{
            return 1 + rekursiverAbstand(x.nach , y);
        }
    }
}

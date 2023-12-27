package VOB03_a1;
import  java.util.Random;

public class A1_main {

    public static void main(String[] args){
       // int wuerfel = 7;

        // oder
        Random random = new Random();
        int wuerfel = random.nextInt(6) + 1 ;

        System.out.println("Ihre Wuerfel Punkte ist " + wuerfel);
        if(wuerfel == 1 || wuerfel == 4){
            System.out.println("Gewonnen!");
        }else if (wuerfel ==2 ){
            System.out.println("Verloren!");
        }else if (wuerfel == 5){
            System.out.println("Unentschieden!");
        }else{
            System.out.println("Unklar!");
        }
    }
}

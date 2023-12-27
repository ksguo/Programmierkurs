package VOB05_a1;

public class A1_main {

    public static void main(String[] args){

        //with switch case
        int punktzahl = 0;
        switch(punktzahl / 10){
            case 10,9:
                System.out.println("Note: A");
                break;
            case 8:
                System.out.println("Note: B");
                break;
            case 7:
                System.out.println("Note: C");
                break;
            case 6:
                System.out.println("Note: D");
                break;
            default:
                System.out.println("Note: F");
                break;
        }

        // with if-else

        int punktzahl2 = 60;
        if(punktzahl2>= 90) {
            System.out.println("Note: A");
        }else if (punktzahl2 >= 80 && punktzahl2 <= 89) {
            System.out.println("Note: B");
        }else if (punktzahl2 >= 70 && punktzahl2 <= 79) {
            System.out.println("Note: C");
        }else if (punktzahl2 >= 60 && punktzahl2 <= 69) {
            System.out.println("Note: D");
        }else {
            System.out.println("Note: F");
        }


    }
}

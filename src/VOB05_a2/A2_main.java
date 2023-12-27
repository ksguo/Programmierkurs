package VOB05_a2;

public class A2_main {

    public static void main(String[] args){
        int stockwerk =0;

        switch (stockwerk){
            case 0 :
                System.out.println("Angebote");
                break;
            case 1:
                System.out.println("Damenbekleidung");
                break;
            case 2 :
                System.out.println("Herrenbekleidung");
                break;
            case 3:
                System.out.println("Kinderbekleidung");
                break;
            case -1:
                System.out.println("Parkhaus");
                break;
            default:
                System.out.println("unbekannt");
                break;
        }

        int stockwerk2 =1;

        switch (stockwerk2){
            case 0 :
                System.out.println("Angebote");
                break;
            case 1:
                System.out.println("Damenbekleidung");
                System.out.println("Angebote");
                break;
            case 2 :
                System.out.println("Herrenbekleidung");
                System.out.println("Damenbekleidung");
                System.out.println("Angebote");
                break;
            case 3:
                System.out.println("Kinderbekleidung");
                System.out.println("Herrenbekleidung");
                System.out.println("Damenbekleidung");
                System.out.println("Angebote");
                break;
            case -1:
                System.out.println("Parkhaus");
                break;
            default:
                System.out.println("unbekannt");
                break;
        }
    }
}

package PBL06_a2;

public class A2_main {

    public static void main(String[] args) {

        Zahl zahl = new Zahl();

        zahl.num = -100;
        zahl.setEven();
        zahl.setPositive();
        zahl.setSmall();

        System.out.println("num is even " + zahl.even);
        System.out.println("num is pos " + zahl.positive);
        System.out.println("num is small " + zahl.small);


    }
}

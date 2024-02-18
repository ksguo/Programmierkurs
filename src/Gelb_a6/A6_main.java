package Gelb_a6;

public class A6_main {


    public static void main(String[] args) {

        Offer offer1 = new Offer();
        System.out.println("Full: " + offer1.getFull() + ", Pro: " + offer1.getPro());
        offer1.setFull(80);
        offer1.findPercent(2);
        System.out.println("Full: " + offer1.getFull() + ", Pro: " + offer1.getPro());
        Offer offer2 = new Offer();

        System.out.println(offer2.giveDiscount(10));
        System.out.println(offer2.giveDiscount(60));
        System.out.println(offer2.giveDiscount(100));
    }
}

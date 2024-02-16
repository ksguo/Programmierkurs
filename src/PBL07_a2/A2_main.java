package PBL07_a2;

public class A2_main {

    public static void main(String[] args) {
        Betrag betrag = new Betrag(10 ,200);

        System.out.println(betrag.getEuro());
        System.out.println(betrag.getCent());

        Betrag a = new Betrag(13,80);
        Betrag b = new Betrag(17,34);

        System.out.println(summe(a,b));


    }

    public static Betrag summe(Betrag a, Betrag b){
        int gesamtEuro;
        int gesamtCent;
        gesamtEuro   = a.getEuro()+b.getEuro();
        gesamtCent = a.getCent()+b.getCent();

        return new Betrag(gesamtEuro,gesamtCent) ;
    }



}

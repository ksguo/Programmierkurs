package PBL07_a1;

public class A1_main {

    public static void main(String[] args) {
        // Erstellen von Etikett-Objekten
        Etikett etikett1 = new Etikett(10, 20, 1);
        Etikett etikett2 = new Etikett(15, 25, 2);
        Etikett etikett3 = new Etikett(0, 30, 3); // Dies wird countEti nicht erhöhen, da ein Wert 0 ist.

        // Anzeigen der Etikett-Details und der Anzahl der erstellten Etiketten
        System.out.println("Etikett 1: Size = " + etikett1.getSize() + ", Price = " + etikett1.getPrice() + ", ID = " + etikett1.getId());
        System.out.println("Etikett 2: Size = " + etikett2.getSize() + ", Price = " + etikett2.getPrice() + ", ID = " + etikett2.getId());
        System.out.println("Etikett 3: Size = " + etikett3.getSize() + ", Price = " + etikett3.getPrice() + ", ID = " + etikett3.getId());

        // Anzeigen der Gesamtanzahl der (gültig) erstellten Etiketten
        System.out.println("Gesamtanzahl der erstellten Etiketten (countEti): " + Etikett.countEti);


    }
}
